package java8.streams;

import com.devcircus.coremodules.java8.common.modelo.Persona1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class StreamReduceTest {

    @Test
    public void givenIntegerList_whenReduceWithSumAccumulatorLambda_thenCorrect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        assertThat(result).isEqualTo(21);
    }

    @Test
    public void givenIntegerList_whenReduceWithSumAccumulatorMethodReference_thenCorrect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers.stream().reduce(0, Integer::sum);
        assertThat(result).isEqualTo(21);
    }

    @Test
    public void givenStringList_whenReduceWithConcatenatorAccumulatorLambda_thenCorrect() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters.stream().reduce("", (a, b) -> a + b);
        assertThat(result).isEqualTo("abcde");
    }

    @Test
    public void givenStringList_whenReduceWithConcatenatorAccumulatorMethodReference_thenCorrect() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters.stream().reduce("", String::concat);
        assertThat(result).isEqualTo("abcde");
    }

    @Test
    public void givenStringList_whenReduceWithUppercaseConcatenatorAccumulator_thenCorrect() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters.stream().reduce("", (a, b) -> a.toUpperCase() + b.toUpperCase());
        assertThat(result).isEqualTo("ABCDE");
    }

    @Test
    public void givenPersonaList_whenReduceWithGreaterAgeAccumulator_thenFindsOldest() {
        List<Persona1> personas = new ArrayList<>();
        personas.add(new Persona1(1, "P1", 10d, 1d, 40d));
        personas.add(new Persona1(2, "P2", 20d, 1.2, 50d));
        personas.add(new Persona1(3, "P3", 30d, 1.4, 60d));
        personas.add(new Persona1(4, "P4", 40d, 1.6, 70d));
        personas.add(new Persona1(5, "P5", 50d, 1.8, 80d));
        personas.add(new Persona1(6, "P6", 60d, 2d, 90d));

        AtomicInteger contador = new AtomicInteger(1);
        Optional<Persona1> pMedia = personas.stream().reduce((p1, p2) -> {
            p1.setId(0);
            p1.setNombre("Persona media");
            double totEdad = p1.getEdad() * contador.intValue() + p2.getEdad();
            double totAltura = p1.getAltura() * contador.intValue() + p2.getAltura();
            double totPeso = p1.getPeso() * contador.intValue() + p2.getPeso();
            contador.incrementAndGet();
            p1.setEdad(totEdad / contador.intValue());
            p1.setAltura(totAltura / contador.intValue());
            p1.setPeso(totPeso / contador.intValue());
            return p1;
        });

        //Persona [id=0, nombre=Persona media, edad=35.0, altura=1.5, peso=65.0]
        assertThat(pMedia.get().getEdad()).isEqualTo(35.0);
        assertThat(pMedia.get().getAltura()).isEqualTo(1.5);
        assertThat(pMedia.get().getPeso()).isEqualTo(65.0);
    }

    @Test
    public void givenStringList_whenReduceWithParallelStream_thenCorrect() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");

        String result = letters.parallelStream().reduce("", String::concat);

        assertThat(result).isEqualTo("abcde");
    }
}
