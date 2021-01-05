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
public class SphereTest {
    
    public SphereTest() {
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
     * Test of surfaceAreaSphere method, of class Sphere.
     */
    @Test
    public void testSurfaceAreaSphere() {
        assert Double.compare(Sphere.surfaceAreaSphere(5), 314.1592653589793) == 0;
        assert Double.compare(Sphere.surfaceAreaSphere(1), 12.566370614359172) == 0;
    }
    
}
