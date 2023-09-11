package com.softserve.edu09.pt;

import java.util.Arrays;

import static com.softserve.edu05.pt.App.SCANNER;

public class Task_2 {
    private static String[] arr1;

    public static void getNumbersArray() {
        System.out.println("Input numbers separated by ','");
        String line = SCANNER.nextLine();
        //  String[] countKoma = (line.split(",",line.length()));
        int countKoma = 2;
        arr1 = new String[countKoma];
        String[] items = line.split(",");
        int count = 0;
        int countArray = 0;
        //need to check not 0
        for (int i = 0; i <= countKoma; i++) {
            if (i == 0) {
                arr1[i] = items[i];
                countArray = 1;
            } else {
                for (int j = 0; j < i; j++) {
                    if (arr1[i] == arr1[j]) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    arr1[i] = items[i];
                    countArray++;
                }
            }
        }
    }
}
