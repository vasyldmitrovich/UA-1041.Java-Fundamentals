package com.softserve.edu12.pr;

public class Rectangle {
    public static int rectangleArea(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Sides should be non negative");
        }
        return a * b;
    }
}
