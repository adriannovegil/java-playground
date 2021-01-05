package com.devcircus.java.algorithms.maths.geometry;

import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class CubeTest {

    @Test
    public void testArea() {
        Cube cube = new Cube(1);
        assert Double.compare(cube.area(), 6.0) == 0;
    }
}
