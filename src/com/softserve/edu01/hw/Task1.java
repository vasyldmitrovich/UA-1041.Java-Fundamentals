package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius:");
        double radius = sc.nextDouble();
        System.out.format("Area equals %.2f\n", pi*radius*radius);
        System.out.format("Perimeter equals %.2f", 2*pi*radius);
    }
}
