package com.softserve.edu11.pt.task1;

import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the first string: ");
        String firstStr = SCANNER.nextLine();
        System.out.print("Enter the second string: ");
        String secondStr = SCANNER.nextLine();

        System.out.println(firstStr + " contains " + secondStr + ": " + firstStr.contains(secondStr));
    }
}
