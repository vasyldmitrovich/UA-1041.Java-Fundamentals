package com.softserve.edu05.hw.task2;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {


    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isStopped;

        do {



            int a = getNum("Enter your first number:");
            int b = getNum("Enter your second number:");

            int result = a + b;
            System.out.println("Result sum is " + result);

            isStopped = getChoice();

        } while (isStopped);

        System.out.println("Bye!");
    }

    private static boolean getChoice() {
        System.out.print("Do we want to continue(yes or no):");
        String answer = SCANNER.nextLine();

        boolean choice = false;

        if (Objects.equals(answer, "yes")) choice = true;


        return choice;
    }

    private static int getNum(String message) {
        System.out.print(message);
        int num = SCANNER.nextInt();

        SCANNER.nextLine();


        return num;
    }


}
