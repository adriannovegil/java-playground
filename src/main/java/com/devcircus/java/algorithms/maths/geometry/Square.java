package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Square {

    private double sideLength;
    
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }
}
