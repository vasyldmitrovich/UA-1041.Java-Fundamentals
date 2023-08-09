package com.softserve.edu05.pt.pt01;

public class Average {
    public static void main(String[] args) {
    double[] numbers = {5.0, 12.0, 13.5, 14.9};
    double sum = 0;
    for (var d : numbers){
        sum += d;
    }
    double average = sum / numbers.length;
        System.out.println("The average value is " + average);
    }
}
