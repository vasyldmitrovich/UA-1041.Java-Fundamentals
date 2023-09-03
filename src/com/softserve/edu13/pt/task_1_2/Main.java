package com.softserve.edu13.pt.task_1_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }
}
