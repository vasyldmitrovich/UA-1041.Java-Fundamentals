package com.softserve.edu04.hw.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfStudents;
        Season currentSeason = null;

        for (; ; ) {
            numberOfStudents = getNumber("Enter the number of students: ");
            if (numberOfStudents > 0) {
                break;
            } else {
                System.out.println("wrong number, try again!");
            }
        }

        for (; ; ) {
            String inputSeason = getString("Enter a season in EN: ");

            for (var season : Season.values()
            ) {
                if (inputSeason.toUpperCase().equals(season.name())) {
                    currentSeason = Season.valueOf(inputSeason.toUpperCase());

                }

            }
            if (currentSeason != null) {
                break;
            } else {
                System.out.println("wrong season, try again!");
            }
        }


        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println(faculty);


    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }
}
