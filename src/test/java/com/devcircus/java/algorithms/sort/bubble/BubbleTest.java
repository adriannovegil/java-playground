package com.devcircus.java.algorithms.sort.bubble;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BubbleTest {
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testSort() {
        System.out.println("sort");
        Comparable[] array = null;
        Bubble instance = new Bubble();
        Comparable[] expResult = null;
        Comparable[] result = instance.sort(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bubble.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
