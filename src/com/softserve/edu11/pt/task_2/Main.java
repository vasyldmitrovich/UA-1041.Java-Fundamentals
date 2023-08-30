package com.softserve.edu11.pt.task_2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        FullName fullName = getFullName();
        String s1 = outputLastAndInit(fullName);
        System.out.println(s1);
        String s2 = outputFirst(fullName);
        System.out.println(s2);
        String s3 = outputFirstMiddleLast(fullName);
        System.out.println(s3);

    }

    private static String outputFirstMiddleLast(FullName fullName) {

        return "%s %s %s".formatted(
                fullName.getFirstName(),
                fullName.getMiddleName(),
                fullName.getLastName()
        );
    }

    private static String outputFirst(FullName fullName) {
        return fullName.getFirstName();
    }

    private static String outputLastAndInit(FullName fullName) {


        return "%s %s%s".formatted(
                fullName.getLastName(),
                fullName.getFirstName().charAt(0),
                fullName.getMiddleName().charAt(0)
        );

    }

    private static FullName getFullName() {
        FullName fullName = new FullName();
        System.out.println("Enter first name:");
        fullName.setFirstName(SCANNER.nextLine());
        System.out.println("Enter middle name:");
        fullName.setMiddleName(SCANNER.nextLine());
        System.out.println("Enter last name:");
        fullName.setLastName(SCANNER.nextLine());
        return fullName;
    }
}
