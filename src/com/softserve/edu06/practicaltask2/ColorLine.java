package com.softserve.edu06.practicaltask2;

public class ColorLine extends Line{
    private String color;
    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return "ColorLine{" + "start=" + start +
                ", end=" + end +
                ", color='" + color + '\'' +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }//The same there
}
