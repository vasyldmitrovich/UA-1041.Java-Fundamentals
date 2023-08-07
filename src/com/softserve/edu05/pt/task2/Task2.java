package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        int num;
        do {
            num = getNum();

            if (isPrime(num)) {
                System.out.println("Number " + num + " is prime");
            }else {
                System.out.println("Number " + num + " is not prime");
            }

        } while (num > 0);
    }

    private static int getNum() {
        System.out.print("Enter your number:");
        int num = SCANNER.nextInt();
        SCANNER.nextLine();

        return num;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
