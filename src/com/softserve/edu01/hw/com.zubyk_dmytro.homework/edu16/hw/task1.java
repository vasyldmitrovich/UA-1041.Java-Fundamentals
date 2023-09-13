package edu16.hw;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 1) Number of lines in file1.txt
        int numberOfLines = lines.size();

        // 2) Find the longest line in file1.txt
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        // 3) Add your name and birthday date
        lines.add("Your Name: John Doe");
        lines.add("Birthday Date: January 1, 1990");

        // Write the results to file2.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"))) {
            bw.write("Number of lines in file1.txt: " + numberOfLines);
            bw.newLine();
            bw.write("Longest line in file1.txt: " + longestLine);
            bw.newLine();
            bw.write("Your Name: John Doe");
            bw.newLine();
            bw.write("Birthday Date: January 1, 1990");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

