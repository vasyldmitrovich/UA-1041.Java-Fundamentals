package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        var result = new HashSet<>(set1);

        Methods.union(set2, result);
        Methods.intersect(set2, result);
    }
}
