package com.devcircus.java.algorithms.maths.geometry;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(10, 20);
        assert Double.compare(rectangle.area(), 200.0) == 0;
    }
}
