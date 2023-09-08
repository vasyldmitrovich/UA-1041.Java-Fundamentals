package com.softserve.edu12.pt.pt02;

public class Plain {
    private int size;
    private Color color;
    private Type type;

    public Plain() {
    }

    public Plain(int size, String color, String type) {
        try {
            this.size = size;
            if (size < 5) {
                throw new RuntimeException("Size " + getSize() + "is too low" );
            }
            if (size > 60) {
                throw new RuntimeException("Size " + getSize() + "is too large");
            }
        } catch (RuntimeException e) {
            throw new SizeException(e.getMessage());
        }
        try {
            this.color = Color.valueOf(color);
        } catch (IllegalArgumentException e) {
            throw new ColorException("This color doesn't exist ");
        }
        try {
            this.type = Type.valueOf(type);
        } catch (IllegalArgumentException e) {
            throw new TypeException("This type of plant doesn't exist ");
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
        return "\nPlain{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
