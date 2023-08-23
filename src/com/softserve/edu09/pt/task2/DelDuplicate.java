package com.softserve.edu09.pt.task2;

import java.util.*;

public class DelDuplicate {
    public static void main(String[] args) {
       // String s = "1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7, 7, 8";
        System.out.println(deleteDuplicates(new Scanner(System.in).nextLine().split(",\\s")));
    }

    public static String deleteDuplicates(String[] array){
        return new LinkedHashSet<>(List.of(array))
                .toString().replace("]", "")
                .replace("[", "");
    }

}