package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UISets {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(2, 5, 3, 7, 8));
        Set<Integer> set2 = new HashSet<>(List.of(5, 8, 9, 1));

        System.out.println(set1);
        System.out.println(set2);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println(unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println(intersectSet);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
}