package com.softserve.edu05.Practical.task2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer :");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println("Is a prime number: " + n);
        } else {
            System.out.println("Is not prime number: " + n);
        }

    }
     static boolean isPrime(int n) {
        int max = n / 2 + 1;
        for (int i = 2; i < max; i++) {
            if (n % i == 0) return false;

                   }
               return true;

    }

    }



