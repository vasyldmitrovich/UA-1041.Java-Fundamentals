package com.softserve.edu13.hw.task4;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 1, 16);
        dayOfTheWeekOfBirthday(birthday);
    }

    public static void dayOfTheWeekOfBirthday(LocalDate birthday) {
        System.out.println("Day of week in the day of birthday: " + birthday.getDayOfWeek());
        var birthdayIn6Months = birthday.plusMonths(6);
        System.out.println("Day of week 6 months after the birthday: " + birthdayIn6Months.getDayOfWeek());
        var birthdayInAYear = birthday.plusMonths(12);
        System.out.println("Day of week 12 months after the birthday: " + birthdayInAYear.getDayOfWeek());
    }
}
