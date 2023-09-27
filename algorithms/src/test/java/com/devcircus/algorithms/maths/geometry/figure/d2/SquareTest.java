package com.devcircus.algorithms.maths.geometry.figure.d2;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class SquareTest {

    @Test
    public void testArea() {
        Square square = new Square(10);
        assert Double.compare(square.area(), 100.0) == 0;
    }
}
