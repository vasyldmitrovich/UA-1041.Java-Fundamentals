package com.softserve.edu16.pt.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WordsFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("mytext.txt");

        List<String> strings = Files.readAllLines(path);
        Pattern pattern = Pattern.compile("^[AEIOU]+");

        List<String> words = strings.stream().flatMap(s -> Arrays.stream(s.split("[\\s|.\\n]")))
                .toList();

        List<String> wordsStartVowel = words.stream()
                .filter(w -> pattern.matcher(w.toUpperCase()).find())
                .collect(Collectors.toList());

        System.out.println(wordsStartVowel);



//        List<String> sameLetters1 = new ArrayList<>();
//        for (int i = 0; i < words.size() - 1; i++){
//            String temporary = words.get(i);
//            String next = words.get(i + 1);
//            if(temporary.charAt(temporary.length() - 1) == next.charAt(0)){
//                sameLetters1.add(temporary);
//            }
//        }

        List<String> sameLetters = IntStream.range(0, words.size() - 1)
                        .filter(i ->  words.get(i).charAt(words.get(i).length() - 1) == words.get(i + 1).charAt(0))
                        .mapToObj(i -> words.get(i))
                        .collect(Collectors.toList());

        System.out.println(sameLetters);

    }
}
