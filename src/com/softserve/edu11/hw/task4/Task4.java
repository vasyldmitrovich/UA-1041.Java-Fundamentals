package com.softserve.edu11.hw.task4;

import java.util.Scanner;

public class Task4 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = getName("Enter your first name: ");
        String lastName = getName("Enter your last name: ");

        System.out.printf("Hello, %s! Nice to meet you.", firstName + " " + lastName);
    }

    private static String getName(String message) {
        String name;

        boolean isValid;
        do {
            System.out.print(message);
            name = SCANNER.nextLine();
            isValid = validate(name);

            if (!isValid) System.out.println("Please write correct name!");
        } while (!isValid);

        return name;
    }

    private static boolean validate(String name) {
        return name.matches("^[a-zA-Z\\s\\-]+$");
    }
}
