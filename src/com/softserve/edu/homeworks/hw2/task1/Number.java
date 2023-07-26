package com.softserve.edu.homeworks.hw2.task1;

import java.util.Scanner;

public class Number {
    static Scanner sc = new Scanner(System.in);

    public static double getNumber(String num){
        System.out.print(num);
        return sc.nextDouble();
    }
    public static double getMin(double a, double b, double c){
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        double num1 = getNumber("Input the first number: ");
        double num2 = getNumber("Input the second number: ");
        double num3 = getNumber("Input the third number: ");
        double min = getMin(num1,num2,num3);
        System.out.format("The smallest number is %.2f", min);
    }
}
