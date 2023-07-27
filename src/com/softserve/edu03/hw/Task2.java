package com.softserve.edu03.hw;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        double a = sc.nextDouble();
        System.out.print("Input second number: ");
        double b = sc.nextDouble();
        System.out.print("Input third number: ");
        double c = sc.nextDouble();

        System.out.format("The smallest number is: %.2f\n",
                Stream.of(a, b, c).mapToDouble(v -> v).min().getAsDouble());
    }
}
