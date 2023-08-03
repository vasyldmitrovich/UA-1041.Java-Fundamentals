package com.softserve.edu05.homeworktasks;

import java.util.Arrays;

import static com.softserve.edu05.homeworktasks.Main.SCANNER;

public class DaysInMonth {
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int numOfMonth;


    public DaysInMonth(int numOfMonth) {
        DaysInMonth.numOfMonth = numOfMonth;
    }

    public DaysInMonth() {
    }

    public static void getDaysInMonth(DaysInMonth day) {
        if (numOfMonth < 1 || numOfMonth > 12) {
            throw new IllegalArgumentException("Invalid number of month!");
        }
        System.out.printf("Number of days is: %s\n", daysInMonth[numOfMonth - 1]);
    }

    public int getNumOfMonth() {
        return numOfMonth;
    }

    public void setNumOfMonth(int numOfMonth) {
        DaysInMonth.numOfMonth = numOfMonth;
    }

    public void promptUserInput(DaysInMonth day){
        System.out.println("--------------------------------");
        System.out.println("Task #1");
        System.out.print("Please input the number of month: ");
        int num = SCANNER.nextInt();
        setNumOfMonth(num);
        getDaysInMonth(day);
        System.out.println("--------------------------------");
    }
}
