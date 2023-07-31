package com.softserve.edu03.task2;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = scanner.nextInt();


        System.out.print("Input the second number: ");
        int b = scanner.nextInt();


        System.out.print("Input the third number: ");
        int c = scanner.nextInt();


        System.out.println("The smallest number is " + findSmallest(a, b, c));
    }
    //Nice
    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }
}
