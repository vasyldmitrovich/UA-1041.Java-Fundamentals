package com.softserve.edu10.homeworktask1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var set1 = putRandom();
        var set2 = putRandom();

        print(set1);
        print(set2);

        var set3 = union(set1, set2);
        var set4 = intersect(set1, set2);

        System.out.println("Union method");
        print(set3);
        System.out.println("Intersect method");
        print(set4);
    }

    private static Set<Integer> putRandom() {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(random.nextInt(10));
        }
        return set;
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        var result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
    private static Set<Integer> intersect(Set<Integer>set1, Set<Integer> set2) {
        var result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static void print(Set<Integer> set) {
        System.out.println(set);
    }
}
