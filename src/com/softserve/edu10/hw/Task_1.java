package com.softserve.edu10.hw;

import java.util.*;

public class Task_1 {
    public static Set getRandom(int min, int max, int count) {
        var rnd = new Random();
        Set<Integer> randomSet = new HashSet<>();
        int countList = 10;
        for (int i = 0; i < count; i++) {
            randomSet.add(rnd.nextInt(min, max + 1));
        }
        return randomSet;
    }

    public static Set getUnion(Set<Integer> set1, Set<Integer> set2) {
        var union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static Set getIntersect(Set<Integer> set1, Set<Integer> set2) {
        var intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }
}
