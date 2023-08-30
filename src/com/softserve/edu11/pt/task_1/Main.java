package com.softserve.edu11.pt.task_1;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter text:");
        String text = SCANNER.nextLine();
        System.out.println("Enter subtext:");
        String subText = SCANNER.nextLine();
        System.out.println("text contains subtext: " + text.contains(subText));
    }
}
