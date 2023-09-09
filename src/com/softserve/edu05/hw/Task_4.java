package com.softserve.edu05.hw;

import java.util.Random;

import static com.softserve.edu05.hw.App.SCANNER;

public class Task_4 {

    public static void getRandomNumber() {
        Random randomNumber = new Random();
        int n = randomNumber.nextInt(-10, 11);
        int userNumber = 0;
        do {
            System.out.print("Try to guess random number from array [-10;10]: ");
            userNumber = SCANNER.nextInt();
            SCANNER.nextLine();
            if (n > userNumber) {
                System.out.println("Too low, try again.");
            } else if (n < userNumber) {
                System.out.println("Too high, try again.");
            }
        } while (n != userNumber);

    }
}
