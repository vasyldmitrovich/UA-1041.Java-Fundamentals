package edu10;

import java.util.HashSet;
import java.util.Set;

public class task1 {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        // Creating two sets and adding elements to them
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Testing the union and intersection methods
        Set<Integer> unionResult = union(set1, set2);
        Set<Integer> intersectResult = intersect(set1, set2);

        System.out.println("Set1: " + set1);
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectResult);
    }
}
