package com.softserve.edu11.hw;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String inputText = scanner.nextLine();
        String currencyPattern = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("US currency format:");
        while (matcher.find()) {
            String currencyMatch = matcher.group();
            System.out.println(currencyMatch);
        }
    }
}

