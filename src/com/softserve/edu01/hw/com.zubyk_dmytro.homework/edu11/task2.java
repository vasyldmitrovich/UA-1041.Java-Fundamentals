package edu11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence with consecutive spaces: ");
        String inputSentence = scanner.nextLine();

        // Replace consecutive spaces with a single space
        String cleanedSentence = inputSentence.replaceAll("\\s+", " ");

        System.out.println("Result: " + cleanedSentence);

        // Close the scanner
        scanner.close();
    }
}
