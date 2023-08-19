package com.softserve.edu09.pr;

import java.util.*;

public class NumberSetMain {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String line = SCANNER.nextLine();
        String[] elements = line.split(",\\s*");

        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            int el = Integer.parseInt(elements[i]);
            list.add(el);
        }
        System.out.println(list);
    }
}
