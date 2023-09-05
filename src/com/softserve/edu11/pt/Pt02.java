package com.softserve.edu11.pt;

import java.util.Scanner;

public class Pt02 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter last name: ");
        String lastName = SC.nextLine();

        System.out.println("Enter first name: ");
        String firstName = SC.nextLine();

        System.out.println("Enter middle name: ");
        String middleName = SC.nextLine();

        String s = "%s %c. %c.".formatted(
                lastName, firstName.charAt(0), middleName.charAt(0)
        );
        System.out.println(s);

        System.out.println(firstName);

        String s2 = "%s %s %s".formatted(
                firstName, middleName, lastName
        );
        System.out.println(s2);
    }
}
