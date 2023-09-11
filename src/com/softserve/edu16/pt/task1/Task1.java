package com.softserve.edu16.pt.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IOException {

        String fileName = "texts/mytext.txt";

        var lines = getLinesFromFile(fileName);

        for (var line : lines) {
            System.out.println("Line:" + line + ". Count of symbols:" + line.length());
        }

        System.out.println("=".repeat(15));

        var longLine = lines.stream().max(Comparator.comparing(String::length));

        var shortLine = lines.stream().min(Comparator.comparing(String::length));

        longLine.ifPresent(l->System.out.println("Found longest line:" + l));
        shortLine.ifPresent(l->System.out.println("Found shortest line:" + l));


        System.out.println("=".repeat(15));

        List<String> linesContainVar = lines.stream().filter(s->s.contains("var")).toList();

        System.out.println("Lines which have var:");
        for (var line : linesContainVar) {
            System.out.println("Line:" + line);
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
}
