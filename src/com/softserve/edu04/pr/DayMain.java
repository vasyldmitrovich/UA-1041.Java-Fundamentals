package com.softserve.edu04.pr;

import java.util.Scanner;

public class DayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day in week:");
        int numberOfDay = sc.nextInt();
        switch (numberOfDay){
            case 1 -> System.out.println(DayOfWeek.Day.Mon.getGeneralInfo());
            case 2 -> System.out.println(DayOfWeek.Day.Tue.getGeneralInfo());
            case 3 -> System.out.println(DayOfWeek.Day.Wed.getGeneralInfo());
            case 4 -> System.out.println(DayOfWeek.Day.Thu.getGeneralInfo());
            case 5 -> System.out.println(DayOfWeek.Day.Fri.getGeneralInfo());
            case 6 -> System.out.println(DayOfWeek.Day.Sat.getGeneralInfo());
            case 7 -> System.out.println(DayOfWeek.Day.Sun.getGeneralInfo());
        }

    }
}
