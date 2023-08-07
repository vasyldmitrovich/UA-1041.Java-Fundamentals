package com.softserve.edu06.pr;

public class PointMain {
    public static void main(String[] args) {
        Line[] linesArray = {
                new Line(new Point(12, 10), new Point(2, 8)),
                new ColorLine(new Point(23, 11), new Point(12, 10), "green"),
                new Line(new Point(8, 6), new Point(2, 3)),
                new ColorLine(new Point(45, 19), new Point(15, 10), "blue"),
        };
        for (var line : linesArray) {
            line.print();
        }
    }
}
