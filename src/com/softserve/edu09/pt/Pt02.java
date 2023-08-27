package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pt02 {
    static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        String line = SC.nextLine();
        String[] elements = line.split(",\\s*");
        int[] intElements = new int[elements.length];
        for (int i = 0; i < intElements.length; i++) {
            intElements[i] = Integer.parseInt(elements[i]);
        }
        System.out.println("Your set of numbers is: " + Arrays.toString(intElements));

        System.out.println("\nRemove of duplicate elements in a string");
        List<Integer> list = new ArrayList<>();
        for (String element : elements) {
            int el = Integer.parseInt(element);
            if (!list.contains(el)) {
                list.add(el);
            }
        }
        System.out.println(list);

    }

}
