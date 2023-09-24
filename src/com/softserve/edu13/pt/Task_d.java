package com.softserve.edu13.pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Task_d {
    public static int[] getRandom() {
        var rnd = new Random();
        List<Integer> newCollection = new ArrayList<>();
        int countItems = 10;
        int[] numbers = new int[countItems];
        for (int i = 0; i < countItems; i++) {
            numbers[i] = rnd.nextInt(-20, 21);
        }
        return numbers;
    }

    public static int count(int[] numbers, IntPredicate condition) {
        int counter = 0;
        for (int i : numbers) {
            if (condition.test(i)) counter++;
        }
        return counter;
    }

}
