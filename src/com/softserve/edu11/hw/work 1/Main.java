import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a sentence of five words: ");
        String sentence = SCANNER.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + maxLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseWord(secondWord);
            System.out.println("Second word in reverse: " + reversedSecondWord);
        }
    }

    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}