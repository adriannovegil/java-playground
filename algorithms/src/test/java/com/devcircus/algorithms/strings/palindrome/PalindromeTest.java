package com.devcircus.algorithms.strings.palindrome;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void shouldAcceptWhenNullIsPassed() {
        String expectedWord = null;
        assertTrue(Palindrome.isPalindrome(expectedWord));
    }

    @Test
    public void shouldAcceptWhenEmptyStringIsPassed() {
        String expectedWord = "";
        assertTrue(Palindrome.isPalindrome(expectedWord));
    }

    @Test
    public void shouldAcceptNotWhenWhenSingleCharacterIsPassed() {
        String expectedWord = "a";
        assertTrue(Palindrome.isPalindrome(expectedWord));
    }

    @Test
    public void shouldAcceptWhenStringIsPassed() {
        String expectedWord = "kayak";
        assertTrue(Palindrome.isPalindrome(expectedWord));
    }

    @Test
    public void shouldAcceptWhenStringWithSpacesIsPassed() {
        String expectedWord = "Hello olleH";
        assertTrue(Palindrome.isPalindrome(expectedWord));
    }

    @Test
    public void shouldAcceptWhenNumericStringIsPassed() {
        String expectedWord = "123321";
        assertTrue(Palindrome.isPalindrome(expectedWord));
    }
    
    @Test
    public void shouldNotAcceptWhenNotPalindromeIsPassed() {
        String expectedWord = "abc123";
        assertFalse(Palindrome.isPalindrome(expectedWord));
    }
}
