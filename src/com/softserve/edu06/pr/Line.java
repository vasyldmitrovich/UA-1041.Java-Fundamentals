package com.softserve.edu06.pr;

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

    //    public void print() {
//        System.out.println(new Line(point1, point2).toString());
//    }
    public void print() {
        System.out.println("Line: " + this);
    }
}
