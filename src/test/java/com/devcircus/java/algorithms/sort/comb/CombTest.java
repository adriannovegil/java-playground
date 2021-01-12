package com.devcircus.java.algorithms.sort.comb;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class CombTest extends BaseSortTest{

    private Comb sortter;
    
    @Before
    public void setUp() {
        sortter = new Comb();
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
