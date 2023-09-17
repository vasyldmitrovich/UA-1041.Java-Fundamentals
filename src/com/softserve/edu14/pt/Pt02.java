package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;

public class Pt02 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
           var stats = primes.stream()
                   .mapToInt(i -> i)
                   .summaryStatistics();
        System.out.println("Quantity numbers in the List " + stats.getCount());
        System.out.println("Lowest number in the List: " + stats.getMin());
        System.out.println("Highest number in the List: " + stats.getMax());
        System.out.println("Sum of all numbers the List:  " + stats.getSum());
    }
}
