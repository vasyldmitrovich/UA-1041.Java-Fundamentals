package com.softserve.edu01.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("country1: ");
        double c1 = scanner.nextDouble();
        double t1 = scanner.nextDouble();
        double call1 = (c1 * t1);
        System.out.println("Cost call1 = " + call1);
        System.out.println("country2: ");
        double c2 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double call2 = (c2 * t2);
        System.out.println("Cost call2 = " + call2);
        System.out.println("country3: ");
        double c3 = scanner.nextDouble();
        double t3 = scanner.nextDouble();
        double call3 = (c3 * t3);
        System.out.println("Cost call3 = " + call3);
        double call = (call1 + call2 + call3);
        System.out.println("Total cost = " + call);


    }
}
