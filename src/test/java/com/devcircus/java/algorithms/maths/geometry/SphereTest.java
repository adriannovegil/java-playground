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

    @Test
    public void testArea() {
        Sphere sphere = new Sphere(5);
        assert Double.compare(sphere.area(), 314.1592653589793) == 0;
        
        Sphere sphere2 = new Sphere(1);
        assert Double.compare(sphere2.area(), 12.566370614359172) == 0;
    }
}
