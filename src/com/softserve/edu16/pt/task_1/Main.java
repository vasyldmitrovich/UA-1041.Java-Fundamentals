package com.softserve.edu16.pt.task_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        var text = Files.lines(Path.of("mytext.txt"))
                .limit(20)
                .toList();
//  1) count and write the number of symbols in every line.
        for (int i = 0; i < text.size(); i++
        ) {
            System.out.println((i + 1) + "-th line contains:" + text.get(i).length() + " symbols");
        }

//  2) find the longest and the shortest line.
        String max = findMaxLine(text);
        System.out.println("the longest line: " + max);
        String min = findMinLine(text);
        System.out.println("the shortest line: " + min);

//  3) find and write only that lines, which consist of word «var»
        text.stream()
                .filter(s -> s.contains("Java"))
                .forEach(System.out::println);
    }

    private static String findMaxLine(List<String> text) {
        return text.stream()
                .max(Comparator.comparing(String::length))
                .get();
    }

    private static String findMinLine(List<String> text) {
        return text.stream()
                .min(Comparator.comparing(String::length))
                .get();
    }


}
