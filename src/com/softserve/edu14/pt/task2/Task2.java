package com.softserve.edu14.pt.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();


        System.out.println("Count of primes: " + stats.getCount());
        System.out.println("Min number: " + stats.getMin());
        System.out.println("Max number: " + stats.getMax());
        System.out.println("sum of primes: " + stats.getSum());

    }
}
