package com.devcircus.java.algorithms.maths.geometry.figure.d2;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class TrapeziumTest {

    @Test
    public void testArea() {
        Trapezium trapezium = new Trapezium(10, 20, 30);
        assert Double.compare(trapezium.area(), 450.0) == 0;
    }
}
