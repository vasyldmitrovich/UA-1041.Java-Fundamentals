package com.softserve.edu13.hm;

import java.time.LocalDate;

public class Birthday {
    LocalDate birthday = LocalDate.of(2004,11,8);
    public static void afterMonths(LocalDate date){
        System.out.println(date.getDayOfWeek());
        var after6Month = date.plusMonths(6);
        System.out.println(after6Month.getDayOfWeek());
        var after12Month = date.plusMonths(12);
        System.out.println(after12Month.getDayOfWeek());
    }
}
