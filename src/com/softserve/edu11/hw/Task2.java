package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        System.out.println("Enter the text ");
        String UsersText = scaner.nextLine();
        String cleanedText = UsersText.replaceAll("\\s+", " ");
        System.out.println(cleanedText);
//        String[] words = UsersText.split(" ");
//        String[] wordsWithoutSpace = new String[words.length];
//        for (int i = 0; i < words.length; i++) {
//            wordsWithoutSpace[i] = words[i].trim();
//
//        }
//        String resultText = "";
//        for (int i = 0; i < wordsWithoutSpace.length; i++) {
//            if (i != 0) {
//                resultText += " "; // Add a space separator if it's not the first word
//            }
//            resultText += wordsWithoutSpace[i];
//        }
//        System.out.println(resultText);
    }

}
