package com.softserve.edu05.pt.task3;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int[] array = randomGenerator(10);
        System.out.println("Array with random values: " + Arrays.toString(array));
        System.out.println("The biggest number in the array: " + biggestNumber(array));
        System.out.println("Sum of positive numbers: " + sumOfPositiveNumbers(array));
        System.out.println("Count of negative numbers: " + countOfNegativeNumbers(array));
        determinePositiveOrNegative(array);
    }

    public static int[] randomGenerator(int count){
        int[] array = new int[count];
        Random r = new Random();
      //  return Arrays.stream(array).map(operand -> r.nextInt(-1000, 1000)).toArray();

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(-1000, 1000);
        }
        return array;
    }

    public static int biggestNumber(int[] array){
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int sumOfPositiveNumbers(int[] array){
       // return Arrays.stream(array).filter(a -> a > 0).sum();

        int sum = 0;
        for(int a : array){
            if(a > 0) sum+=a;
        }
        return sum;
    }

    public static int countOfNegativeNumbers(int[] array){
       // return (int) Arrays.stream(array).filter(a -> a < 0).count();

        int count = 0;
        for(int a : array){
            if(a < 0) count++;
        }
        return count;
    }

    public static void determinePositiveOrNegative(int[] array){
        int countOfNegative = countOfNegativeNumbers(array);
        int countOfPositive = array.length - countOfNegative;
        if(countOfPositive > countOfNegative){
            System.out.println("There are more positive values in the array");
        } else if(countOfPositive < countOfNegative){
            System.out.println("There are more negative values in the array");
        } else System.out.println("There are an equal number of positive and negative values in the array");
    }
}
