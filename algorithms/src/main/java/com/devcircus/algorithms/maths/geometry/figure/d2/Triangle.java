package com.devcircus.algorithms.maths.geometry.figure.d2;

import com.devcircus.algorithms.maths.geometry.figure.Figure;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Triangle extends Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height / 2;
    }
}
