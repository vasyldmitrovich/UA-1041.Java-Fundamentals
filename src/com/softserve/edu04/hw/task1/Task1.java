package com.softserve.edu04.hw.task1;

import java.util.Scanner;

public class Task1 {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        double num1 = getNum("Enter your first number: ");

        if (isBelongs(num1)) System.out.println("Number " + num1 + " belongs to range [-5;5]");
        else System.out.println("Number " + num1 + " doesn't belong to range [-5;5]");


        double num2 = getNum("Enter your second number: ");

        if (isBelongs(num2)) System.out.println("Number " + num2 + " belongs to range [-5;5]");
        else System.out.println("Number " + num2 + " doesn't belong to range [-5;5]");


        double num3 = getNum("Enter your third number: ");

        if (isBelongs(num3)) System.out.println("Number " + num3 + " belongs to range [-5;5]");
        else System.out.println("Number " + num3 + " doesn't belong to range [-5;5]");
    }

    private static double getNum(String message) {

        System.out.print(message);
        double num = SCANNER.nextDouble();

        SCANNER.nextLine();

        return num;
    }

    private static boolean isBelongs(double num) {
        return num >= -5 && num <= 5;
    }
}
