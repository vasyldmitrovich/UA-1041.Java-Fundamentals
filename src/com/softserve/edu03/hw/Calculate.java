package com.softserve.edu03.hw;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner getSide = new Scanner(System.in);
        System.out.print("Input side 1: ");
        double a = getSide.nextDouble();
        System.out.print("Input side 2: ");
        double b = getSide.nextDouble();
        System.out.print("Input side 3: ");
        double c = getSide.nextDouble();

        double p = (a + b + c)/2;
        System.out.format("Area: %.2f\n", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
