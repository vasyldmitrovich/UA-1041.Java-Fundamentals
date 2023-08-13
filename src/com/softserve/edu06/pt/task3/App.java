package com.softserve.edu06.pt.task3;

public class App {
    public static void main(String[] args) {
        Line[] lines = {new Line(new Point(2, 3), new Point(5, 3)),
                new ColorLine(new Point(2, 4), new Point(6, 3), "Pink"),
                new Line(new Point(6, 3), new Point(7, 9)),
                new ColorLine(new Point(2, 5), new Point(9, 10), "Blue")};
        for (Line line : lines) {
            line.print();
        }
    }
}
