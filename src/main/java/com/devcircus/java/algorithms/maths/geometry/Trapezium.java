package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Trapezium {

    private double topSide;
    private double bottomSide;
    private double height;
    
    public Trapezium(double topSide, double bottomSide, double height) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double area() {
        return (topSide + bottomSide) * height / 2;
    }
}
