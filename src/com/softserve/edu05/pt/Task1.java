package com.softserve.edu05.pt;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Task1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String [] ARRAY={"cdsdcs","scscscsd","erfefefef","pojopokpojpo","qweqeqe"};
        int[] arayint= {9, 7, 6, 4, 1};
        int summ=0;
        boolean flag=false;
        int counter=0;
        Arrays.sort(ARRAY);
        /**
         * this loop sort the array of string
         */
        for (int i = 0; i < ARRAY.length; i++) {
            System.out.println(ARRAY[i]);
        }
        /**
         * this loop sums all elements of the array
         */
        for (int i = 0; i < 4; i++) {
            summ+=arayint[i];
        }
        System.out.println("the average value of 5 array elements: "+(summ/4));
        scanner.nextLine();
        System.out.println("input a number ");
        var users=scanner.nextLine();

        for (int i = 0; i < ARRAY.length; i++) {
            if(users.equals(ARRAY[i])){
                flag=true;
                counter++;
            }
        }

        System.out.println("your value: "+(users)+"the same value in the array: "+(flag)+"it value repeated: "+(counter));
    }
}