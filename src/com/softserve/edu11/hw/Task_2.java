package com.softserve.edu11.hw;

import java.util.ArrayList;

public class Task_2 {
    public static ArrayList getListFromSentence(String sentence) {
        String[] words = sentence.split(" ");
        var list = new ArrayList();
        for (var word : words) {
            if (word != "") {
                list.add(word);
            }
        }
        return list;
    }

    public static void removeDoubleGap(ArrayList list) {
        var listToString = list.toString();
        var newSentences = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                newSentences.append(list.get(i));
            } else {
                newSentences.append(list.get(i) + " ");
            }
        }
        System.out.println(newSentences);
    }
}
