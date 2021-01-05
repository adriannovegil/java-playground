package com.devcircus.java.algorithms.maths.geometry.figure.d3;

import com.devcircus.java.algorithms.maths.geometry.figure.d3.Sphere;
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
        
        Sphere sphere2 = new Sphere(1);
        assert Double.compare(sphere2.area(), 12.566370614359172) == 0;
    }
}
