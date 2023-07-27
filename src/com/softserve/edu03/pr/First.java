package com.softserve.edu03.pr;

import java.util.Scanner;

public class First {
    public double getTotal(double num1, double num2){
        return num1 + num2;
    }
    public double getAverage(double num1, double num2){
        return getTotal(num1, num2) / 2;
    }

    public First() {
    }

    public static double getNumber(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        return num;
    }

    public static void main(String[] args){
        First option1 = new First();
        double number1 = getNumber("Enter the first number:");
        double number2 = getNumber("Enter the second number:");
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + option1.getTotal(number1, number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is " + option1.getAverage(number1, number2));
    }
}
