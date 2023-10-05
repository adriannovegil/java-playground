package com.devcircus.algorithms.strings.palindrome;

import com.devcircus.algorithms.strings.StringAlgorithm;
import java.util.stream.IntStream;

/**
 * Wikipedia: https://en.wikipedia.org/wiki/Palindrome
 *
 * A palindromic string is one which reads the same when it is reversed. The
 * program below checks whether a string is palindromic. Rather than creating a
 * new string for the reverse of the input string, it traverses the inputstring
 * forwards and backwards, thereby saving space. Notice how it uniformly handles
 * even and odd length strings.
 */
class Palindrome implements StringAlgorithm {

    /**
     * Check if a string is palindrome string or not using String Builder
     *
     * @param s a string to check
     * @return {@code true} if given string is palindrome, otherwise
     * {@code false}
     */
    public static boolean isPalindrome(String s) {
        return ((s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString()));
    }

    /**
     * Check if a string is palindrome string or not using recursion
     *
     * @param s a string to check
     * @return {@code true} if given string is palindrome, otherwise
     * {@code false}
     */
    public static boolean isPalindromeRecursion(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindromeRecursion(s.substring(1, s.length() - 1));
    }

    /**
     * Check if a string is palindrome string or not using two pointer technique
     *
     * @param s a string to check
     * @return {@code true} if given string is palindrome, otherwise
     * {@code false}
     */
    public static boolean isPalindromeTwoPointer(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * We can also use an IntStream to provide a solution:
     *
     * @param s a string to check
     * @return {@code true} if given string is palindrome, otherwise
     * {@code false}
     */
    public static boolean isPalindromeStreams(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        String temp = s.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
