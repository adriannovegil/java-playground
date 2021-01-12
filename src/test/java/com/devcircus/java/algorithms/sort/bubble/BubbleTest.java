package com.devcircus.java.algorithms.sort.bubble;

import com.devcircus.java.algorithms.sort.BaseSortTest;
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
        assertArrayEquals(sortter.sort(getIntegerArrayToSort()), getSortedIntegerArray());
    }

    @Test
    public void testSortWithStrings() {
        assertArrayEquals(sortter.sort(getStringArrayToSort()), getSortedStringArray());
    }
}
