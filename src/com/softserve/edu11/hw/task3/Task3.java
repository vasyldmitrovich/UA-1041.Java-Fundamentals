package com.softserve.edu11.hw.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a sentence");
        String sentence = SCANNER.nextLine();


//        String sentence = "Enter text containing US currency formats: I bought a shirt for $25.99 and a book for $15";

        displayMatches(sentence);

    }

    private static void displayMatches(String sentence) {

        Matcher m = Pattern.compile("\\$\\d+(\\.\\d{2})?").matcher(sentence);


        while (m.find()) {
            System.out.println("Found instance: " + m.group());
        }
    }


}
