package com.softserve.edu04.util;

public class WorkingWithStrings {
    public static String capitalizeString(String str) {
        str.replace("_"," ");
        String[] words = str.split(" ");
        StringBuilder capitalizedStr = new StringBuilder(" ");
        for (String word : words
        ) {
            capitalizedStr.append(capitalizeWord(word)).append(" ");
        }
        return capitalizedStr.toString().strip();
    }

    public static String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
