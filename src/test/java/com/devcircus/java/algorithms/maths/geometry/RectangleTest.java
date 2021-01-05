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
public class RectangleTest {

    public RectangleTest() {
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
    public void testSurfaceAreaRectangle() {
        assert Double.compare(Rectangle.surfaceAreaRectangle(10, 20), 200.0) == 0;
    }
}
