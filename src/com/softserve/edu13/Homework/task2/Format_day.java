package com.softserve.edu13.Homework.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Format_day {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        String today = formatter.format(LocalDate.now());
        System.out.println(today);
        var today1 = formatter.parse(today, LocalDate::from);
        System.out.println(today1);
        System.out.println(isValid(today));
        System.out.println(isValid("32.14.23"));

    }

    public static boolean isValid(String date) {
        try {
            DateTimeFormatter.ofPattern("MM.dd.yy").parse(date);
            return true;
        } catch(DateTimeParseException e){
                return false;
            }
            }
        }




