import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String file1Path = "C:/Users/Acer/myProj/UA-1041.Java-Fundamentals/src/com/softserve/edu16/hw/file1.txt";
        String file2Path = "C:/Users/Acer/myProj/UA-1041.Java-Fundamentals/src/com/softserve/edu16/hw/file2.txt";

        // Step 1
        String careerInfo = "I am a software developer.\n"
                + "I have been studying in the IT industry for 1 year.\n"
                + "I enjoy programming and solving complex problems.";
        writeToFile(file1Path, careerInfo);

        // Step 2
        List<String> lines = readLinesFromFile(file1Path);

        // Step 3
        int numLines = lines.size();
        String longestLine = findLongestLine(lines);
        String nameAndBirthday = "Name: Maryna Osypova\nBirthday: August 4, 2005";

        // Step 4
        StringBuilder result = new StringBuilder();
        result.append("1) Number of lines in file1.txt: ").append(numLines).append("\n");
        result.append("2) The longest line in file1.txt: ").append(longestLine).append("\n");
        result.append("3) ").append(nameAndBirthday);

        writeToFile(file2Path, result.toString());
    }

    // Helper method to write content to a file
    private static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to read lines from a file and store them in a list
    private static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    // Helper method to find the longest line in a list of strings
    private static String findLongestLine(List<String> lines) {
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }
}
