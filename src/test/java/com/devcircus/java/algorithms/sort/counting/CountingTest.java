package com.devcircus.java.algorithms.sort.counting;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class CountingTest extends BaseSortTest{

    private Counting sortter;
    
    @Before
    public void setUp() {
        sortter =  new Counting();
    }
    
    @Test
    public void testSortWithIntegers() {
        assertArrayEquals(sortter.sort(getIntegerArrayToSort()), getSortedIntegerArray());
    }

    @Test
    public void testSortWithStrings() {
        assertArrayEquals(sortter.sort(getStringArrayToSort()), getSortedStringArray());
    }
}