package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Triangle {

    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height / 2;
    }
}
