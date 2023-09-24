package com.softserve.edu12.pt;

public class Task_1 {
    public static int getSquareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides should be non negative");
        }
        int squareRectangle = a * b;
        return squareRectangle;
    }
}
