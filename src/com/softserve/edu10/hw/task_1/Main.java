package com.softserve.edu10.hw.task_1;

import java.util.*;

public class Main {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(set1);
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9, 10));
        System.out.println(set2);

        System.out.println("union sets:");
        Set<Integer> set3 = unionSets(set1, set2);
        System.out.println(set3);

        System.out.println("intersect sets:");
        Set<Integer> set4 = intersectSets(set1, set2);
        System.out.println(set4);

    }

    private static Set<Integer> unionSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new LinkedHashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }

    private static Set<Integer> intersectSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set4 = new LinkedHashSet<>();
        for (var el : set1
        ) {
            if (set2.contains(el)) {
                set4.add(el);
            }
        }
        return set4;
    }

}
