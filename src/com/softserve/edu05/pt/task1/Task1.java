package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = {"Sophia", "Ethan", "Bob", "Emily", "Olivia"};

        System.out.println("Names without sorting:");
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Names after sorting:");
        System.out.println(Arrays.toString(names));

        int[] numbers = {25, 10, 0, 12, 4};

        System.out.println("Averange of array: " + getAverange(numbers));

        System.out.print("Enter your num:");
        int num = SCANNER.nextInt();

        if (hasNum(numbers, num)) {
            System.out.println("Array has number " + num);
        }else {
            System.out.println("Array doesn't have number " + num);
        }

    }

    private static double getAverange(int[] numbers) {
        double sum = 0;

        for (var num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    private static boolean hasNum(int[] numbers, int num) {
        for (var n : numbers) {

            if (n == num) return true;
        }

        return false;
    }
}
