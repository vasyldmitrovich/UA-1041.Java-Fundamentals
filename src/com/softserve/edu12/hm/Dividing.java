package com.softserve.edu12.hm;

public class Dividing {
    public static double div(double num1, double num2) throws IllegalAccessException {

        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}
