package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        runTask1();
        runTask2();
    }
    public static void runTask2(){
        try{
            //Output to console all words starting with vowels
            Path filePath = Path.of("./src/com/softserve/edu16/pt/mytext.txt");
            var lines = Files.readAllLines(filePath);
            lines.stream()
                    .flatMap((line)-> Stream.of(line.split("[\\s]+")))
                    .filter(word->word.matches("[aeuioAEUIO].*"))
                    .forEach(System.out::println);

            System.out.println("-".repeat(10));

            //Find and output to the console all words for which the last letter of one word
            //matches the first letter of the next word.
            for (var line:lines
            ) {
                String[] lineWords = line.split("\\s+");
                for (int i = 1; i < lineWords.length; i++) {
                    String curr = lineWords[i-1];
                    String next = lineWords[i];

                    if (curr.charAt(curr.length()-1)==next.charAt(0)) System.out.println(curr+" "+next);
                }
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void runTask1(){
        try {
            Path pathToFile = Path.of("./src/com/softserve/edu16/pt/mytext.txt");
            var lines = Files.readAllLines(pathToFile);

            //Count and write symbols number
            lines.forEach(line -> {
                System.out.format("Symbol count:%d Line:%s%n", line.length(),line);
            });
            //Find longest and shortest line
            IntSummaryStatistics statistics = lines.stream()
                    .mapToInt(String::length).summaryStatistics();
            System.out.println("Length of the longest string: " + statistics.getMax());
            System.out.println("Length of the shortest string: " + statistics.getMin());
            //Find and write line that contains "var"
            var varLines = lines.stream().filter(line->line.contains("var")).toList();
            System.out.println("Lines with var");
            varLines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
