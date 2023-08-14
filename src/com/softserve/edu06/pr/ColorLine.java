package com.softserve.edu06.pr;

class ColorLine extends Line {

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

    public void print() {
        System.out.println(new ColorLine(point1, point2, color));
    }
}
