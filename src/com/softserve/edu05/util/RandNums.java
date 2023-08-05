package com.softserve.edu05.util;

import java.util.Random;

public class RandNums {
    final static Random rand = new Random();

    public static int[] getArrOfRandInts(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    public static int[] getArrOfRandInts(int size, int origin, int bound) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(origin, bound);
        }
        return arr;
    }

    public static int randInt(int origin, int bound) {
        return rand.nextInt(origin, bound);
    }
}
