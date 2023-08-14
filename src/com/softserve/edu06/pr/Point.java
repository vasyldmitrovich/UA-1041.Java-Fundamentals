package com.softserve.edu06.pr;
//All class should be in its own file like Line.java etc...
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
    }//You do not use this method, if you do not use than delete this method
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
    /* Write something like that:
     public void print(){
        System.out.println("Some text " + this);
}*/
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


