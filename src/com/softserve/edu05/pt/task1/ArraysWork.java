package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysWork {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] strings = {"Kyiv", "Kharkiv", "Chernivtsi", "Cherkasy", "Odessa", "Dnipro", "Rivne"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        int[] values = {5, 9, 3, 1, 45};

        System.out.println("Average value: " + culcAverage(values));
        System.out.print("Input the value, which you are looking for: ");
        int value = sc.nextInt();

        System.out.println(searchElement(values, value) ? "Array contains this value"
                :  "Array doesn\'t contain this value");
    }

    public static double culcAverage(int[] array){
        int sum = 0;
        for(int a : array){
            sum+=a;
        }
        return (double) sum / array.length;
    }

    public static boolean searchElement(int[] array, int value){
        Arrays.sort(array);
      //  return Arrays.binarySearch(array, value) >= 0;

        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] == value) return true;
            else if(array[mid] > value) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}