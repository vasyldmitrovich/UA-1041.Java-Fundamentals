package com.softserve.edu16.hw.hw01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hw01 {
    public static void main(String[] args) throws IOException {
        var text1 = Path.of("./src/com/softserve/edu16/hw/hw01/file1.txt");
        var text2 = Path.of("./src/com/softserve/edu16/hw/hw01/file2.txt");
        String[] lines = Files.lines(text1).toArray(String[]::new);
        var numberOfLines = Arrays.stream(lines).count();
        var maxLine = Arrays.stream(lines).max(Comparator.comparing(String::length)).get();

        List<String> addText = new ArrayList<>();
        addText.add("Number of lines in file1.txt: " + numberOfLines);
        addText.add("The longest line in file1.txt: " + "'" + maxLine + "'");
        addText.add("My name Max, My birthday 25.07.1988");

        Files.write(Path.of(text2.toUri()), addText);

    }
}
