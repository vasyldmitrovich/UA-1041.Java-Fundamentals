package com.softserve.edu12.Practica.task2;

import java.util.Scanner;

public class Plant {
    private static Scanner SCANNER;
    private static int size;
    private Color color;
    private Type type;



    public Plant(int size, String color, String type) {
        this.size = size;
        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Unknown color" + "\t" + color);
        }
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Unknown type" + "\t" + type);
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


class ColorException extends RuntimeException {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends RuntimeException {
    public TypeException(String message) {
        super(message);
    }
}

