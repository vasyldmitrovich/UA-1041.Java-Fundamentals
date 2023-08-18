package com.softserve.edu05.pt;

import java.util.Arrays;

import static com.softserve.edu05.util.CollectInputs.inputString;
import static com.softserve.edu05.util.RandNums.getArrOfRandInts;


public class Task1 {//Ok
    final static String[] strArr = {"Ivan", "Misha", "Grisha", "Ann", "Dasha"};
    final static int[] intArr = getArrOfRandInts(5, 0, 11);

    public static void runTask1() {
        task1_1();
        task1_2();
        task1_3();
    }

    static void task1_1() {
        String[] copyStrArr = strArr.clone();

        System.out.println("\nTask1.1:\n");
        System.out.println("Array before sorting:" + Arrays.toString(copyStrArr));
        Arrays.sort(copyStrArr);
        System.out.println("Array after sorting:" + Arrays.toString(copyStrArr));
    }

    static void task1_2() {
        int[] copyIntArr = intArr.clone();
        int sum = 0;
        for (int n : copyIntArr) {
            sum += n;
        }
        System.out.println("\nTask 1.2:\n");
        System.out.format("The average of %s : %.3f", Arrays.toString(copyIntArr), sum / (double) copyIntArr.length);
    }

    static void task1_3() {
        String[] copyOfArr = strArr.clone();
        Arrays.sort(copyOfArr);

        System.out.println("\nTask 1.3:\n");
        String nameToSearch = inputString("Please enter name you are searching for");
        boolean isHere = Arrays.binarySearch(copyOfArr, nameToSearch) > 0;
        if (isHere) {
            System.out.println("It's here!");
        } else {
            System.out.println("No,it's not here!");
        }
    }

}
