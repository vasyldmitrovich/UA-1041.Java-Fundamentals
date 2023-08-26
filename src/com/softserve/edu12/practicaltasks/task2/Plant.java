package com.softserve.edu12.practicaltasks.task2;

import static com.softserve.edu12.practicaltasks.task2.Main.SCANNER;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public static Plant read() {
        return new Plant(readSize(), readColor(), readType());
    }

    public static Type readType() {
        System.out.println("Enter type: ");
        String type = SCANNER.nextLine();
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Unknown type " + type);
        }
    }

    public static int readSize() {
        System.out.println("Enter the size: ");
        try {
            int size = Integer.parseInt(SCANNER.nextLine());
            if (size <= 0 || size > 2000) {
                throw new SizeException("Size of plant is not correct");
            } else {
                return size;
            }
        } catch (NumberFormatException e) {
            throw new SizeException("Not correct size");
        }
    }

    public static Color readColor() {
        System.out.println("Enter color: ");
        String color = SCANNER.nextLine();
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Unknown color " + color);
        }
    }

    @Override
    public String toString() {
        return "Plant{" + "size=" + size + ", color=" + color + ", type=" + type + '}';
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
