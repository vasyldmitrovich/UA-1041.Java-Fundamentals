package com.softserve.edu12.pt.task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        this.size = size;
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("This color doesn't exist " + color);
        }
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("This type of plant doesn't exist " + type);
        }
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
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
