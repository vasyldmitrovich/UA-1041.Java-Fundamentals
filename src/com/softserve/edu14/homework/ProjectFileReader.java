package com.softserve.edu14.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectFileReader {

    public List<Product> readList() throws IOException {
        String fileName = "list.txt";
        List<Product> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String line1 = line.replaceAll("\\s+", ", ").replaceAll("\\.", ", ");
                String[] stringArray = line1.split(", ");
                String manufacture = stringArray[0];
                int year = Integer.parseInt(stringArray[1]);
                int month = Integer.parseInt(stringArray[2]);
                int date = Integer.parseInt(stringArray[3]);
                double price = Double.parseDouble(stringArray[4]);
                list.add(new Product(manufacture, year, month, date, price));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
