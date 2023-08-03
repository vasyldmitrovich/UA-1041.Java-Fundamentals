package com.softserve.edu04.pt.task2;

public enum Day {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday","Середа"),

    THURSDAY("Thursday", "Четвер"),

    FRIDAY("Friday", "Пятниця"),

    SATURDAY("Saturday", "Субота"),

    SUNDAY("Sunday", "Неділя");


    private String english;
    private String ukrainian;

    Day(String english, String ukrainian) {
        this.english = english;
        this.ukrainian = ukrainian;
    }

    public String getEnglish() {
        return english;
    }

    public String getUkrainian() {
        return ukrainian;
    }
}
