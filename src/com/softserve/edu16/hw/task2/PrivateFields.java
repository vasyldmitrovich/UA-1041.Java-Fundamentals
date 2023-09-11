package com.softserve.edu16.hw.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class PrivateFields {
    public static void main(String[] args) throws IOException {

        String path = ".\\src\\com\\softserve\\edu16\\hw\\task2";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path, "filePrivate.txt")))) {
            Files.lines(Path.of(path, "filePublic.txt"))
                    .map(i -> i.replace("public", "private"))
                    .forEach(s -> {
                try {
                    bw.write(s);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}