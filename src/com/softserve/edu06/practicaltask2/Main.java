package com.softserve.edu06.practicaltask2;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(1,3),
                new Point(2, 6),
                new Point(4, 9)
        };
        Line[] lines = new Line[]{
                new Line(points[0], points[1]),
                new Line(points[2], points[3]),
                new ColorLine(points[1], points[3], "Green"),
        };
        for (var line : lines){
            System.out.println(line);
        }
    }
}
