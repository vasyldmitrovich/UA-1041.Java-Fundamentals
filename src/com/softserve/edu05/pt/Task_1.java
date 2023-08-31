package com.softserve.edu05.pt;

import java.util.Arrays;

import static com.softserve.edu05.pt.App.SCANNER;

public class Task_1 {
    private static String[] arr1 = new String[5];
    private static Double[] arr2 = new Double[5];
    private static double sum;

    public static void getArrayString() {
        String line = SCANNER.nextLine();
        String[] items = line.split(",");
        for (int i = 0; i < 5; i++) {
            arr1[i] = items[i];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void getArrayInt() {
        String line = SCANNER.nextLine();
        String[] items = line.split(",");
        for (int i = 0; i < 5; i++) {
            arr2[i] = Double.parseDouble(items[i]);
            sum += Double.parseDouble(items[i]);
        }
        System.out.println("Average value is " + sum / 5);
    }

    public static void getPosition() {
        System.out.print("Input the number for searching: ");
        Double numberToFind = SCANNER.nextDouble();
        SCANNER.nextLine();
        Arrays.sort(arr2);
        int position = Arrays.binarySearch(arr2, numberToFind);
        if (position < 0) {
            System.out.println("The number " + numberToFind + " is missing from the array.");
        } else {
            System.out.println("The number " + numberToFind + " is in array.");
        }
    }

}
