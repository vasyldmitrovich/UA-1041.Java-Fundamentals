package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;

public class Task_02 {

    public static int numberOfTheDay;

    public Task_02() {
    }

    public static int getNumberOfTheDay() {
        System.out.print("Input number of the day of the week: ");
        int numberOfTheDay = SCANNER.nextInt();
        SCANNER.nextLine();
        return numberOfTheDay;
    }

    public static void getNameOfTheDay(int numberOfTheDay) {

        String answer = switch (numberOfTheDay) {
            case 1 -> "Monday, Понеділок";
            case 2 -> "Tuesday, Вівторок";
            case 3 -> "Wednesday, Середа";
            case 4 -> "Thursday, Червер";
            case 5 -> "Friday, П'ятниця";
            case 6 -> "Saturday, Субота";
            case 7 -> "Sunday, Неділя";
            default -> "There are only 7 days in a week";
        };
        System.out.println(answer);
    }
}
