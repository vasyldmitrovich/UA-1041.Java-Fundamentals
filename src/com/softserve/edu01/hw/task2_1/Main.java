package com.softserve.edu01.hw.task2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of flower bed:");
        double radius = sc.nextDouble();
        double perimeter=2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);

        System.out.format("perimeter of flower bed: %.2f\n",perimeter);
        System.out.format("area of flower bed: %.2f",area);
    }
}
