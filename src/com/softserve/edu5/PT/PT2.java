package com.softserve.edu5.PT;

import java.util.Scanner;

public class PT2 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a number for check: ");
        int n = SCANNER.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
    public static boolean isPrime(int n) {
        if (n<= 1) {
            return false;
        }
        for (int i = 2; i< n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

