package com.softserve.edu05.hw.Task1;

import static com.softserve.edu05.util.CollectInputs.inputNumberInt;

public class MonthsDays {
    private static final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int numOfMonth;

    public int getNumOfMonth() {
        return numOfMonth;
    }

    public void setNumOfMonth() {
        int numOfMonth = inputNumberInt("Input number of month");
        if (numOfMonth < 1 || numOfMonth > 12) {
            System.out.println("Invalid month");
        } else {
            this.numOfMonth = numOfMonth;
        }
    }

    public void howMuchDaysInMonth() {
        System.out.println("In this month " + months[this.numOfMonth] + " days.");
    }

}
