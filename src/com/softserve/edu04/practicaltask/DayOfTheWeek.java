package com.softserve.edu04.practicaltask;
//In your local project mark directory src like source code
import static com.softserve.edu04.practicaltask.Day.*;
import static com.softserve.edu03.homework1.Main.SCANNER;


public class DayOfTheWeek {
    private int numOfDay;

    public DayOfTheWeek() {
    }

    public DayOfTheWeek(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public static void promptDayName(DayOfTheWeek day) {
        System.out.print("\nInput the number of the day: ");
        int num = SCANNER.nextInt();
        day.setNumOfDay(num);
    }

    public int getNumOfDay(DayOfTheWeek day) {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }
    public void nameOfTheDay(DayOfTheWeek day) {
        switch (numOfDay) {
            case 1 -> {
                System.out.println(MONDAY.getEn());
                System.out.println(MONDAY.getUa());
            }
            case 2 -> {
                System.out.println(TUESDAY.getEn());
                System.out.println(TUESDAY.getUa());
            }
            case 3 -> {
                System.out.println(WEDNESDAY.getEn());
                System.out.println(WEDNESDAY.getUa());
            }
            case 4 -> {
                System.out.println(THURSDAY.getEn());
                System.out.println(THURSDAY.getUa());
            }
            case 5 -> {
                System.out.println(FRIDAY.getEn());
                System.out.println(FRIDAY.getUa());
            }
            case 6 -> {
                System.out.println(SATURDAY.getEn());
                System.out.println(SATURDAY.getUa());
            }
            case 7 -> {
                System.out.println(SUNDAY.getEn());
                System.out.println(SUNDAY.getUa());
            }
            default -> throw new IllegalStateException("Unexpected value: " + numOfDay);
        }
    }
}
