package com.softserve.edu11.hw.task_1;

import java.util.*;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input a sentence of five words:");
        String text = SCANNER.nextLine();
        String[] words = text.split(" ");
        int longInd = FindIndexLongestWord(words);
        System.out.printf("the longest word in the sentence is:%s,%n this word contains of %d letters.%n",
                words[longInd], words[longInd].length());
        System.out.printf("the second word of the sentence in reverse order: %s",
                reversWord(words[1]));


    }

    private static String reversWord(String word) {
        String revers;
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return String.valueOf(array);
    }

    private static int FindIndexLongestWord(String[] words) {
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[i - 1].length()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
