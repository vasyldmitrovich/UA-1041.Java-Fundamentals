package com.softserve.edu04.pt.DaysOfWeek;

import static com.softserve.edu04.pt.DaysOfWeek.LocalizedDay.*;
import static com.softserve.edu04.util.CollectInputs.inputNumberInt;

public class DaysOfWeek {
    private int numOfDay;

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public DaysOfWeek() {

    }

    public void enterNumOfDay() {
        this.numOfDay = inputNumberInt("Please enter number of day from 1 to 7");
    }

    public DaysOfWeek(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public void printDay() {
        switch (this.numOfDay) {
            case 1 -> {
                System.out.println(MONDAY.getEnglishName());
                System.out.println(MONDAY.getUkrainianName());
            }
            case 2 -> {
                System.out.println(TUESDAY.getEnglishName());
                System.out.println(TUESDAY.getUkrainianName());
            }
            case 3 -> {
                System.out.println(WEDNESDAY.getEnglishName());
                System.out.println(WEDNESDAY.getUkrainianName());
            }
            case 4 -> {
                System.out.println(THURSDAY.getEnglishName());
                System.out.println(THURSDAY.getUkrainianName());
            }
            case 5 -> {
                System.out.println(FRIDAY.getEnglishName());
                System.out.println(FRIDAY.getUkrainianName());
            }
            case 6 -> {
                System.out.println(SATURDAY.getEnglishName());
                System.out.println(SATURDAY.getUkrainianName());
            }
            case 7 -> {
                System.out.println(SUNDAY.getEnglishName());
                System.out.println(SUNDAY.getUkrainianName());
            }
            default -> {
                System.out.println("Unexpected day");
            }
        }
    }
}

