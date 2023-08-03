package com.softserve.edu04.practicaltask;
//In your local project mark directory src like source code
public enum Day {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "Пʼятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String en;
    private final String ua;

    Day(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}
