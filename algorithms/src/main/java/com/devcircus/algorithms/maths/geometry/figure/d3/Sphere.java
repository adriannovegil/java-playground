package com.devcircus.algorithms.maths.geometry.figure.d3;

import com.devcircus.algorithms.maths.geometry.figure.Figure;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Sphere extends Figure {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}
