package com.softserve.edu06.pt.Geometric;

public class ColorLine extends Line {
    private final String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " with color " + color;
    }
}
