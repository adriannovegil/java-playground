/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcircus.java.algorithms.sort.bubble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adrian
 */
public class BubbleTest {
    
    public BubbleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sort method, of class Bubble.
     */
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

    /**
     * Test of main method, of class Bubble.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bubble.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
