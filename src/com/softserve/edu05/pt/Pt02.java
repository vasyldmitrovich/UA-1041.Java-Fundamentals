package com.softserve.edu05.pt;

import java.util.Scanner;

public class Pt02 {
    public static void main(String[] args) {

        boolean isPrime = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();

        var max = num / 2 + 1;
        for (int i = 2; i < max; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }
}
