package com.softserve.edu11.homeworktasks.task1;

import java.util.*;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] stringList = new String[5];

        prompt(stringList);
        System.out.println(Arrays.toString(stringList));

        findLongestWordUserVersion(stringList);
        numberOfLetters(stringList, findLongestWordReturn(stringList));
        getIdOfLongestWord(stringList, findLongestWordReturn(stringList));
        reverseSecondWord(stringList);


    }
    public static void prompt(String[] stringList) {
        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = SCANNER.nextLine();
        }
    }

    public static void findLongestWordUserVersion(String[] stringList) {
        String str = Arrays.toString(stringList);
        String[] words = str.split("[,\\s]+");

        String longestWord = "";
        for (var word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word is: " + longestWord);
    }

    public static String findLongestWordReturn(String[] stringList) {
        String str = Arrays.toString(stringList);
        String[] words = str.split("[,\\s]+");

        String longestWord = "";
        for (var word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void getIdOfLongestWord(String[] stringList,String word) {
        int wordId = 0;
        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i].equals(word)) {
                wordId = i;
            }
        }
        System.out.println("Longest ID is (starting from '0'): " + wordId);
    }

    public static void numberOfLetters(String[] stringList, String word) {
        String longWord = findLongestWordReturn(stringList);
        char[] charArray = longWord.toCharArray();
        int numOfLetters =  charArray.length;
        System.out.println("Number of letters in longest word: " + numOfLetters);
    }

    public static void reverseSecondWord(String[] str) {
        StringBuilder word = new StringBuilder(str[1]);
        String reverse =  String.valueOf(word.reverse());
        System.out.println("Reversed second word is: " + reverse);
    }
}
