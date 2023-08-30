package com.softserve.edu11.pt.task_2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        FullName fullName = getFullName();
        outputLastAndInit(fullName);
        outputFirst(fullName);
        outputFirstMiddleLast(fullName);

    }

    private static void outputFirstMiddleLast(FullName fullName) {
        System.out.printf("%s %s %s%n",
                fullName.getFirstName(),
                fullName.getMiddleName(),
                fullName.getLastName()
        );
    }

    private static void outputFirst(FullName fullName) {
        System.out.println(fullName.getFirstName());
    }

    private static void outputLastAndInit(FullName fullName) {
        System.out.format("%s %s%s%n",
                fullName.getLastName(),
                fullName.getFirstName().substring(0, 1).toUpperCase(),
                fullName.getMiddleName().substring(0, 1).toUpperCase()
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
