package com.softserve.edu06.pt.task_3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(3.1, 5.1), new Point(4.5, 7.2)),
                new Line(new Point(34.9, 35.9), new Point(44.3, 55.1)),
                new ColorLine(new Point(13.1, 15.1), new Point(14.5, 17.2), "Red"),
                new ColorLine(new Point(14.9, 15.9), new Point(14.3, 15.1), "Green")
        };
        for (var line : lines
        ) {
            System.out.println(line);
        }
    }
}
