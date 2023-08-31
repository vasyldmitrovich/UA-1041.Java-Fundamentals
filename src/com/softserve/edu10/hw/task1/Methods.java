package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class Methods {
    public static void union(Set<Integer> set2, HashSet<Integer> result) {
        result.addAll(set2);
        System.out.println("Set after the union: " + result);
    }

    public static void intersect(Set<Integer> set2, HashSet<Integer> result) {
        result.retainAll(set2);
        System.out.println("Set after the intersection: " + result);
    }
}
