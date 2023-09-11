package edu11;

;

import java.util.*;

public class Task1 {
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
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
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