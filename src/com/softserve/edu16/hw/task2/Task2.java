package com.softserve.edu16.hw.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) throws IOException {
        var task1 = Files.lines(Path.of("src/com/softserve/edu16/hw/task1/Task1.java")).collect(Collectors.joining("\n"));

        Files.writeString(Path.of("src/com/softserve/edu16/hw/task2/updatedCode.java"), task1.replaceAll("public", "private"));


    }
}
