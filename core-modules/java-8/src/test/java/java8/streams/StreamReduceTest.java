package java8.streams;

import java.util.Arrays;
import java.util.List;
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
}
