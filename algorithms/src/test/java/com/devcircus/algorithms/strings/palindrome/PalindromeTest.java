package com.devcircus.algorithms.strings.palindrome;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome() {

        String[] palindromes = {null, "", "aba", "123321", "kayak"};
        for (String s : palindromes) {
            assertTrue(Palindrome.isPalindrome(s)
                    && Palindrome.isPalindromeRecursion(s)
                    && Palindrome.isPalindromeTwoPointer(s)
                    && Palindrome.isPalindromeStreams(s));
        }

        String[] notPalindromes = {"abb", "abc", "abc123", "kayaks"};
        for (String s : notPalindromes) {
            assertFalse(Palindrome.isPalindrome(s)
                    || Palindrome.isPalindromeRecursion(s)
                    || Palindrome.isPalindromeTwoPointer(s)
                    || Palindrome.isPalindromeStreams(s));
        }
    }
}
