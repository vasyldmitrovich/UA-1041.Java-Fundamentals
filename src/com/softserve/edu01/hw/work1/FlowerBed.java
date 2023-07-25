package com.softserve.edu01.hw.work1;

import java.util.Scanner;

    public class FlowerBed {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter radius: ");
            double radius = scanner.nextDouble();

            double perimeter = calcPerimeter(radius);

            double area = calcArea(radius);

            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        }
    public static double calcPerimeter (double radius) {
    return 2 * Math.PI * radius;
    }

    public static double calcArea (double radius) {
            return Math.PI * (radius * radius);
        }
}