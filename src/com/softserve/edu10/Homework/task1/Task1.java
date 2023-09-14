package com.softserve.edu10.Homework.task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {


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
            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();

            // Заповнення множин
            set1.add("yellow");
            set1.add("blue");
            set1.add("green");

            set2.add("blue");
            set2.add("yellow");
            set2.add("red");


            Set<String> unionResult = union(set1, set2);
            System.out.println("Об'єднання множин: " + unionResult);


            Set<String> intersectResult = intersect(set1, set2);
            System.out.println("Перетин множин: " + intersectResult);
        }
    }

