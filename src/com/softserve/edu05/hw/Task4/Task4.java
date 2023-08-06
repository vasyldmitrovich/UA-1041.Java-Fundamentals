package com.softserve.edu05.hw.Task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static int number;
    private int UsersNum;
    static Scanner scanner = new Scanner(System.in);

    private static void RandomNum() {
        Random random = new Random();
        number = random.nextInt(10) + 1;
    }

    public void check() {
        RandomNum();
        do {
            System.out.println("Enter a number: ");
            UsersNum = scanner.nextInt();
            if (UsersNum > number) {
                System.out.println("Too high, try again.");
            } else if (UsersNum < number) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations, you guessed it!!!");
            }
        } while (UsersNum != number);
    }


}
