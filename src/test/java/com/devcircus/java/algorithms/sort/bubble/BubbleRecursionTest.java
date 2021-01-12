package com.devcircus.java.algorithms.sort.bubble;

import com.devcircus.java.algorithms.sort.BaseSortTest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BubbleRecursionTest extends BaseSortTest{
    
    private BubbleRecursion sortter;
            
    @Before
    public void setUp() {
        sortter = new BubbleRecursion();
    }
    
    @Test
    public void testSortWithIntegers() {
        assertArrayEquals(sortter.sort(getIntegersArray()), getExpectedIntegersArray());
    }

    @Test
    public void testSortWithStrings() {
        assertArrayEquals(sortter.sort(getStringsArray()), getExpectedStringsArray());
    }
}
