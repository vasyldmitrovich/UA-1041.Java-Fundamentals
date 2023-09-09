package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private Line line;
    private String color;

    public ColorLine(Point point, Point point1) {
        super();
        this.color = "N/A";
    }

    public ColorLine(Line line) {
        super();
        this.color = "black";
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void print() {
        System.out.println("");
    }

    public void print(Line line) {
        System.out.println("Line " + getLine() + ". Color of the line is " + getColor());
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "line=" + line +
                ", color='" + color + '\'' +
                '}';
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}