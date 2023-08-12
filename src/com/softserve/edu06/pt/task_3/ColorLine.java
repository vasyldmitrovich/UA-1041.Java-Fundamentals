package com.softserve.edu06.pt.task_3;

import java.util.Objects;

public class ColorLine extends Line {
    private String color;

    public ColorLine() {

    }


    public ColorLine(Point a, Point b, String color) {
        super(a, b);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColorLine colorLine = (ColorLine) o;

        return Objects.equals(color, colorLine.color);
    }

    @Override
    public int hashCode() {


        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' + super.toString() +
                '}';

    }
}
