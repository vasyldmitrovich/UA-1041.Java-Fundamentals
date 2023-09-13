package edu05.pt;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility by numbers from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible by any number in this range, it's not prime
            }
        }

        return true; // If not divisible by any number in the range, it's prime
    }
}
