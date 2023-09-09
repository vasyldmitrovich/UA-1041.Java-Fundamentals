package com.softserve.edu16.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        taskNumberOne();

        taskNumberTwo();
    }

    private static void taskNumberOne() throws IOException {
        Path pathToFile = Path.of("mytext.txt");
        List<String> lines = Files.readAllLines(pathToFile);

//      1) Count and write the number of symbols in every line
        lines.forEach(line -> System.out.println("Symbol Count: " + line.length() + ", Line: " + line));

//      2) Find the longest and the shortest line
        Optional<String> longestLine = lines.stream().max(Comparator.comparingInt(String::length));
        Optional<String> shortestLine = lines.stream().min(Comparator.comparingInt(String::length));

        longestLine.ifPresent(line -> System.out.println("Longest line: " + line));
        shortestLine.ifPresent(line -> System.out.println("Shortest line: " + line));

//      3) Find and write only that lines, which consist of word «var»
        List<String> linesWithVar = lines.stream().filter(line -> line.contains("var")).toList();

        System.out.println("\nLines containing \"var\": ");
        linesWithVar.forEach(System.out::println);
    }

    private static void taskNumberTwo() throws IOException {
        Path pathToFile = Path.of("mytext.txt");
        List<String> lines = Files.readAllLines(pathToFile);

        System.out.println("\nWords starting with a vowel:");
        lines.stream().flatMap(line -> Stream.of(line.split("\\s+"))).filter(word -> word.matches("[AEUIOaeuio].*")).forEach(System.out::println);

        System.out.println("\nWords with matching first and last letters in consecutive words:");
        for (var line : lines) {
            String[] splitLine = line.split("\\s+");
            for (int i = 1; i < splitLine.length; i++) {
                String word1 = splitLine[i - 1];
                String word2 = splitLine[i];

                char word1LastChar = word1.charAt(word1.length() - 1);
                char word2FirstChar = word2.charAt(0);

                if (word1LastChar == word2FirstChar) {
                    System.out.println(word1 + " -> " + word2);
                }
            }
        }
    }
}
