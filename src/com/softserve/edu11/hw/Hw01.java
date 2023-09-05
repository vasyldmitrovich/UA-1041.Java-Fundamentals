package com.softserve.edu11.hw;

import java.util.Scanner;

public class Hw01 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a sentence of five words: ");
        String sentence = SC.nextLine();
        String[] words = sentence.split(" ");

        String maxWord = longestWord(words);

        System.out.printf("The longest word in the sentence is: '%s'%n", longestWord(words));

        System.out.printf("The number of letters in the longest word is: '%s'%n", maxWord.length());

        System.out.printf("The second word of the sentence in reverse order is: '%s'%n", reverse(words));
    }

    public static String longestWord(String[] words) {
        String longestWord = "";
        int lenght = 0;
        for (String word : words) {
            if (word.length() > lenght) {
                lenght = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }


    public static String reverse(String[] words) {
        StringBuilder word = new StringBuilder(words[1]);
        return word.reverse().toString();
    }
}
