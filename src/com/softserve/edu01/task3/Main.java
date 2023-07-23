package com.softserve.edu01.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input the radius: ");
        double radius = scanner.nextDouble();
        double pi = 3.14;
        double P = (2 * radius * pi);
        System.out.println("Perimetr = " + P);
        double S = (pi * radius*radius);


        System.out.println("Area = " + S);

    }

}
