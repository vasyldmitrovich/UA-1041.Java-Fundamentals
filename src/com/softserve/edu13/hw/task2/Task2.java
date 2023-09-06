package com.softserve.edu13.hw.task2;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {


        String date1 = "24.24.43";

        System.out.println("Date " + date1 + " is " + (!isValid(date1) ? "in" : "") + "valid");

        String date2 = "04.26.23";

        System.out.println("Date " + date2 + " is " + (!isValid(date2) ? "in" : "") + "valid");

    }

    public static boolean isValid(String date) {
        try {

            DateTimeFormatter.ofPattern("MM.dd.yy").parse(date);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }


}
