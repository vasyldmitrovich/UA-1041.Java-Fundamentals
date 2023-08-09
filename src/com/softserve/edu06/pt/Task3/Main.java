package com.softserve.edu06.pt.Task3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[]{
                new Line(new Point(1, 2), new Point(0, 0)),
                new Line(new Point(2, 1), new Point(3, 4)),
                new Line(new Point(4, 5), new Point(5, 6)),
                new ColorLine(new Point(0, 3), new Point(4, 9), "red"),
                new ColorLine(new Point(1, 2), new Point(5, 8), "black")
        };

        for (int i = 0; i < 5; i++) {
            lines[i].print(i+1);
        }
    }
}
