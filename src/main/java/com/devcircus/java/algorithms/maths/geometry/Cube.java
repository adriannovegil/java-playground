package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Cube extends Shape{

    private double sideLength;
    
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return 6 * sideLength * sideLength;
    }
}
