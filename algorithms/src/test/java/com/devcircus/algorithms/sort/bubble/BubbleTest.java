package com.devcircus.algorithms.sort.bubble;

import com.devcircus.algorithms.sort.BaseSortTest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BubbleTest extends BaseSortTest{
    
    private Bubble sortter;
    
    @Before
    public void setUp() {
        sortter = new Bubble();
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
