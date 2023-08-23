package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String lastName=scanner.nextLine();
        System.out.println("Enter your las name");
        String firstName=scanner.nextLine();
        System.out.println("Enter your middle name");
        String middleName=scanner.nextLine();
        char FirstLetterOfFirstName=firstName.charAt(0);
        char FirstLetterOfMiddleName=middleName.charAt(0);
        String initials=FirstLetterOfFirstName+"."+FirstLetterOfMiddleName+".";
        System.out.printf(toTitleCase(lastName)+" "+initials.toUpperCase());
    }
    public static String toTitleCase(String text){
        return Character.toTitleCase(text.charAt(0))+text.substring(1).toLowerCase();
    }
}

