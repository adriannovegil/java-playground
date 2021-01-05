package com.devcircus.java.algorithms.maths.geometry.figure.d2;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle(20);
        assert Double.compare(circle.area(), 1256.6370614359173) == 0;
    }
}
