package com.softserve.edu04.pt.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dayNumber;
        do {
            dayNumber = getDayNumber("Input the number of the day of the week(1-7):");
        }
        while (dayNumber < 1 || dayNumber > 7);

        DayOfWeek dayOfWeek = DayOfWeek.values()[dayNumber - 1];
        System.out.println(dayOfWeek + "(" + dayOfWeek.getUa() + ")");

    }

    public static int getDayNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
