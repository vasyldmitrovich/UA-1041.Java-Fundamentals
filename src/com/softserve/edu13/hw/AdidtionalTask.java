package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;

////
public class AdidtionalTask {
    public static void main(String[] args) {
        Print();
    }

public static void Print(){
    int count=0;
    var first=LocalDate.ofYearDay(2023,1);
    var f=first.withDayOfMonth(13);
    for (int i = 0; i < 12; i++) {
        if(f.getDayOfWeek()== DayOfWeek.FRIDAY){
            System.out.println(f);
            count++;
        }
        f=f.plusMonths(1);
    }
}
}
