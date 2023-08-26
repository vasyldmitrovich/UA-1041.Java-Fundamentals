package com.softserve.edu11.homeworktasks.task2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = "I     am   learning     Java  Fundamental";

        formatSentence();

        System.out.println(str1);
        formatSentence(str1);
    }

    private static void formatSentence() {
        System.out.println("Hello, please write down the sentence where you want to delete");
        String string =  SCANNER.nextLine();
        String formated = string.replaceAll("\\s+", " ");
        System.out.print("Formated sentence: ");
        System.out.println(formated);
        System.out.println();
    }

    private static void formatSentence(String str) {
        System.out.println("Formating....");
        String formated = str.replaceAll("\\s+", " ");
        System.out.print("Formated sentence: ");
        System.out.println(formated);
    }
}
