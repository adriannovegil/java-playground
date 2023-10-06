package com.devcircus.algorithms.strings.permutestring;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class PermuteStringTest {

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 120",
        "aaaaaa, 720"})
    void testPermutationRecursion(String string, int numberOfPermutations) {
        final List<String> permutations = new ArrayList<>();

        PermuteString.permutationRecursion(permutations, string, 0, string.length());

        final int size = permutations.size();
        assertThat(permutations)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .hasSize(numberOfPermutations);
    }

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 120",
        "aaaaaa, 720"})
    void testPermutationsWithRepetitionsApache(String string, int numberOfPermutations) {
        final List<String> permutations = PermuteString.permutationWithRepetitionsApache(string);
        final int size = permutations.size();
        assertThat(permutations)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .hasSize(numberOfPermutations);
    }

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 120",
        "aaaaaa, 720"})
    void testPermutationsWithoutRepetitionsApache(String string, int numberOfPermutations) {
        final List<String> permutations = PermuteString.permutationWithoutRepetitionsApache(string);
        int size = permutations.size();
        assertThat(size)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .isEqualTo(numberOfPermutations);
    }

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 120",
        "aaaaaa, 720"})
    void testPermutationsWithRepetitionsGuava(String string, int numberOfPermutations) {
        final List<String> permutations = PermuteString.permutationWithRepetitionsGuava(string);
        final int size = permutations.size();
        assertThat(permutations)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .hasSize(numberOfPermutations);
    }

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 60",
        "aaaaaa, 1"})
    void testPermutationsWithoutRepetitionsGuava(String string, int numberOfPermutations) {
        final List<String> permutations = PermuteString.permutationWithoutRepetitionsGuava(string);
        final int size = permutations.size();
        assertThat(permutations)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .hasSize(numberOfPermutations);
    }

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 120",
        "aaaaaa, 720"})
    void testPermutationsWithRepetitionsCombinatoricsLib(String string, int numberOfPermutations) {
        final List<String> permutations = PermuteString.permutationWithRepetitionsCombinatoricsLib(string);
        final int size = permutations.size();
        assertThat(permutations)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .hasSize(numberOfPermutations);
    }

    @ParameterizedTest
    @CsvSource({"abc, 6",
        "hello, 60",
        "aaaaaa, 1"})
    void testPermutationsWithoutRepetitionsCombinatoricsLib(String string, int numberOfPermutations) {
        final List<String> permutations = PermuteString.permutationWithoutRepetitionsCombinatoricsLib(string);
        final int size = permutations.size();
        assertThat(permutations)
                .as("\"%s\" should have %d permutation, but had %d", string, numberOfPermutations, size)
                .hasSize(numberOfPermutations);
    }

}
