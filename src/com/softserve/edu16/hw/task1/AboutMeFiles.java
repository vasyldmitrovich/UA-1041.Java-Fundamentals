package com.softserve.edu16.hw.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class AboutMeFiles {
    public static void main(String[] args) throws IOException {
        Path pathFrom = Path.of(".\\src\\com\\softserve\\edu16\\hw\\task1\\file1.txt");
        List<String> list = Files.readAllLines(pathFrom);

        Path pathTo = Path.of(".\\src\\com\\softserve\\edu16\\hw\\task1\\file2.txt");
        Files.writeString(pathTo, String.valueOf(list.size()));

        String longestString = list.stream().max(Comparator.comparing(String::length)).get();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathTo.toFile()))){
            bw.write(list.size() + "\n");
            bw.write(longestString + "\n");
            bw.write(list.get(0) + "\n");
            bw.write(list.get(1) + "\n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
