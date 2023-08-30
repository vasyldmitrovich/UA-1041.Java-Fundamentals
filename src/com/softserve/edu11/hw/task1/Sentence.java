package com.softserve.edu11.hw.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Sentence {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s");

        String longWord = theLongestWord(words);
        System.out.println("The longest word: " + longWord);
        System.out.println("The number of letters in the longest word: " + longWord.length());
        System.out.println("The second word in reverse: " + theReverseSecondWord(words));
    }

    public static String theLongestWord(String[] words){
        int sizeOfLongest = words[0].length();
        int indexOfLongest = 0;

        for (int i = 1; i < words.length; i++){
            if(words[i].length() > sizeOfLongest){
                indexOfLongest = i;
            }
        }
        return words[indexOfLongest];
    }

    public static String theReverseSecondWord(String[] words){
       return new StringBuilder(words[1]).reverse().toString();
    }
}