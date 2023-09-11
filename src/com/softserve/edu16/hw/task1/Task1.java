package com.softserve.edu16.hw.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IOException {

        var lines = Files.lines(Path.of("texts/file1.txt"))
                .toList();



        List<String> toFile = new ArrayList<>();

        toFile.add("Number of lines:" + lines.size());
        toFile.add("Longest line:" + lines.stream().max(Comparator.comparing(String::length)).get());
        toFile.add("My name is Roman. BirthDay is 25.04.2003");


        Files.writeString(Path.of("texts/file2.txt"), String.join("\n", toFile));

    }

}
