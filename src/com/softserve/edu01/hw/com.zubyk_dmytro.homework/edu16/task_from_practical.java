package edu16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_from_practical {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input word");
        testWord = br.readLine();

        System.out.println("Input character");
        character = br.readLine();

        // Error 1: You don't need this line. It's not used in the loop.
        // character = testWord.substring(1, 1);

        // Error 2: You should use charAt(i) to get the character at position 'i' in the testWord.
        for (int i = 0; i < testWord.length(); i++) {
            // Error 3: You should compare the character at position 'i' with the input character.
            if (testWord.charAt(i) == character.charAt(0)) {
                countCharacters++;
            }
        }

        System.out.println("The character '" + character + "' appears " + countCharacters + " times in the word '" + testWord + "'");
    }
}
