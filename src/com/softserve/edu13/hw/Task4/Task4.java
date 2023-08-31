package com.softserve.edu13.hw.Task4;

import java.time.LocalDate;


import static java.time.Month.*;

public class Task4 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2005, JANUARY, 27);
        birthday(date);
    }
    public static void birthday(LocalDate  year){
        LocalDate future6 = year.plusMonths(6);
        System.out.println("plus 6 month "+future6.getDayOfWeek());
        LocalDate future12 = year.plusMonths(12);
        System.out.println("plus 12 month "+future12.getDayOfWeek());
    }
}
