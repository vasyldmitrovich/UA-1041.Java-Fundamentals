package com.softserve.edu14.pt.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Statistic {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics statistics = primes.stream()
                .mapToInt(i -> i)
                .summaryStatistics();

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Min: " + statistics.getMin());
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Sum: " + statistics.getSum());
    }
}
