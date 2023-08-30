package com.softserve.edu11.hw.task_2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a sentence that contains words separated by more than one space:");
        String text = SCANNER.nextLine();
        String[] words = text.split("\\s+");
        for (var el : words) {
            System.out.print(el + " ");
        }
    }
}
