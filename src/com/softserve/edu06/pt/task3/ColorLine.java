package com.softserve.edu06.pt.task3;

public class ColorLine extends Line{
    private String color;


    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void print(){
        super.print();
        System.out.println(" " + color);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
