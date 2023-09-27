package com.devcircus.algorithms.maths.geometry.figure.d2;

import com.devcircus.algorithms.maths.geometry.figure.Figure;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class Trapezium extends Figure {

    private double topSide;
    private double bottomSide;
    private double height;

    public Trapezium(double topSide, double bottomSide, double height) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (topSide + bottomSide) * height / 2;
    }
}
