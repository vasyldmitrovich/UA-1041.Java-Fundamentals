package com.softserve.edu05.hw.work2;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;

        do {
            System.out.println("Enter first number: ");
            int num1 = SCANNER.nextInt();
            System.out.println("Enter second number: ");
            int num2 = SCANNER.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum = " + sum);

            System.out.println("Do you want to perform the operation again? (yes/no)");
            SCANNER.nextLine();
            choice = SCANNER.nextLine();

        } while (choice.equals("yes"));

    }
}