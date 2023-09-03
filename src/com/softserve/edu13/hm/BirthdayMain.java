package com.softserve.edu13.hm;

import java.time.LocalDate;

public class BirthdayMain {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 11, 8);
        Birthday.afterMonths(birthday);
    }
}
