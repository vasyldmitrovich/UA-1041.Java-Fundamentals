package com.softserve.edu16.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) {
        Path pathToFileOne = Path.of("file1.txt");
        Path pathToFileTwo = Path.of("file2.txt");

        Path pathToJavaFile = Path.of("SmallestNumberToEdit.java");
        Path pathToEditedJavaFile = Path.of("editedJavaFile.java");

        firstTask(pathToFileOne, pathToFileTwo);

        secondTask(pathToJavaFile, pathToEditedJavaFile);
    }

    private static void firstTask(Path pathToFileOne, Path pathToFileTwo) {
        try (BufferedReader reader = Files.newBufferedReader(pathToFileOne); BufferedWriter writer = Files.newBufferedWriter(pathToFileTwo)) {
            int lineCounter = 0;
            String longestLine = "";
            String line;
            String dateOfBirth = "15.09.1997";

            while ((line = reader.readLine()) != null) {
                lineCounter++;
                writer.write(line);
                writer.newLine();

                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }

            writer.write(String.valueOf(lineCounter));
            writer.newLine();
            writer.write(longestLine);
            writer.newLine();
            writer.write(dateOfBirth);

            System.out.println("Was created \"file2.txt\" where was saved all information");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void secondTask(Path pathToJavaFile, Path pathToEditedJavaFile) {
        try (BufferedReader reader = Files.newBufferedReader(pathToJavaFile); BufferedWriter writer = Files.newBufferedWriter(pathToEditedJavaFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("public")) {
                    line = line.replaceAll("\\bpublic\\b", "private");
                }

                writer.write(line);
                writer.newLine();

            }
            System.out.println("Java file was edited and saved to a new file (.java)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
