package com.devcircus.algorithms.maths.geometry.figure.d3;

import com.devcircus.algorithms.maths.geometry.figure.Figure;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Cube extends Figure {

    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return 6 * sideLength * sideLength;
    }
}
