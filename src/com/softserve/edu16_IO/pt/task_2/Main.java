package com.softserve.edu16_IO.pt.task_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        var text = Files.lines(Path.of("mytext.txt"))
                .limit(50)
                .toList();
        System.out.println("--------");

//  1) find and output to the console all words starting with a vowel.
        beginVowels(text);
        System.out.println("--------");

//  2) find and output to the console all words for which the last letter of one word
//matches the first letter of the next word.
        lastOfFirstLetter(text);


    }

    private static void lastOfFirstLetter(List<String> text) {
        var splitter = Pattern.compile("\\W+");

        text.stream()
                .flatMap(splitter::splitAsStream)
                .filter(word -> word.length() > 0)
                .limit(200)
                .reduce((first, second) -> {
                    char lastChar = first.toLowerCase().charAt(first.length() - 1);
                    char firstChar = second.toLowerCase().charAt(0);
                    if (lastChar == firstChar) {
                        System.out.println((first + ',' + second));
                    }
                    return second;
                });


    }

    private static void beginVowels(List<String> text) {
        String vowels = "eyuioa";
        var splitter = Pattern.compile("\\W+");
        text.stream()
                .flatMap(splitter::splitAsStream)
                .filter(s -> vowels.contains(s.toLowerCase().substring(0, 1)))
                .limit(10)
                .forEach(System.out::println);
    }

}
