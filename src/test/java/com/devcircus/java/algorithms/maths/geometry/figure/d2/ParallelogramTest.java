package com.devcircus.java.algorithms.maths.geometry.figure.d2;

import com.devcircus.java.algorithms.maths.geometry.figure.d2.Parallelogram;
import org.junit.Test;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class ParallelogramTest {

    @Test
    public void testArea() {
        Parallelogram parallelogram = new Parallelogram(10, 20);
        assert Double.compare(parallelogram.area(), 200.0) == 0;
    }
}
