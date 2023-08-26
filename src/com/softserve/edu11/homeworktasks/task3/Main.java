package com.softserve.edu11.homeworktasks.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String inputText = "I bought a book for $15.99 and a coffee for $3.50 and €4,50";

        currencyFormats(inputText);
    }

    private static void currencyFormats(String inputText) {
        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("US currency formats found:");

        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }

}
