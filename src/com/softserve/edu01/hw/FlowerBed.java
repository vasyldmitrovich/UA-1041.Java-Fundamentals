package com.softserve.edu01.hw;

import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        System.out.println("Write down the radius of flower bed: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI + radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.format("\nThe perimeter of flower bed is: %.2f", + perimeter);
        System.out.format("\nAn area of flower bed is: %.2f", + area);
    }
}
