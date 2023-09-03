package com.softserve.edu14.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

//        Print how many empty strings are in list
        countEmptyStrings(list);

//        Remove all empty Strings from list
        removeEmptyStrings(list);

//        Convert String to uppercase and Join them with coma
        convertToUpperCaseWithComa(list);

//        Task#2 Calculate count, min, max, sum, for numbers and print all results of given collection
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stats = primes.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getSum());
        System.out.println(stats.getCount());
    }

    private static void convertToUpperCaseWithComa(List<String> list) {
        System.out.println(list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(", ")));
    }

    private static void removeEmptyStrings(List<String> list) {
        System.out.println(list.stream()
                .filter(s -> !s.isEmpty())
                .toList());
    }

    public static void countEmptyStrings(List<String> list) {
        System.out.println(list.stream()
                .filter(String::isEmpty)
                .count());
    }
}