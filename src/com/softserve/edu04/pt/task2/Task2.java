package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class Task2 {
    public static int getNumber(String number) {
        Scanner sc = new Scanner(System.in);
        System.out.print(number);
        return sc.nextInt();
    }

    private static void getDay(int dayOfWeek) {
        String answers = switch (dayOfWeek) {
            case 1 -> "Monday, Понеділок";
            case 2 -> "Tuesday, Вівторок";
            case 3 -> "Wednesday, Середа";
            case 4 -> "Thursday, Четвер";
            case 5 -> "Friday, П'ятниця";
            case 6 -> "Saturday, Субота";
            case 7 -> "Sunday, Неділя";
            default -> "Wrong number of the day of the week";
        };
        System.out.println(answers);
    }

    public static void main(String[] args) {
        int dayOfWeek = getNumber("Input the number of the day of the week: ");
        getDay(dayOfWeek);
    }
}
