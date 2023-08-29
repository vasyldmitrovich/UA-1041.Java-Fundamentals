package com.softserve.edu12.pt;

import java.util.Scanner;

public class Plant {
    private static final Scanner SCANNER = new Scanner(System.in);
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        if (size > 0 && size < 200) {
            this.size = size;
        } else {
            String msg = size < 0 ? "Too small plant" : "Too big plant";
            throw new IllegalArgumentException(msg);
        }

        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Unknown color:" + color, e);
        }
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Unknown type:" + type, e);
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
