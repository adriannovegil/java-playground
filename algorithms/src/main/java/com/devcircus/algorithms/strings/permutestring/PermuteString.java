package com.devcircus.algorithms.strings.permutestring;

import com.devcircus.algorithms.strings.StringAlgorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.iterators.PermutationIterator;
import com.google.common.collect.Collections2;
import org.paukov.combinatorics3.Generator;
import org.paukov.combinatorics3.PermutationGenerator.TreatDuplicatesAs;

/**
 * Backtracking algorithm used in the program:-
 *
 * >>Fix a character in the first position and swap the rest of the character
 * with the first character. Like in ABC, in the first iteration three strings
 * are formed: ABC, BAC, and CBA by swapping A with A, B and C respectively.
 *
 * >>Repeat step 1 for the rest of the characters like fixing second character B
 * and so on.
 *
 * >>Now swap again to go back to the previous position. E.g., from ABC, we
 * formed ABC by fixing B again, and we backtrack to the previous position and
 * swap B with C. So, now we got ABC and ACB.
 *
 * >>Repeat these steps for BAC and CBA, to get all the permutations.
 *
 */
public class PermuteString implements StringAlgorithm {

    // Function for generating different permutations of the string
    public static void permutationRecursion(List<String> permutations, String str, int start, int end) {
        // Prints the permutations
        if (start == end - 1) {
            permutations.add(str);
        } else {
            for (int i = start; i < end; i++) {
                // Swapping the string by fixing a character
                str = swapString(str, start, i);
                // Recursively calling function generatePermutation() for rest of the characters
                permutationRecursion(permutations, str, start + 1, end);
                // Backtracking and swapping the characters again.
                str = swapString(str, start, i);
            }
        }
    }

    // Function for swapping the characters at position I with character at position j
    private static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static List<String> permutationWithRepetitionsApache(final String string) {
        final List<Character> characters = Helper.toCharacterList(string);
        return CollectionUtils.permutations(characters)
                .stream()
                .map(Helper::toString)
                .collect(Collectors.toList());
    }

    public static List<String> permutationWithoutRepetitionsApache(final String string) {
        final List<Character> characters = Helper.toCharacterList(string);
        final PermutationIterator<Character> permutationIterator = new PermutationIterator<>(characters);
        final List<String> result = new ArrayList<>();
        while (permutationIterator.hasNext()) {
            result.add(Helper.toString(permutationIterator.next()));
        }
        return result;
    }

    public static List<String> permutationWithRepetitionsGuava(final String string) {
        final List<Character> characters = Helper.toCharacterList(string);
        return Collections2.permutations(characters).stream()
                .map(Helper::toString)
                .collect(Collectors.toList());
    }

    public static List<String> permutationWithoutRepetitionsGuava(final String string) {
        final List<Character> characters = Helper.toCharacterList(string);
        return Collections2.orderedPermutations(characters).stream()
                .map(Helper::toString)
                .collect(Collectors.toList());
    }

    public static List<String> permutationWithoutRepetitionsCombinatoricsLib(final String string) {
        List<Character> chars = Helper.toCharacterList(string);
        return Generator.permutation(chars)
                .simple()
                .stream()
                .map(Helper::toString)
                .collect(Collectors.toList());
    }

    public static List<String> permutationWithRepetitionsCombinatoricsLib(final String string) {
        List<Character> chars = Helper.toCharacterList(string);
        return Generator.permutation(chars)
                .simple(TreatDuplicatesAs.IDENTICAL)
                .stream()
                .map(Helper::toString)
                .collect(Collectors.toList());
    }
}
