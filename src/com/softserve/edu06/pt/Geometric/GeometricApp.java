package com.softserve.edu06.pt.Geometric;

import java.util.Random;

public class GeometricApp {
    static Random rd = new Random();
    static Line[] lines = {
            new Line(randPoint(), randPoint()),
            new ColorLine(randPoint(), randPoint(), "green"),
            new Line(randPoint(), randPoint()),
            new ColorLine(randPoint(), randPoint(), "red"),
            new Line(randPoint(), randPoint()),
            new ColorLine(randPoint(), randPoint(), "blue"),
            new Line(randPoint(), randPoint()),
            new ColorLine(randPoint(), randPoint(), "pink")
    };

    public static void main(String[] args) {
        printLines();
    }

    public static void printLines() {
        for (var line : lines) {
            line.print();
        }
    }

    public static Point randPoint() {
        return new Point(rd.nextInt(-10, 11), rd.nextInt(-10, 11));
    }

}
