package com.softserve.edu11.pt.task3;

import java.util.Scanner;

public class Task3 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {

            System.out.println("Enter username:");
            String username = SCANNER.nextLine();

            System.out.println("Username " + username + " is " + (validUserName(username) ? "valid" : "invalid"));
        }

    }

    private static boolean validUserName(String username) {
        return username.matches("[a-zA-z0-9_]{3,15}");
    }
}
