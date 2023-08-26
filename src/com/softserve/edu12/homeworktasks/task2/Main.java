package com.softserve.edu12.homeworktasks.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        promptUserInput();
        readNumber(start(), end());
    }

    public static void readNumber(int start, int end) {
        System.out.println("Player2 your turn to guess the numbers");
        int arrayPool = end - start;
        List<Integer> arrayOfNums = new ArrayList<>(arrayPool);
        boolean isGuessed = false;
        while (!isGuessed) {
            for (int j = 1; j <= 10; j++) {
                if(arrayPool >= arrayOfNums.size()) {
                    System.out.println("Guess number " + j);
                    int number = 0;
                    try {
                        number = Integer.parseInt(SCANNER.nextLine());
                    } catch (NumberFormatException e) {
                        throw new RuntimeException("Please read one more time rules of game");
                    }
                    if (number >= start && number <= end) {
                        arrayOfNums.add(number);
                        System.out.println("You guessed the number");
                    } else {
                        System.out.println("Try to guess");
                    }
                }
                isGuessed = true;
            }
            if (isGuessed) {
                System.out.println("Here is numbers which you guessed " + arrayOfNums);
                break;
            }
        }
    }

    public static void promptUserInput() {
        System.out.println("""
                ////////////G    A   M   E///////////
                        This game for two persons
                    Player1:
                You have to input the range of numbers
                which Player2 have to guess
                    Player2:
                You have 10 tries to guess all numbers
                        
                              HAVE FUN :)
                """);
    }

    public static int start() {
        System.out.print("Guess the start of the range: ");
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Please write integer number using digits");
        }
    }

    public static int end() {
        System.out.print("Guess the end of the range: ");
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Please write integer number using digits");
        }
    }
}
