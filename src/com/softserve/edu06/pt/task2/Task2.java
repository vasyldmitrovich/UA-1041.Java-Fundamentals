package com.softserve.edu06.pt.task2;

public class Task2 {

    public static void main(String[] args) {

        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new ColorLine(new Point(5, 6), new Point(7, 8), "Blue"),
                new Line(new Point(9, 10), new Point(11, 12)),
                new ColorLine(new Point(13, 14), new Point(15, 16), "Red")
        };

        for (Line line : lines) {
            line.print();
        }
    }


}
