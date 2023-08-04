package com.softserve.edu01.hw;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the cost per minute of first call:");
        double c1 = Double.parseDouble(sc.nextLine());
        System.out.println("Input the cost per minute of second call:");
        double c2 = Double.parseDouble(sc.nextLine());
        System.out.println("Input the cost per minute of third call:");
        double c3 = Double.parseDouble(sc.nextLine());
        System.out.println("Input the duration of first call:");
        double d1 = Double.parseDouble(sc.nextLine());
        System.out.println("Input the duration of second call:");
        double d2 = Double.parseDouble(sc.nextLine());
        System.out.println("Input the duration of third call:");
        double d3 = Double.parseDouble(sc.nextLine());
        System.out.format("The cost of first call: %.2f\n", c1 * d1);
        System.out.format("The cost of second call: %.2f\n", c2 * d2);
        System.out.format("The cost of third call: %.2f\n", c3 * d3);
        System.out.format("Total cost of three calls: %.2f\n", c1 * d1 + c2 * d2 + c3 * d3);
    }
}
