package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a sentence");
        String sentence = SCANNER.nextLine();

        System.out.println("Updated sentence: " + removeWhiteSpaces(sentence));

    }


    private static String removeWhiteSpaces(String sentence) {
        return sentence.replaceAll("\\s+", " ");
    }
}
