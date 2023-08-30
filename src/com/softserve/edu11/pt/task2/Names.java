package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class Names {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter the middle name: ");
        String middleName = sc.nextLine();

        System.out.format("%s %c. %c.\n", lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.format("%s %s %s\n", firstName, middleName, lastName);
    }
}