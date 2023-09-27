package com.devcircus.algorithms.maths.geometry.figure.d2;

import com.devcircus.algorithms.maths.geometry.figure.Figure;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Square extends Figure {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}
