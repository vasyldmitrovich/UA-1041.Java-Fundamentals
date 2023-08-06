package com.softserve.edu05.homeworktasks;

import static com.softserve.edu05.homeworktasks.Main.SCANNER;

public class FindInteger {
    private int[] numbers;

    public FindInteger() {
    }

    public FindInteger(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void userInput(FindInteger obj) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Number %s: ", i + 1);
            array[i] = SCANNER.nextInt();
        }
        setNumbers(array);
    }

    public void getPosition(FindInteger obj) {
        int secPos = 0;
        int count = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] >= 0 && count <= 2) {
                count++;
                secPos = i;
            }
        }
        System.out.println("Position of second positive number in array is: " + secPos);
        System.out.println("Position of second positive number is: " + (secPos + 1));
    }

    public void getMinimumValue(FindInteger obj){
        int minVal = 0;
        int count = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < minVal) {
                minVal = numbers[i];
                count = i;
            }
        }
        System.out.printf("\nMinimum value in array is: %s (Array index: %s). His position in array is: %s\n", minVal, count, count + 1);
    }

    public void promptFindNumber(FindInteger obj) {
        System.out.println("--------------------------------");
        System.out.println("Task #3");
        System.out.println("Please input the numbers");
        userInput(obj);
        getPosition(obj);
        getMinimumValue(obj);
        System.out.println("--------------------------------");
    }
}
