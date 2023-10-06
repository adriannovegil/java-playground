package com.devcircus.algorithms.strings.lower;

import static org.junit.Assert.*;
import org.junit.Test;

public class LowerTest {

    @Test
    public void shouldAcceptWhenEmptyStringIsPassed() {
        String expected = "";
        String lowered = "";
        assertEquals(lowered, Lower.toLowerCase(expected));
    }

    @Test
    public void shouldAcceptNotWhenWhenSingleCharacterIsPassed() {
        String expected = "A";
        String lowered = "a";
        assertEquals(lowered, Lower.toLowerCase(expected));
    }

    @Test
    public void shouldAcceptWhenStringIsPassed() {
        String expected = "abcABC";
        String lowered = "abcabc";
        assertEquals(lowered, Lower.toLowerCase(expected));
    }

    @Test
    public void shouldAcceptWhenStringWithSpacesIsPassed() {
        String expected = "HelLO WoRld";
        String lowered = "hello world";
        assertEquals(lowered, Lower.toLowerCase(expected));
    }

    @Test
    public void shouldAcceptWhenNumericStringIsPassed() {
        String expected = "abc123ABC";
        String lowered = "abc123abc";
        assertEquals(lowered, Lower.toLowerCase(expected));
    }
}
