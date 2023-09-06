package com.softserve.edu10.hw.Task1;


import java.util.HashSet;
import java.util.Set;



public class Task1 {
    public static void main(String[] args) {

    Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6, 7);
    Set<Integer> set2 = Set.of(11, 2, 33, 4, 55, 6, 77);
    Set<Integer>setUnion= union(set1,set2);
    System.out.println(setUnion);
    Set<Integer>setIntersect=intersect(set1,set2);
    System.out.println(setIntersect);

}
    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        var result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        var result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}

