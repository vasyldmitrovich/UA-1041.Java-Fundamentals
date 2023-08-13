package com.softserve.edu06.pt.pt03;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
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
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
    public void print(){
        System.out.format("\nLine start in %s, end in %s and color is %s", getPoint1(), getPoint2(), getColor());
    }
}
