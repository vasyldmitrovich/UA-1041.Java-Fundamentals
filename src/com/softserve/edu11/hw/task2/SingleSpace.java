package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class SingleSpace {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        System.out.println("Sentence with single space: " + createSingleSpace(input));
    }

    public static String createSingleSpace(String str){
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++){
            sb.append(" ").append(words[i]);
        }
        return sb.toString();

        /*    Which method better for memory and speed?    */

        /**
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        return str;
         */
    }
}