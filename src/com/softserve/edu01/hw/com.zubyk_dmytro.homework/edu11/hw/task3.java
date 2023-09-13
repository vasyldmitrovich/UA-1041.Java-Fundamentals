package edu11.hw;

import java.util.regex.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text containing US currency formats: ");
        String inputText = scanner.nextLine();

        // Define a regular expression pattern to match US currency format
        String currencyPattern = "\\$\\d+\\.\\d{2}";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(currencyPattern);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(inputText);

        // Find and display all matches
        System.out.println("US Currency Formats found in the input text:");
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }

        // Close the scanner
        scanner.close();
    }
}
