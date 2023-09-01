package com.softserve.edu12.pt.task_2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant() {
    }

    public Plant(int size, String color, String type) {
        this.size = readSize(size);
        this.color = readColor(color);
        this.type = readType(type);


    }

    private static int readSize(int size) {
        try {
            if (size < 0 || size > 200) {
                throw new SizeException("Size " + size + " not correct, try again!");
            }
            return size;
        } catch (IllegalArgumentException e) {
            throw new SizeException("Size " + size + " not correct, try again!");
        }

    }

    private static Type readType(String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Type " + type + " not find, try again!");
        }
    }

    private static Color readColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Color " + color + " not find, try again!");
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

enum Color {
    RED, BLUE, YELLOW, VIOLET;
}

enum Type {
    GRASS, BUSH, TREE;
}