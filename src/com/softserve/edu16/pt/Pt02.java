package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class Pt02 {
    public static void main(String[] args) throws IOException {
        var fileName = Path.of("C:/Users/maksi/Desktop/text.txt");

//        1) find and output to the console all words starting with a vowel.

        var splitter = Pattern.compile("[^a-zA-Z'\\-]+");
        var vowels = "aeiouy";
        Files.lines(fileName)
                .flatMap(splitter::splitAsStream)
                .filter(word -> !word.isEmpty())
                .filter(word -> vowels.contains(word.substring(0, 1).toLowerCase()))
                .limit(20)
                .forEach(System.out::println);
        System.out.println("===============================");
//        2) find and output to the console all words for which the last letter of one word
//        matches the first letter of the next word.
        var words = Files.lines(fileName)
                .flatMap(splitter::splitAsStream)
                .filter(word -> !word.isEmpty())
                .toList();
        System.out.println(words.size());
        String prev = words.get(0);
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.charAt(0) == prev.charAt(prev.length() - 1)) {
                System.out.println(prev + " " + word);
            }
            prev = word;
        }
    }
}
