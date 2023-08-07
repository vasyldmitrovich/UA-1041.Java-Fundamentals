package com.softserve.edu06.pr;

public class Point {
    double x;
    double y;

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


