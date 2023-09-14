package com.softserve.edu16.IOStreams.pt.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;



public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println();
        String filePath="C:\\Users\\Користувач\\IdeaProjects\\UA-1041.Java-Fundamentals\\src\\com\\softserve\\edu16\\IOStreams\\pt\\mytext.txt";
        String[] lines= Files.lines(Path.of(filePath)).toArray(String[]::new);
        countInOneLine(lines);
        MaxLine(lines);
        MinLine(lines);
        containsVar(lines);

    }
    public static void countInOneLine(String[] lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i+1)+" line: "+lines[i]);
            System.out.println("contain: "+lines[i].length()+" chars");
            System.out.println();
        }
    }
    public static void MaxLine(String[] lines){
        System.out.println(("longest line is:"));
        String Maxline=null;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].length()>max){
                max= lines[i].length();
                Maxline=lines[i];
            }
        }

        System.out.print(Maxline+" SIZE: ");
        System.out.println(max);
        System.out.println();
    }
    public static void MinLine(String[]lines){
        System.out.println(("the shortest line is:"));
        var Min = Arrays.stream(lines).
                min((line1, line2) -> Integer.compare(line1.length(), line2.length()));
        String min= Min.get();
        System.out.print(min+" SIZE: ");
        System.out.println(min.length());
        System.out.println();

    }
    public static void containsVar(String[]lines){
        System.out.println("line which contains word var: ");
        Arrays.stream(lines)
                .filter(line->line.contains("var")).forEach(System.out::println);
    }
}
