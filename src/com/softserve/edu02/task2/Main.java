package com.softserve.edu02.task2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                var scanner = new Scanner(System.in);


                System.out.print("Input first number: ");
                //Variable A should be a not A
                int a = scanner.nextInt();
                System.out.print("Input second number: ");
                int b = scanner.nextInt();
                System.out.print("Input third number: ");
                int c = scanner.nextInt();
                int min = Math.min(a, b);

                if (min > c) {
                    min = c;
        }
                System.out.print("Min number is = " + min);


}
        }















