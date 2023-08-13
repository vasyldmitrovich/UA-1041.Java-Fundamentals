package com.softserve.edu06.pt.pt03;

public class MainLine {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(4, 5), new Point(3, 6)),
                new Line(new Point(12, 5), new Point(14, 7)),
                new Line(new Point(55, 78), new Point(22, 78)),
                new ColorLine(new Point(81, 70), new Point(39, 2), "red"),
                new ColorLine(new Point(6, 7), new Point(9, 12), "green"),
                new ColorLine(new Point(90, 28), new Point(32, 6), "yellow"),
        };
        for (Line line : lines) {
            line.print();
        }
    }
}
