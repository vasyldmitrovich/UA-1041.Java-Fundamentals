package com.softserve.edu16.IOStreams.hw.Task2;

import java.io.*;


public class Task2 {
    public static void main(String[] args) throws IOException {
        String fileInput="C:\\Users\\Користувач\\IdeaProjects\\UA-1041.Java-Fundamentals\\src\\com\\softserve\\edu16\\IOStreams\\hw\\Task2\\Input.txt";
        String fileOutput="C:\\Users\\Користувач\\IdeaProjects\\UA-1041.Java-Fundamentals\\src\\com\\softserve\\edu16\\IOStreams\\hw\\Task2\\Output.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(fileInput));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput)))
        {

            String line;
            while ((line = br.readLine()) != null) {
                line=line.replaceAll(" public ", " private ");
                bw.write(line);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
