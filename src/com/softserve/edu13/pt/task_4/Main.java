package com.softserve.edu13.pt.task_4;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] numbers = getArray();
        System.out.println(Arrays.toString(numbers));
        System.out.print("count all numbers:");
        System.out.println(count(numbers, num -> true));
        System.out.print("count even numbers:");
        System.out.println(count(numbers, num -> num % 2 == 0));
        System.out.print("count all positive numbers:");
        System.out.println(count(numbers, num -> num > 0));
        System.out.print("count all negative numbers:");
        System.out.println(count(numbers, num -> num < 0));
        System.out.print("count zeros numbers:");
        System.out.println(count(numbers, num -> num == 0));

    }

    private static int[] getArray() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(-10, 11);
        }
        return numbers;
    }

    private static int count(int[] numbers, Predicate<Integer> predicate) {
        int count = 0;
        for (var el : numbers
        ) {
            if (predicate.test(el)) {
                count++;
            }
        }
        return count;
    }
}
