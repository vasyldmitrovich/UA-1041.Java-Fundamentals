import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "C:/Users/Acer/Desktop/input.java";
        String outputFilePath = "C:/Users/Acer/Desktop/output.java";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            boolean insideClass = false; // Flag to track if we are inside a class declaration

            while ((line = reader.readLine()) != null) {
                // Check if the line contains a class declaration
                if (line.contains("class ")) {
                    insideClass = true;
                }

                // Replace "public" with "private" in class attributes and methods
                if (insideClass && (line.contains("public ") || line.contains("public "))) {
                    line = line.replace("public ", "private ");
                }

                writer.write(line + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Java code modified successfully and saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
