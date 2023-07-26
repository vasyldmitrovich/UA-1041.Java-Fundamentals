package com.softserve.edu03;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side of triangle: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side of triangle: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side of triangle: ");
        double side3 = scanner.nextDouble();

        double Perimeter = side1 + side2 + side3;
        double HalfPerimeter = Perimeter/2;
        double Area = Math.sqrt(HalfPerimeter*(HalfPerimeter-side1)*(HalfPerimeter-side2)*(HalfPerimeter-side3));

        System.out.format("The Area of the triangle = %.2f",Area);
    }
}
