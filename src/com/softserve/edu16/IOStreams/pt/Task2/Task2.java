package com.softserve.edu16.IOStreams.pt.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\Користувач\\IdeaProjects\\UA-1041.Java-Fundamentals\\src\\com\\softserve\\edu16\\IOStreams\\pt\\mytext.txt";
        String[] lines= Files.lines(Path.of(filePath)).toArray(String[]::new);
        startsVowel(lines);
        endAndFirst(lines);
    }
    public static void startsVowel(String[]lines) {
        System.out.println("line which starts word vowel: ");
        String vowel="EUIOA";
        Arrays.stream(lines).flatMap(line-> Pattern.compile("\\W+").splitAsStream(line))
                .filter(word->vowel.contains(word.substring(0,1))).forEach(System.out::println);
    }
    public static void endAndFirst(String[] lines) {
        Pattern pattern = Pattern.compile("([a-zA-Z]+)\\s+([a-zA-Z]+)");

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String firstWord = matcher.group(1);
                String secondWord = matcher.group(2);

                if (firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
                    System.out.println(firstWord + " " + secondWord);
                }
            }
        }
    }
}
