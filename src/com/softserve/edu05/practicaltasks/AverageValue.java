package com.softserve.edu05.practicaltasks;

import java.util.Arrays;

import static com.softserve.edu05.practicaltasks.Main.SCANNER;

public class AverageValue {
    private int[] averageArray;

    public AverageValue() {
    }

    public AverageValue(int[] averageArray) {
        this.averageArray = averageArray;
    }

    public static boolean containsValueInArray(int[] array, String searchValue) {
        return Arrays.toString(array).contains(searchValue);
    }

    public int[] getAverageArray(AverageValue obj) {
        return averageArray;
    }

    public void setAverageArray(int[] averageArray) {
        this.averageArray = averageArray;
    }

    public void promptAverageValue(AverageValue obj) {
        System.out.println("Practical task #1");
        userInputNumber(obj);
//        System.out.println("User set array: " + Arrays.toString(getAverageArray(obj)));
        getAverage(obj);
        System.out.println("-------------");
        consistTheValue(obj);
    }

    public void userInputNumber(AverageValue obj) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Please input number in the row %s: ", i + 1);
            array[i] = SCANNER.nextInt();
        }
        setAverageArray(array);
    }

    public void getAverage(AverageValue obj) {
        int[] array = getAverageArray(obj);
        int sum = 0;
        int count = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        average = sum / (double) count;
        System.out.println("The average of array is: " + average);
    }

    public void consistTheValue(AverageValue obj) {
        System.out.println("Please provide the variable: ");
        SCANNER.nextLine();
        String searchValue = SCANNER.nextLine();
        int[] array = getAverageArray(obj);
        boolean containsValue = containsValueInArray(array, searchValue);
        System.out.printf("Array contains %s?: %s", searchValue, containsValue);
    }
}
