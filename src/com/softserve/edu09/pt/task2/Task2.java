package com.softserve.edu09.pt.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list = sc.nextLine();
        String[] elements = list.split(",\\s*");
        List<Integer> intElements = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            var el = Integer.parseInt(elements[i]);
            if (!intElements.contains(el)) {
                intElements.add(el);
            }
        }
        System.out.println(intElements);
    }
}
