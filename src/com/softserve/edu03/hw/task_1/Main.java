package com.softserve.edu03.hw.task_1;

import java.util.Scanner;

public class Main {
    //Perfect
    public static void main(String[] args) {
        int side1 = getSide("Input side 1:");
        int side2 = getSide("Input side 2:");
        int side3 = getSide("Input side 3:");
        System.out.printf("The area of the triangle is %.2f", getArea(side1, side2, side3));

    }

    public static int getSide(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static double getArea(int a, int b, int c) {
        double p = (a + b + c) * 0.5;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
