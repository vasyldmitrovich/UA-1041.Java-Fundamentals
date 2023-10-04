package com.softserve.edu16.Practica.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void   main(String[] args)  {
        String fileName = "C:\\Users\\User\\Desktop\\mytext.txt.txt";
        List<String> lines = readTheText(fileName);
        if (lines != null) {

            countLineLengths(lines);


            LongestAndShortestLine(lines);


            LinesWithWord(lines, "var");
        }
    }


      public static List<String> readTheText(String fileName) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public static void countLineLengths(List<String> lines) {
        System.out.println(" Number of symbols in each line:");
        for (String line : lines) {
            int length = line.length();
            System.out.println("Line: \"" + line + "\", Symbols: " + length);
            System.out.println("========");
        }
    }

    public static void LongestAndShortestLine(List<String> lines) {
        String shortestLine = lines.get(0);
        String longestLine = lines.get(0);

        for (String line : lines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }

            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println(" Shortest Line: " + shortestLine);
        System.out.println(" Longest Line: " + longestLine);
        System.out.println("========");
    }

    public static void LinesWithWord(List<String> lines, String word) {
        System.out.println(" Lines containing the word \"" + word + "\":");
        for (String line : lines) {
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}

