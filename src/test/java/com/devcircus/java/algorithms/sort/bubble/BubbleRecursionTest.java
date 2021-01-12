package com.devcircus.java.algorithms.sort.bubble;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BubbleRecursionTest {
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testSort() {
        System.out.println("sort");
        Comparable[] unsorted = null;
        BubbleRecursion instance = new BubbleRecursion();
        Comparable[] expResult = null;
        Comparable[] result = instance.sort(unsorted);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BubbleRecursion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
