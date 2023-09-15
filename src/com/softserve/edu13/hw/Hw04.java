package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Hw04 {
    public static void dateChange(LocalDate birthday) {
        var dayOfWeek = LocalDate.from(birthday).getDayOfWeek();
        var dayOfWeekAfterSixMonths = LocalDate.from(birthday).plusMonths(6).getDayOfWeek();
        var dayOfWeekAfterTwelveMonths = LocalDate.from(birthday).plusMonths(12).getDayOfWeek();

        System.out.println("Day of week is " + dayOfWeek);
        System.out.println("Day of week after 6 months is " + dayOfWeekAfterSixMonths);
        System.out.println("Day of week after 12 months is " + dayOfWeekAfterTwelveMonths);
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1988,8,25);
        System.out.println("Your birthday is " + birthday);
        dateChange(birthday);
    }
}
