package com.devcircus.java.algorithms.sort.bitonic;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BitonicTest extends BaseSortTest{

    private Bitonic sortter;
    
    @Before
    public void setUp() {
        sortter = new Bitonic();
    }
    
    @Test
    public void testSortWithIntegers() {
        Integer [] arrayToSort = getIntegerArrayToSort();
        int arrayToSortLenght = arrayToSort.length;
        int up = 1;
        assertArrayEquals(sortter.sort(arrayToSort, arrayToSortLenght, up), getSortedIntegerArray());
    }
}
