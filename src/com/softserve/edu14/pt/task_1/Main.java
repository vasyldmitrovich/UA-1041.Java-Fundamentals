package com.softserve.edu14.pt.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println("Original list:");
        System.out.println(list);

        System.out.println("In this list are " + countEmpty(list) + " empty strings");

        System.out.println("List without empty strings:");
        System.out.println(withoutEmpty(list));

        System.out.println("joined strings in uppercase with coma: " + joinStrings(list));


    }

    private static long countEmpty(List<String> list) {
        return list.stream()
                .filter(String::isEmpty)
                .count();
    }

    private static List<String> withoutEmpty(List<String> list) {
        return list.stream()
                .filter(str -> !str.isEmpty())
                .toList();
    }

    private static String joinStrings(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
    }

}