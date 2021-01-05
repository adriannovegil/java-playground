package com.devcircus.java.algorithms.maths.geometry.figure.d3;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class SphereTest {

    @Test
    public void testArea() {
        Sphere sphere = new Sphere(5);
        assert Double.compare(sphere.area(), 314.1592653589793) == 0;
    }
}
