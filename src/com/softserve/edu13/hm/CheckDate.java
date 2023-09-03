package com.softserve.edu13.hm;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckDate {

    public static void main(String[] args) {
        System.out.println(isValid("08.11.04"));
        System.out.println(isValid("25.25.25"));
    }
    public static boolean isValid(String date){
        try {
            DateTimeFormatter.ofPattern("MM.dd.yy").parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }

    }
}
