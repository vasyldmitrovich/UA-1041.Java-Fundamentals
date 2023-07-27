package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side 1: ");
        double a = sc.nextDouble();
        System.out.print("Input side 2: ");
        double b = sc.nextDouble();
        System.out.print("Input side 3: ");
        double c = sc.nextDouble();

        double p = (a + b + c)/2;
        System.out.format("Area: %.2f\n", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}

