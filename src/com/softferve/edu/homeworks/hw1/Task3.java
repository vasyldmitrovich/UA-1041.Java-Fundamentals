package com.softferve.edu.homeworks.hw1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the cpm of the first call: ");
        double c1 = sc.nextDouble();
        System.out.print("\nInput the cpm of the second call: ");
        double c2 = sc.nextDouble();
        System.out.print("\nInput the cpm of the third call: ");
        double c3 = sc.nextDouble();

        System.out.print("\nInput the duration of the first call in minutes: ");
        double t1 = sc.nextDouble();
        System.out.print("\nInput the duration of the second call in minutes: ");
        double t2 = sc.nextDouble();
        System.out.print("\nInput the duration of the third call in minutes: ");
        double t3 = sc.nextDouble();

        System.out.println("The cost of the first call: " + c1*t1);
        System.out.println("The cost of the second call: " + c2*t2);
        System.out.println("The cost of the third call: " + c3*t3);
        System.out.println("The total cost: " + ((c1*t1)+(c2*t2)+(c3*t3)));


    }
}
