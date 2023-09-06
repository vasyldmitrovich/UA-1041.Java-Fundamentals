package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static final List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
    public static final List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    public static void main(String[] args) {

        long count;

        //Task1
        System.out.println("Task1:\n");
        //Task1.1
        count = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.format("In list:%s%nThere are:%d empty elements%n", list, count);
        //Task1.2
        List<String> withoutEmptyList = list.stream().
                filter(item -> !item.isEmpty())
                .toList();
        System.out.format("List without empty spaces:%s%n", withoutEmptyList);
        //Task1.3
        String joinedString = withoutEmptyList.stream()
                .reduce((str1, str2) -> str1.toUpperCase() + ", " + str2.toUpperCase())
                .stream()
                .collect(Collectors.joining());
        System.out.format("Joined string:%s%n%n", joinedString);

        //Task2
        System.out.println("Task2:\n");
        IntSummaryStatistics stats = primes.stream()
                .mapToInt(x->x)
                .summaryStatistics();
        System.out.println("Count : " + stats.getCount());
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());

    }
}
