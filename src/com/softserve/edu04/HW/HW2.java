package com.softserve.edu04.HW;

import java.util.Scanner;

public class HW2 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of digits to compare: ");


        int n = SCANNER.nextInt();//Give more informative name of field
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.printf("Please enter %d numbers %n", n);
        for (int i = 0; i < n; i++) {
            int current = SCANNER.nextInt();
            if (current < smallest) {
                smallest = current;
            }
            if (current > largest) {
                largest = current;
            }
        }
        System.out.println("smallest number is : " + smallest);
        System.out.println("smallest number is : " + largest);

    }

}

