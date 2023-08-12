package com.softserve.edu06.pt.task2;

public class Line {

    private Point start;
    private Point end;


    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line starts " + start + " and ends " + end;
    }

    public void print() {
        System.out.println(this);
    }
}
