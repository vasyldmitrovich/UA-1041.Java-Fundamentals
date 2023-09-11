package com.softserve.edu09.Practica.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        String line = scan.nextLine();
        String[] elements = line.split(",\\s*");
        List<Integer> list = new ArrayList<>();

        //int[] intElements = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            int element = Integer.parseInt(elements[i]);
            if (!list.contains(element)) {
                list.add(element);

            }
        }
        System.out.println(list);
    }
}
