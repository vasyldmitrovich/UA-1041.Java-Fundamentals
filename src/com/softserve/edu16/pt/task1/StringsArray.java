package com.softserve.edu16.pt.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StringsArray {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("mytext.txt");

        List<String> strings = Files.readAllLines(path);

        strings.stream().map(i -> i.length()).forEach(System.out::println);

        String longestString = strings.stream().max(Comparator.comparing(String::length)).get();
        String shortestString = strings.stream().min(Comparator.comparing(String::length)).get();

        System.out.println("The longest string: " + longestString);
        System.out.println("The shortest string: " + shortestString);

        var st = strings.stream().filter(s -> s.contains("var")).collect(Collectors.toList());
        System.out.println("Strings, which contain word \"var\": " + st);
    }
}
