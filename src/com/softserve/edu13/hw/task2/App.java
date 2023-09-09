package com.softserve.edu13.hw.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        System.out.println(formatter.format(LocalDate.now()));
    }
}
