package com.softserve.edu05.hw.task_4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(-50, 50);
        int userNumber = getNumber("I guessed a number from -50 to 50. Try to guess it:");
        for (; ; ) {
            if (userNumber == randomNumber) {
                System.out.println("You guessed. The number is" + userNumber + " Congratulations!!!");
                break;
            } else if (userNumber > randomNumber) {
                userNumber = getNumber("Too high, try again:");
            } else {
                userNumber = getNumber("Too low, try again:");
            }
        }
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
