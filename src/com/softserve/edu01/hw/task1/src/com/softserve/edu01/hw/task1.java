package com.softserve.edu01.hw;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Input the radius:");
        Scanner sc = new Scanner(System.in);
        double radius = Double.parseDouble(sc.nextLine());
        double pi = Math.PI;
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.format("The perimeter of flower bed: %.2f\n", perimeter);
        System.out.format("The area of flower bed: %.2f", area);
    }
}