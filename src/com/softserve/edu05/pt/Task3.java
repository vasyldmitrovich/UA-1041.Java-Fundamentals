package com.softserve.edu05.pt;

import java.util.Arrays;

import static com.softserve.edu05.util.RandNums.getArrOfRandInts;

public class Task3 {
    private static final int[] arrayOfNums = getArrOfRandInts(10, -10, 11);
    private int biggestNum;
    private int sum;
    private int countOfNegative;
    private int countOfPositive;

    public static void runTask3() {
        Task3 t3 = new Task3();
        System.out.println("Default array: " + Arrays.toString(arrayOfNums));
        t3.loopThroughArray();
        t3.printMessage();
        if (t3.countOfPositive > t3.countOfNegative) {
            System.out.println("There are more positive numbers");
        } else if (t3.countOfPositive < t3.countOfNegative) {
            System.out.println("There are more negative numbers");
        } else {
            System.out.println("There are equal number of positive and negative values in the array");
        }
    }

    //This method will loop through arrrayOfNums and get biggestNum,sum,countOfNegative and countOfPositive
    //and assign this values to fields of object
    public void loopThroughArray() {//Good
        int biggestNum = arrayOfNums[0];
        int sum = 0;
        int countOfNegative = 0;
        int countOfPositive = 0;
        for (int n : arrayOfNums) {
            biggestNum = Math.max(n, biggestNum);
            if (n > 0) {
                sum += n;
                countOfPositive++;
            } else {
                countOfNegative++;
            }
        }
        this.biggestNum = biggestNum;
        this.sum = sum;
        this.countOfNegative = countOfNegative;
        this.countOfPositive = countOfPositive;
    }


    public void printMessage() {
        System.out.println( "Task3{" +
                "biggestNum=" + biggestNum +
                ", sum=" + sum +
                ", countOfNegative=" + countOfNegative +
                ", countOfPositive=" + countOfPositive +
                '}');
    }


}
