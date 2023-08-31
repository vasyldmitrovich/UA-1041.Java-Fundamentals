package com.softserve.edu06.Practica.task3;



public class Main {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(11,5),new Point(3,6)),
                new Line(new Point(51,8),new Point(32,9)),
                new ColorLine(new Point(12,5),new Point(6,15),"Pink"),
                new ColorLine(new Point(2,5),new Point(8,6),"Green")


        };
        for (var line :lines) {
            System.out.println(line);


        }


    }
}
