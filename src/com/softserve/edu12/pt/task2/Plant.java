package com.softserve.edu12.pt.task2;

import com.softserve.edu12.pt.task2.exception.ColorException;
import com.softserve.edu12.pt.task2.exception.TypeException;
import com.softserve.edu12.pt.task2.type.Color;
import com.softserve.edu12.pt.task2.type.Type;

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {

        this.size = size;

        this.color = Color.valueOf(color);

        this.type = Type.valueOf(type);
    }


    @Override
    public String toString() {
        return "Plant has size: " + size + ", color: " + color.name().toLowerCase() + " and has type: " + type.name().toLowerCase() + ".";
    }

    public static void verifySize(int size) {
        if (size < 1 || size > 100) {
            throw new IllegalArgumentException("Size must be between 1 and 100.");
        }

    }


    public static void verifyColor(String color) throws ColorException {
        if (color == null) {
            throw new ColorException("Invalid color");
        }


        try {
            Color.valueOf(color.toUpperCase());

        } catch (IllegalArgumentException e) {
            throw new ColorException("Unknown color");
        }

    }

    public static void verifyType(String type) throws TypeException {
        if (type == null) {
            throw new TypeException("Invalid type");
        }

        try {
            Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Unknown type");
        }
    }

}
