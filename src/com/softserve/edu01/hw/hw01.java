package com.softserve.edu01.hw;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter radius flower bed , m ");
        double radius = scanner.nextDouble();
        var per = 2 * Math.PI * radius;
        var area = Math.PI * radius * radius;
        System.out.println("The perimeter of the flower bed is " + per + " m");
        System.out.println("The area of the flower bed is " + area + " m²");
    }
}
