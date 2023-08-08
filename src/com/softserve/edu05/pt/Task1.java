package com.softserve.edu05.pt;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings = new String[] {"John", "Bill", "Alison"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        int[] ints = {145,32,5,65,9};
        findAverage(ints);


    }
    public static void findAverage(int[] args) {
        double average = 0;
        for(int i: args) {
            average += i;
        }
        System.out.println(average / args.length);
    }
}
