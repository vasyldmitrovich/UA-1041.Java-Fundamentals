package com.softserve.edu11.Homework.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scan.nextLine();
        String modifiedSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("Correct sentence:");
        System.out.println(modifiedSentence);

    }
}
