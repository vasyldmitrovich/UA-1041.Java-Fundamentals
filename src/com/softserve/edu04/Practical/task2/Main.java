package com.softserve.edu04.Practical.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Days days;
        System.out.println("Input number of day = ");
        Scanner input = new Scanner(System.in);
        int numDay = input.nextInt();


        switch (numDay) {
            case 1: days = Days.MONDAY;break;
            case 2: days = Days.TUESDAY;break;
            case 3: days = Days.WEDNESDAY;break;
            case 4: days = Days.THURSDAY;break;
            case 5: days = Days.FRIDAY;break;
            case 6: days = Days.SATURDAY;break;
            case 7: days = Days.SUNDAY;break;
            default:
                System.out.println("No found");
                return;

        }

        switch (days) {//Move this switch to some method like public static void day(String s)
            case MONDAY:
                System.out.println("Monday,Понеділок");break;
            case TUESDAY:
                System.out.println("TUESDAY, Вівторок");break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY, Середа");break;
            case THURSDAY:
                System.out.println("THURSDAY, Вівторок");break;
            case FRIDAY:
                System.out.println("FRIDAY, П'ятниця");break;
            case SATURDAY:
                System.out.println("SATURDAY, Субота");break;
            case SUNDAY:
                System.out.println("SUNDAY, Неділя");break;
        }


    }


}
