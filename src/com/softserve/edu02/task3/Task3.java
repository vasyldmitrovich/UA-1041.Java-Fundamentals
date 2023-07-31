package com.softserve.edu02.task3;

import java.util.Scanner;

public class Task3 {
    //Nice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;


        System.out.println("Enter first cost of per minute:");
        int c1 = scanner.nextInt();

        System.out.println("Enter first duration:");
        int t1 = scanner.nextInt();

        System.out.println("Enter second cost of per minute:");
        int c2 = scanner.nextInt();

        System.out.println("Enter second duration:");
        int t2 = scanner.nextInt();

        System.out.println("Enter third cost of per minute:");
        int c3 = scanner.nextInt();

        System.out.println("Enter third duration:");
        int t3 = scanner.nextInt();

        int cost1 = c1 * t1;
        total += cost1;
        System.out.println("First cost of call = " + cost1);

        int cost2 = c2 * t2;
        total += cost2;
        System.out.println("Second cost of call = " + cost2);

        int cost3 = c3 * t3;
        total += cost3;
        System.out.println("Third cost of call = " + cost3);

        System.out.println("Total cost of calls = " + total);
    }
}
