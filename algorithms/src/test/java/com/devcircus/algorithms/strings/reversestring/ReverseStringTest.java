package com.devcircus.algorithms.strings.reversestring;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void shouldAcceptWhenEmptyStringIsPassed() {
        String expected = "";
        String reversed = "";
        assertEquals(reversed, ReverseString.reverse(expected));
        assertEquals(reversed, ReverseString.reverseAsCharArray(expected));
        assertEquals(reversed, ReverseString.reverseRecursion(expected));
    }

    @Test
    public void shouldAcceptNotWhenWhenSingleCharacterIsPassed() {
        String expected = "a";
        String reversed = "a";
        assertEquals(reversed, ReverseString.reverse(expected));
        assertEquals(reversed, ReverseString.reverseAsCharArray(expected));
        assertEquals(reversed, ReverseString.reverseRecursion(expected));
    }

    @Test
    public void shouldAcceptWhenStringIsPassed() {
        String expected = "dlroWolleH";
        String reversed = "HelloWorld";
        assertEquals(reversed, ReverseString.reverse(expected));
        assertEquals(reversed, ReverseString.reverseAsCharArray(expected));
        assertEquals(reversed, ReverseString.reverseRecursion(expected));
    }
    
    @Test
    public void shouldAcceptWhenStringWithSpacesIsPassed() {
        String expected = "dlroW olleH";
        String reversed = "Hello World";
        assertEquals(reversed, ReverseString.reverse(expected));
        assertEquals(reversed, ReverseString.reverseAsCharArray(expected));
        assertEquals(reversed, ReverseString.reverseRecursion(expected));
    }
    
    @Test
    public void shouldAcceptWhenNumericStringIsPassed() {
        String expected = "987654321";
        String reversed = "123456789";
        assertEquals(reversed, ReverseString.reverse(expected));
        assertEquals(reversed, ReverseString.reverseAsCharArray(expected));
        assertEquals(reversed, ReverseString.reverseRecursion(expected));
    }
}
