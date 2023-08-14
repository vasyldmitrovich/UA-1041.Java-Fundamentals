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


