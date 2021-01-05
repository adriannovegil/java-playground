package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Triangle {

    /**
     * Calculate the area of a triangle
     *
     * @param base base of triangle
     * @param height height of triangle
     * @return area of given triangle
     */
    public static double surfaceAreaTriangle(double base, double height) {
        return base * height / 2;
    }
}
