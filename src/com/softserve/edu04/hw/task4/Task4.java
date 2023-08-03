package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Task4 {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter the number of students: ");
        int numberOfStudents = SCANNER.nextInt();


        SCANNER.nextLine();
        if (numberOfStudents <= 0) System.out.println("Number of students is less than zero");

        else {

            System.out.print("Enter a season: ");
            String seasonChoice = SCANNER.nextLine();


            Season season = switch (seasonChoice.toLowerCase()) {
                case "winter" -> Season.WINTER;
                case "spring" -> Season.SPRING;
                case "summer" -> Season.SUMMER;
                case "autumn" -> Season.AUTUMN;
                default -> throw new RuntimeException("Doesn't exist season " + seasonChoice);
            };

            Faculty faculty = new Faculty(numberOfStudents, season);

            System.out.println("Faculty has " + faculty.getNumberOfStudents() + " students and current season " + faculty.getCurrentSeason().getName());

        }


    }


}
