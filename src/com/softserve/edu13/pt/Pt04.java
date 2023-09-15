package com.softserve.edu13.pt;

import java.util.function.IntPredicate;

public class Pt04 {
    public static int count(int[] numbers, IntPredicate conditions) {
        int counter = 0;
        for (int i : numbers) {
            if (conditions.test(i)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(count(elements, i -> i > 4));
        System.out.println(count(elements, i -> i % 2 == 0));
        System.out.println(count(elements, i -> true));
    }
}
