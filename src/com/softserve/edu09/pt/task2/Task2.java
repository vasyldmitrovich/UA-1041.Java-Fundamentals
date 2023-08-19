package com.softserve.edu09.pt.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your numbers:");
        String line = SCANNER.nextLine();

        String[] strNumbers = line.split(",\\s*");

        for (var n : strNumbers) {
            int number = Integer.parseInt(n);

            if (!numbers.contains(number)) numbers.add(number);
        }

        System.out.println("Numbers:");
        System.out.println(numbers);
    }
}
