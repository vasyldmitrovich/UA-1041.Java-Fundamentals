package com.softserve.edu14.pt.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        var counter = primes.stream()
                .count();
        System.out.println(counter);

        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
    }
}
