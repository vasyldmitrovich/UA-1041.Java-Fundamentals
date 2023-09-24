package com.softserve.edu11.hw;

import java.util.Arrays;

public class Task_1 {
    public static String[] getWordsFromSentences(String sentence) {
        String[] words = sentence.split("\\W+");
        return words;
    }

    public static void getWordMaxLen(String[] array) {
        int maxLen = 0;
        String word = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != "" && array[i].length() > maxLen) {
                maxLen = array[i].length();
                word = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The longest word in the sentence is '" + word + "' (length=" + maxLen + ").");
    }

    public static void getSecondWord(String[] array) {
        if (array.length < 2) {
            System.out.println("Less than two words in a sentence");
        } else {
            var secondWordArr = new StringBuilder(array[1]);
            System.out.println("The second word of the sentence in reverse order: " + secondWordArr.reverse().toString());
        }
    }
}
