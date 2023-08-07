package com.softserve.edu05.hw.task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        int rNumber = random.nextInt(101);


        System.out.println("Welcome to the game. Guess a number between 1 and 100");

        int userNumber;

        do {
            userNumber = getNum();

            if (rNumber > userNumber) {
                System.out.println("Too low, try again.");
            } else if (rNumber < userNumber) {
                System.out.println("Too high, try again.");
            }

        } while (rNumber != userNumber);

        System.out.println("You guessed the number " + rNumber);
    }


    private static int getNum() {
        System.out.print("Enter your number:");
        int num = SCANNER.nextInt();
        SCANNER.nextLine();

        return num;
    }
}
