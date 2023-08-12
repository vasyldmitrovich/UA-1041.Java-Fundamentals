package com.softserve.edu06.pt.task2;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " and " +
                "color " + color;
    }
}
