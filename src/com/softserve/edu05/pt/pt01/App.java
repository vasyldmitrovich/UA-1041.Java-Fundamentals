package com.softserve.edu05.pt.pt01;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("-= Sorting array =-");
        String[] strings = {"first", "third", "second"};
        System.out.println("Your array is: " + Arrays.toString(strings));
        App.sort(strings);
        System.out.println("=========================");

        System.out.println("-= Calculate the average =-");
        double[] numbers = {5, 12, 13.5, 14.9};
        System.out.println("Your array is: " + Arrays.toString(numbers));
        App.average(numbers);
        System.out.println("=========================");

        System.out.println("-= Search value =-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value from strings array upper: ");
        var searchPosition = sc.nextLine();
        var ix = search(strings, searchPosition);
        if (ix < 0) {
            System.out.println("Not found");
        } else {
            System.out.println("Is found in position " + ix);
        }
    }


    static void sort(String[] strings) {
        Arrays.sort(strings);
        System.out.println("Result: " + Arrays.toString(strings));
    }

    static void average(double[] numbers) {
        double sum = 0;
        for (var d : numbers) {
            sum += d;
        }
        double average = sum / numbers.length;
        System.out.println("The average value is " + average);
    }

    static int search(String[] data, String key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(key)) return i;
        }
        return -1;
    }
}


