package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a sentence:");
        String sentence = SCANNER.nextLine();

        String[] words = sentence.split(" ");


        String longestWord = findLongestWord(words);

        System.out.println("Longest word: " + longestWord);

        System.out.println("Number of letters in longest word: " + longestWord.length());

        String reverseSecWord = getReverseSecondWord(words);

        System.out.println("Second word in reverse: " + reverseSecWord);



    }

    private static String findLongestWord(String[] words) {
        String longestWord = "";

        for (var word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    private static String getReverseSecondWord(String[] words) {
        return words.length < 2
                ? null
                : new StringBuilder(words[1])
                    .reverse()
                    .toString();
    }
}
