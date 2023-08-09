package com.softserve.edu06.pt.Task3;

public class ColorLine extends Line{
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorLine(Point x, Point y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColorLine() {
    }

    @Override
    public String toString() {
        return
                "  color='" + color + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
    public void print(int number){
        System.out.println("ColorLine №"+number +toString());
    }
}
