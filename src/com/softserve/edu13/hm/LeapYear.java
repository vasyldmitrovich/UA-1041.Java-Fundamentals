package com.softserve.edu13.hm;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LeapYear {
    public static boolean validateYear(int year) {
        LocalDate date = LocalDate.of(year, Month.FEBRUARY, 28);
        if (date.isLeapYear()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
    var a = LeapYear.validateYear(2004);
        System.out.println(a);
    }
}