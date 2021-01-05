package com.devcircus.java.algorithms.maths.geometry;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(10, 10);
        assert Double.compare(triangle.area(), 50.0) == 0;
    }
}
