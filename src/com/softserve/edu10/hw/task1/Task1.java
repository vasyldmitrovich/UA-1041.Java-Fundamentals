package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 5, 7, 9));

        Set<Integer> set2 = new HashSet<>(Set.of(2, 3, 5, 7, 10, 12));


        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union: " + unionResult);


        Set<Integer> intersectionResult = intersect(set1, set2);
        System.out.println("intersection: " + intersectionResult);

    }


    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {

        Set<T> unionSet = new HashSet<>(set1);

        unionSet.addAll(set2);

        return unionSet;
    }


    private static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {

        Set<T> intersectedSet = new HashSet<>(set1);

        intersectedSet.retainAll(set2);

        return intersectedSet;
    }
}
