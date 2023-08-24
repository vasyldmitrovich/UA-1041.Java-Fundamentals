package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your last name:");
        String lastName = SCANNER.nextLine();
        System.out.println("Enter your fist name:");
        String fistName = SCANNER.nextLine();

        System.out.println("Enter your middle name:");
        String middleName = SCANNER.nextLine();

        System.out.println("=".repeat(10));

        System.out.printf("Last name and initials: %s %c. %c%n", lastName, fistName.charAt(0), middleName.charAt(0));

        System.out.println("First name:" + fistName);

        System.out.printf("First name, middle name and last name: %s %s %s", fistName, middleName, lastName);
    }
}
