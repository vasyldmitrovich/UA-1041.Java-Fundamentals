package edu05.Cars;

import java.util.Scanner;
public class Randomnumbers {
    public static void main(String[] args) {
        int number;
        for (; ; ) {
            number = getNumber("enter a positive integer:");
            if (number > 0) {
                break;
            }
            System.out.println("Wrong number, try again");
        }
        if (isPrimeNumber(number)) {
            System.out.println("number - " + number + " is a prime number");
        } else {
            System.out.println("number - " + number + " is not prime number");
        }
    }

    private static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}