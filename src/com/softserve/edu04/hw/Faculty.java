package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.App.SCANNER;

public class Faculty {
    int numberOfStudents;
    static int countNumbersOfStudentsInUniversity;

    public Faculty() {
    }

    public Faculty(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static void inputDates() {
        System.out.print("Input the name of faculty: ");
        String facultyName = SCANNER.nextLine();
        System.out.print("Input the number of students of " + facultyName + " faculty: ");
        int numberOfStudents = SCANNER.nextInt();
        SCANNER.nextLine();
        countNumbersOfStudentsInUniversity += numberOfStudents;
    }


    public enum CurrentSeason {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
