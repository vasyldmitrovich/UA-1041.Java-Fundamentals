package com.softserve.edu05.pt;

import static com.softserve.edu05.util.CollectInputs.inputNumberInt;

public class Task2 {
    public static void runTask2() {
        System.out.println("\nTask2:\n");
        int num = inputNumberInt("Please enter any number:");
        if (isPrime(num)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }

    private static boolean isPrime(int num) {
        int max = num / 2 + 1;
        for (int i = 2; i < max; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
