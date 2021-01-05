package com.devcircus.java.algorithms.maths.geometry;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Sphere {

    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}
