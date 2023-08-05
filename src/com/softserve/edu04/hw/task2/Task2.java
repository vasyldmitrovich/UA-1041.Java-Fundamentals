package com.softserve.edu04.hw.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num1 = getNumber("Input the first number: ");
        int num2 = getNumber("Input the second number: ");
        int num3 = getNumber("Input the third number: ");

        System.out.println("The biggest number is: " + getMax(num1, num2, num3));
        System.out.println("The smallest number is: " + getMin(num1, num2, num3));
    }

    public static int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int getNumber(String num) {
        Scanner sc = new Scanner(System.in);
        System.out.print(num);
        return sc.nextInt();
    }
}

