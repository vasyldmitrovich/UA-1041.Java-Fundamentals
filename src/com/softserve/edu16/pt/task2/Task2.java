package com.softserve.edu16.pt.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        var lines = getLinesFromFile("texts/mytext.txt");


        System.out.println("Words which start with vowels");
        var words = findWordsWithVowels(lines);

        System.out.println(words);

        System.out.println("All words for which the last letter of one word matches the first letter of the next word");

        var allWords = lines.stream()
                .flatMap(l -> Arrays.stream(l.split(" ")))
                .filter(w -> !w.isEmpty())
                .toList();


        for (int i = 0; i < allWords.size() - 1; i++) {
            String first = allWords.get(i);
            String second = allWords.get(i + 1);

            if (first.charAt(first.length()-1) == second.charAt(0)) {
                System.out.println(first + " " + second);
            }

        }
    }


    public static List<String> getLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (var br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static List<String> findWordsWithVowels(List<String> lines) {
        String vowels = "[aeiouAEIOU]\\w*";
        return lines.stream()
                .flatMap(l -> Arrays.stream(l.split(" ")))
                .filter(w -> w.matches(vowels))
                .toList();
    }


}
