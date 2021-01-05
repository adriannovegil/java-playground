package com.devcircus.java.algorithms.maths.geometry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class TriangleTest {
    
    public TriangleTest() {
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
     * Test of surfaceAreaTriangle method, of class Triangle.
     */
    @Test
    public void testSurfaceAreaTriangle() {
        assert Double.compare(Triangle.surfaceAreaTriangle(10, 10), 50.0) == 0;
    }
    
}
