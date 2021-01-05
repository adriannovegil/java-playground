package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Parallelogram extends Shape{

    private double base;
    private double height;
    
    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }
}
