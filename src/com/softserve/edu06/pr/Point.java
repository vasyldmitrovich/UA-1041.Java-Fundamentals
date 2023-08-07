package com.softserve.edu06.pr;

public class Point {
    double x;
    double y;
    public static void main(String[] args){
        Line[] linesArray = {
                new Line(new Point(12, 10), new Point(2, 8)),
                new ColorLine(new Point(23, 11), new Point(12, 10), "green"),
                new Line(new Point(8, 6), new Point(2, 3)),
                new ColorLine(new Point(45, 19), new Point(15, 10), "blue"),
        };
        for(var line: linesArray){
            line.print();
        }
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void print(){
        System.out.println(new Point(x, y).toString());
    }
}

class Line {
    public Point point1;
    public Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
    public void print(){
        System.out.println(new Line(point1, point2).toString());
    }
}

class ColorLine extends Line{

    private final String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
        this.point1 = point1;
        this.point2 = point2;

    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
    public void print(){
        System.out.println(new ColorLine(point1, point2, color));
    }
}


