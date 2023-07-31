package com.softserve.edu02.task2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                var scanner = new Scanner(System.in);


                System.out.print("Input first number: ");
                //Variable A should be a not A
                int A = scanner.nextInt();
                System.out.print("Input second number: ");
                int B = scanner.nextInt();
                System.out.print("Input third number: ");
                int C = scanner.nextInt();
                int min = Math.min(A, B);


                if (min > C) {
                    min = C;
        }
                System.out.print("Min number is = " + min);


}
        }















