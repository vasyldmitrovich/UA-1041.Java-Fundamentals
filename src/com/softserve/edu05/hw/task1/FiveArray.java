package com.softserve.edu05.hw.task1;

import java.util.Arrays;

public class FiveArray {

    private final static int[] fiveArray = {54, -243, -1278, 8, -25};

    public static void main(String[] args) {
        System.out.println("Our array: " + Arrays.toString(fiveArray));
        System.out.println("Position of second positive number: " + positionSecondPositive(fiveArray));
        System.out.println("Minimum value and its\' position: " + Arrays.toString(minAndPosition(fiveArray)));
        System.out.println("Product of even numbers: " + productEvenNumbers(fiveArray));
    }

    public static int positionSecondPositive(int... array){
        int s = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                s++;
            }
            if(s == 2) return i;
        }
        return -1;
    }

    public static int[] minAndPosition(int... array){
        int min = array[0];
        int pos = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        return new int[] {min, pos};
    }

    public static long productEvenNumbers(int... array){
        if(array.length == 0) return -1;
       // return Arrays.stream(array).filter(a -> a % 2 == 0).reduce((a1, a2) -> a1 * a2).getAsInt();
        long product = 1;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2 == 0 && array[i] != 0)
                product*=array[i];
        }
        return product;
    }

}