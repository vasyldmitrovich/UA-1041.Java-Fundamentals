package com.softserve.edu12.pt;

import static com.softserve.edu12.pt.App.SCANNER;

enum Color {
    RED, GREEN, BROWN
}

enum Type {
    TREE, BUSH, GRASS
}

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant() {
    }

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public static Plant readPlant() {
        return new Plant(
                readSize(),
                readColor(),
                readType()
        );
    }

    public static int readSize() {
        System.out.print("Enter size: ");
        try {
            int size = Integer.parseInt(SCANNER.nextLine());
            if (size <= 0) {
                System.out.println("Size is too small.");
            } else if (size > 200000) {
                System.out.println("Size is too large.");
            }
            return size;
        } catch (NumberFormatException e) {
            System.out.println("Size should be a number.");
            return -1;
        }
    }

    public static Color readColor() {
        System.out.print("Enter color: ");
        String color = SCANNER.nextLine();
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Unknown color " + color);
        }
    }

    public static Type readType() {
        System.out.print("Enter type: ");
        String type = SCANNER.nextLine();
        try {
            return Type.valueOf(type.toUpperCase());
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