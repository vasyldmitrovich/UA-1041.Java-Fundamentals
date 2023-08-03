package com.softserve.edu05.practicaltasks;

import java.util.Arrays;

import static com.softserve.edu05.practicaltasks.Main.SCANNER;

public class Array {
    private String stringArray;

    public Array() {
    }

    public Array(String stringArray) {
        this.stringArray = stringArray;
    }

    public static boolean containsValueInArray(String[] splitString, String searchValue) {
        return Arrays.toString(splitString).contains(searchValue);
    }

    public String getStringArray(Array array) {
        return stringArray;
    }

    public void setStringArray(String stringArray) {
        this.stringArray = stringArray;
    }

    public void promptStringArray(Array array) {
        System.out.println("Input string array: ");
        String input = SCANNER.nextLine();
        setStringArray(input);
        sortStringArray(array);
        consistTheValue(array);
    }

    public void sortStringArray(Array array) {
        String[] splitString = stringArray.split(",\\s*");
        Arrays.sort(splitString);
        System.out.println("Sorted String: ");
        for (String item : splitString) {
            System.out.println(item);
        }
    }

    public void consistTheValue(Array array) {
        System.out.print("\nPlease provide the variable: ");
        String searchValue = SCANNER.nextLine();
        String[] splitString = stringArray.split(",\\s*");
        boolean containsValue = containsValueInArray(splitString, searchValue);
        System.out.printf("Array contains %s?: %s", searchValue, containsValue);
    }
}
