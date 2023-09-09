package com.softserve.edu16_IO.hw.task_1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        var text = Files.lines(Path.of("mytext.txt"))
                .toList();
        Path file2 = Path.of("file2.txt");
        writeToOtherFile(text, file2);
        System.out.println("");
    }

    private static void writeToOtherFile(List<String> text, Path file2) throws IOException {
//  1) number of lines in file1.txt
        StringBuilder data = new StringBuilder("text contains: " + text.size() + " lines\n");

//  2) the longest line in file1.txt
        var longLine = text.stream()
                .max(Comparator.comparing(String::length))
                .get();
        data.append("the longest line: " + longLine + "\n");

//  3) your name and birthday date
        data.append("My name is Mykola,\nMy birthday 03.04.90");
        Files.writeString(file2, data);
    }
}
