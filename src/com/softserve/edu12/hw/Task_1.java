package com.softserve.edu12.hw;

public class Task_1 {
    public static double div(int a, int b){
        if (b==0) {
            throw new NullPointerException("Cannot be divided by zero.");
        }
        double res = a/Double.parseDouble(String.valueOf(b));
        return res;
    }
}
