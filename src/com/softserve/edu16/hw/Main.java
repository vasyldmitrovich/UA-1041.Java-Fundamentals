package com.softserve.edu16.hw;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        runTask1();
        runTask2();
    }
    public static void runTask2(){
        Path javaFilePathOne = Path.of("./src/com/softserve/edu01/pt/Task1.java");
        Path javaFilePathTwo = Path.of("./src/com/softserve/edu16/hw/EditedJava.java");
        System.out.println(javaFilePathTwo);
        try {
            List<String> lines = Files.readAllLines(javaFilePathOne);

            for (int i = 0; i < lines.size(); i++) {
                String modifiedLine;
                if(lines.get(i).contains("package")){
                    modifiedLine= "package com.softserve.edu16.hw";
                }else{
                    modifiedLine = lines.get(i).replaceAll("\\bpublic\\b", "protected");
                }
                lines.set(i, modifiedLine);
            }

            Files.write(javaFilePathTwo, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void runTask1(){
        Path filePathOne = Path.of("./src/com/softserve/edu16/hw/file1.txt");
        Path filePathTwo = Path.of("./src/com/softserve/edu16/hw/file2.txt");

        List<String> lines = readLinesFromFile(filePathOne);

        try {
            Files.writeString(filePathTwo, String.format(
                            "Number of lines in file1.txt: %d\n" +
                                    "Longest line in file1.txt: %s\n" +
                                    "My name: Ivan Holotsvan\n" +
                                    "Birthday: December 21, 2004\n",
                            lines.size(),
                            findLongestLine(lines).orElse("N/A")),
                    StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readLinesFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return List.of(); 
        }
    }
    public static Optional<String> findLongestLine(List<String> lines){
        return lines.stream()
                .max(Comparator.comparingInt(String::length));
    }
}
