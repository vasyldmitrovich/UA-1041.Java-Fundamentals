package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        var counterOfEmpty = list.stream()
                .filter(string -> string.isEmpty())
                .count();
        System.out.println(counterOfEmpty);

        var listWithoutEmpty = list.stream()
                .filter(string -> !string.isEmpty())
                .toList();
        System.out.println(listWithoutEmpty);

        var convertedAndSeperated = listWithoutEmpty.stream()
                .collect(Collectors.joining(", "))
                .toUpperCase();
        System.out.println(convertedAndSeperated);
    }
}
