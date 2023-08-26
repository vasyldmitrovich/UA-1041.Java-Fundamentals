package com.softserve.edu11.hm;

public class ExploreWord {
    public String longestWord(String text){
        String[] words = text.split("\\s");
        String longest = "";
        int length = 0;
        for(String word: words) {
            if (word.length() > length) {
                length = word.length();
                longest = word;
            }
        }
        return longest;
    }

    public int NumOfLetters(String word){
        return word.length();
    }

    public String secondWordReverse(String text){
        String[] words = text.split("\\s");
        StringBuilder sb =  new StringBuilder(words[1]);
        return String.valueOf(sb.reverse());
    }
}
