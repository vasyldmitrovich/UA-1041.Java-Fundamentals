package com.softserve.edu05.hw.task4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int min = -50;
        int max = 50;
        Random random = new Random();
        int number = random.nextInt(min, max + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Try to guess a randomly generated number in the range [-50 ; 50]");
        int guess;
        do {
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high, try again!");
            } else if (guess < number) {
                System.out.println("Too low, try again!");
            } else {
                System.out.println("Good job! You have nailed it!");
            }
        } while (guess != number);
    }
}
