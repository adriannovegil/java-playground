package com.devcircus.java.algorithms.sort.cocktailshaker;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
class CocktailShakerTest extends BaseSortTest{

    private CocktailShaker sortter;
    
    @Before
    public void setUp() {
        sortter = new CocktailShaker();
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
