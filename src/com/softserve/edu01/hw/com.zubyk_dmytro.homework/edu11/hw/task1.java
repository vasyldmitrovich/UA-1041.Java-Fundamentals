package edu11.hw;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence of five words: ");
        String inputSentence = scanner.nextLine();

        // Split the input sentence into words
        String[] words = inputSentence.split(" ");

        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        // Find the longest word in the sentence
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        // Display the longest word and its length
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + maxLength);

        // Check if there are at least two words in the sentence
        if (words.length >= 2) {
            // Display the second word in reverse order
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("There are not enough words in the sentence to reverse the second word.");
        }

        // Close the scanner
        scanner.close();
    }

    // Helper function to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

