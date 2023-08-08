package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class PrimeNumber {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getNumber("Input number: ");
        System.out.println(isPrime(number) ? "Is a prime number" : "Is not prime number");
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static boolean isPrime(int value){
        if(value <= 1) return false;

        int k = 2;
        while(k < value){
            if(value%k == 0){
                return false;
            }
            k++;
        }
        return true;
    }
}