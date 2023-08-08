package com.softserve.edu05.hw.task1;

import java.util.Arrays;

public class TenArray {

    private static int[] tenArray = {6, 8, 12, 96, 8, 34, -8, -16, 3, 11};

    public static void main(String[] args) {
        System.out.println("Our array: " + Arrays.toString(tenArray));
        System.out.println("Sum of first five elements if they positive: " +
                sumOfFirstOrProductOfLast(tenArray));
        tenArray[2]*=(-1);
        System.out.println("Product of last five elements if they not positive: " +
                sumOfFirstOrProductOfLast(tenArray));
    }
    public static int sumOfFirstOrProductOfLast(int... numbers){
        if(firstFiveIsPositive(numbers)){
            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum+=numbers[i];
            }
            return sum;
        } else {
            int product = 1;
            for (int i = numbers.length - 1, j = 0; j < 5; i--, j++ ){
                product*=numbers[i];
            }
            return product;
        }
    }

    private static boolean firstFiveIsPositive(int... numbers){
        for(int i = 0; i < 5; i++){
            if(numbers[i] < 0){
                return false;
            }
        }
        return true;
    }
}