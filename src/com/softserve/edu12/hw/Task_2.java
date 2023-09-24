package com.softserve.edu12.hw;

import java.util.*;

public class Task_2 {
    static final Scanner SCANNER = new Scanner(System.in);

    public static int readNumber(int start, int end) {
        System.out.print("Enter the number: ");
        int num = Integer.parseInt(SCANNER.nextLine());
        if (num < start || num > end) {
            System.out.println("Out of range.");
        }
        if (end < start) {
            System.out.println("Incorrect range.");
        }
        return num;
    }

    public static List getRange() {
        var rnd = new Random();
        List<Integer> range = new ArrayList<>();
        int first = rnd.nextInt(1, 91);
        range.add(first);
        for (int i = 1; i < 10; i++) {
            range.add(first+i);
        }
        return range;
    }
}

