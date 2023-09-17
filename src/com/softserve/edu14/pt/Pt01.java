package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pt01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        System.out.println("Your List: " + list);
        var empty = list.stream()
                .filter(s -> s.equals(""))
                .count();
        System.out.println("Empty strings in this list: " + empty);

        var notEmpty = list.stream()
                .filter(s -> !s.equals(""))
                .toList();
        System.out.println("Removing all empty Strings: " + notEmpty);
        var convert = list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println("Converted String to uppercase : " + convert);
    }
}
