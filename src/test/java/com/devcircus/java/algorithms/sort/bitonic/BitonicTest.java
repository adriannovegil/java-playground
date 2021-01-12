package com.devcircus.java.algorithms.sort.bitonic;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import java.util.Arrays;
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
    public void testSortWithIntegerArrayWith2NCompatibleNumberOfElements() {
        Integer [] arrayToSort = getIntegersArrayWith2NCompatibleNumberOfElements();
        int arrayToSortLenght = arrayToSort.length;
        int up = 1;
        assertArrayEquals(sortter.sort(arrayToSort, arrayToSortLenght, up), getExpectedIntegersArrayWith2NCompatibleNumberOfElements());
    }
    
    @Test
    public void testSortWithoutIntegerArrayWith2NCompatibleNumberOfElements() {
        Integer [] arrayToSort = getIntegersArrayWithout2NCompatibleNumberOfElements();
        int arrayToSortLenght = arrayToSort.length;
        int up = 1;
        assertFalse(Arrays.equals(sortter.sort(arrayToSort, arrayToSortLenght, up), getExpectedIntegersArrayWithout2NCompatibleNumberOfElements()));
    }
}
