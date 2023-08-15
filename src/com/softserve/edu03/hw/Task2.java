package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter 1 number");
        int a = scanner.nextInt();

        System.out.println("Enter 2 number");
        int b = scanner.nextInt();

        System.out.println("Enter 3 number");
        int c = scanner.nextInt();

        int smallest;
        //find the smallest
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }

        System.out.println(smallest + " is the smallest.");
    }
}
