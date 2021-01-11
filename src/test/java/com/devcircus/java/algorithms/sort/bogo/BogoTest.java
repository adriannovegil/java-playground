package com.devcircus.java.algorithms.sort.bogo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BogoTest {
    
    @Test
    public void testSortWithIntegers() {
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        Integer[] expectedIntegers = {1, 4, 6, 9, 12, 23, 54, 78, 231};
        Bogo bogoSort = new Bogo();
        assertArrayEquals(bogoSort.sort(integers), expectedIntegers);
    }
        
    @Test
    public void testSortWithStrings() {
        String[] strings = {"c", "a", "e", "b", "d"};
        String[] expectedStrings = {"a", "b", "c", "d", "e"};
        Bogo bogoSort = new Bogo();
        assertArrayEquals(bogoSort.sort(strings), expectedStrings);
    }
}
