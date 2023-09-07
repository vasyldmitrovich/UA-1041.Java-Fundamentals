package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        System.out.println("Count of empty values: " + list.stream()
                .filter(String::isEmpty).count());

        System.out.println(list.stream()
                .filter(value -> !value.isEmpty()).collect(Collectors.toList()));

        System.out.println(list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(",")));
    }
}
