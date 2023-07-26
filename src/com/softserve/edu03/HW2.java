package com.softserve.edu03;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {

        System.out.println("Enter the number of digits to compare: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;

        System.out.printf("Please enter %d numbers %n", n);
        for (int i = 0; i < n; i++) {

            int current = sc.nextInt();
            if (current < smallest) {
                smallest = current;
            }
        }
        System.out.println("smallest number is : " + smallest);
    }

}

