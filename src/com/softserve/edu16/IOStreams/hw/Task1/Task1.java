package com.softserve.edu16.IOStreams.hw.Task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\Користувач\\IdeaProjects\\UA-1041.Java-Fundamentals\\src\\com\\softserve\\edu16\\IOStreams\\hw\\Task1\\file.txt";
        String filePathW="C:\\Users\\Користувач\\IdeaProjects\\UA-1041.Java-Fundamentals\\src\\com\\softserve\\edu16\\IOStreams\\hw\\Task1\\file2.txt";

        String[] lines= Files.lines(Path.of(filePath)).toArray(String[]::new);

        People I=new People("Dmytro","27.06.2005");

        List<String>dataout=new ArrayList<>();
        dataout.add("number of lines:");
        dataout.add(numberOfLines(lines));
        dataout.add("number of max length lines:");
        dataout.add(MaxLine(lines));
        dataout.add("birthday:");
        dataout.add(I.toString());

        Files.write(Path.of(filePathW), dataout, StandardCharsets.UTF_8);


    }
    public static String  numberOfLines(String[]lines){
        int a=lines.length;
        return Integer.toString(a);
    }

    public static String  MaxLine(String[]lines){
        var Max = Arrays.stream(lines).
                max((line1, line2) -> Integer.compare(line1.length(), line2.length()));
        return new String(String.valueOf(Max.get().length()));

    }

}
