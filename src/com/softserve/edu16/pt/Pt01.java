package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Pt01 {
    public static void main(String[] args) throws IOException {

        var fileName = Path.of("C:/Users/maksi/Desktop/text.txt");
        String[] lines = Files.lines(fileName).toArray(String[]::new);

//        1) count and write the number of symbols in every line.
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Line " + i + " have " + lines[i].length() + " symbols");
        }
        System.out.println("==================================");
//        2) find the longest and the shortest line.

        var maxLine = Arrays.stream(lines).max(Comparator.comparing(String::length)).get();
        var minLine = Arrays.stream(lines).min(Comparator.comparing(String::length)).get();
        System.out.println("The longest line: " + "'" + maxLine + "'");
        System.out.println("The shortest line: " + "'" + minLine + "'");
        System.out.println("==================================");
//        3) find and write only that lines, which consist of word «var»
        Arrays.stream(lines).filter(l -> l.contains("var")).forEach(System.out::println);
    }

}
