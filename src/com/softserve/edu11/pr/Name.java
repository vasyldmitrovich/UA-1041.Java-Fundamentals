package com.softserve.edu11.pr;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String middleName = sc.nextLine();
        String result1 = "%s %c. %c.".formatted(lastName, firstName.charAt(0),
                middleName.charAt(0));
        System.out.println(result1);
        System.out.println(firstName);
        String result2 = "%s %s %s".formatted(firstName, middleName, lastName);
        System.out.println(result2);
    }
}
