package com.softserve.edu06.Practica.task3;

import java.awt.*;

public class ColorLine extends Line {
    private String color;

    public ColorLine(String color) {
        this.color = color;
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;

    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
    public void print() {
        System.out.println("Color:" + color);
        super.print();

    }
}
