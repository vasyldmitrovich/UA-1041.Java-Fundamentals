package com.softserve.edu14.pt.task_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stat = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println("count:" + stat.getCount());
        System.out.println("min:" + stat.getMin());
        System.out.println("max:" + stat.getMax());
        System.out.println("sum:" + stat.getSum());

    }
}
