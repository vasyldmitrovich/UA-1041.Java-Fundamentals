package com.softserve.edu10.hm;

import java.util.HashSet;
import java.util.Set;

public class SetUnion {
    public static Set union(Set set1, Set set2) {
        Set s = new HashSet();
        for (Object object : set1) {
            s.add(object);
        }
        for (Object object : set2) {
            s.add(object);
        }
        return s;
    }


    public static Set intersect(Set set1, Set set2) {
        Set s = new HashSet();
        for (Object object : set1) {
            if (set2.contains(object)){
                s.add(object);
            }
        }
        return s;
    }
}

