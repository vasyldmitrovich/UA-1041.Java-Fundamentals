package com.softserve.edu10.hm;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("First");
        set1.add("Second");
        set1.add("Third");

        set2.add("Fourth");
        set2.add("Fifth");
        set2.add("Third");
        set2.add("First");
        set2.add("Sixth");
        Set newSet1 = SetUnion.union(set1, set2);
        System.out.println(newSet1);
        Set newSet2 = SetUnion.intersect(set1, set2);
        System.out.println(newSet2);
    }
}
