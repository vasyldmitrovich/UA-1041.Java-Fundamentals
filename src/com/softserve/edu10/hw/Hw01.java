package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class Hw01 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(11, 99, 45, 21, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(4, 2, 3, 6, 99, 45));

        Set<Integer> testUnion = union(set1, set2);
        System.out.println("Union: " + testUnion);

        Set<Integer> testIntersect = intersect(set1, set2);
        System.out.println("Intersect: " + testIntersect);


    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

}
