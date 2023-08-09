package com.softserve.edu06.pt.Task3;

public class Line {
    public Point start;
    public Point end;

    public Line() {
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }




    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public void print(int number){
         System.out.println("Line № "+number+" start= "+start+" end= "+end);
    }
}
