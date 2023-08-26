package com.softserve.edu11.hm;

public class OneSpace {
    public String removeExtraSpaces(String text) {
        String[] words = text.split("\\s+");
        return String.join(" ", words);
    }
}
