package com.softserve.edu12.pr;

import java.util.Locale;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        this.size = size;
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Unknown color "+ color);
        }
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Unknown type " + type);
        }
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

enum Color{
    RED, GREEN, BROWN
}

enum Type{
    TREE, BUSH, GRASS
}

class ColorException extends RuntimeException{

    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends RuntimeException{

    public TypeException(String message) {
        super(message);
    }
}