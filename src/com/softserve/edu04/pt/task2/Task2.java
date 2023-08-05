package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class Task2 {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a day:");

        int numDay = SCANNER.nextInt();
        SCANNER.nextLine();

        if (numDay < 1 || numDay > 7) {
            System.out.println("Number of day is ");
        }else {

            Day day = getDay(numDay);

            System.out.println("This day has name in english - " + day.getEnglish()  + ", in ukrainian - " + day.getUkrainian());
        }


    }
//Good all is good
    private static Day getDay(int numDay) {
        return switch (numDay) {
            case 1 -> Day.MONDAY;
            case 2 -> Day.TUESDAY;
            case 3 -> Day.WEDNESDAY;
            case 4 -> Day.THURSDAY;
            case 5 -> Day.FRIDAY;
            case 6 -> Day.SATURDAY;
            case 7 -> Day.SUNDAY;
            default -> throw new IllegalStateException("Unexpected value: " + numDay);
        };
    }
}
