package com.devcircus.java.algorithms.sort.radix;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class RadixTest extends BaseSortTest{

    private Radix sortter;
    
    @Before
    public void setUp() {
        sortter = new Radix();
    }
    
    @Test
    public void testSortWithIntegers() {
        Integer [] arrayToSort = getIntegersArray();
        int arrayToSortLenght = arrayToSort.length;
        assertArrayEquals(sortter.sort(arrayToSort, arrayToSortLenght), getExpectedIntegersArray());
    }
}
