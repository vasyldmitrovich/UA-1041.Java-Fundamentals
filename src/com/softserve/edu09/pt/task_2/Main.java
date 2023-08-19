package com.softserve.edu09.pt.task_2;

import java.util.*;

public class Main {
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intNumbers = getNumbers();
        System.out.println(Arrays.toString(intNumbers));

        System.out.println("numbers with out duplicate:");
        Set<Integer> noDupNumbers = new LinkedHashSet<>();
        for (var el : intNumbers
        ) {
            noDupNumbers.add(el);
        }
        System.out.println(noDupNumbers);

    }

    public static int[] getNumbers() {
        System.out.print("enters a set of numbers(use ','):");
        String lineNumbers = SC.nextLine();
        String[] stringNumbers = lineNumbers.split("\\s*,\\s*");
        int[] intNumbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        return intNumbers;
    }

}
