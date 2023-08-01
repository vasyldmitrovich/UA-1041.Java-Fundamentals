package com.softserve.edu04.pt.task_2;

public enum DayOfWeek {
    MONDAY("ПОНЕДІЛОК"), TUESDAY("ВІВТОРОК"),WEDNESDAY("СЕРЕДА"), THURSDAY("ЧЕТВЕРГ"), FRIDAY("П'ЯТНИЦЯ"), SATURDAY("СУБОТА"), SUNDAY("НЕДІЛЯ");
    private final String ua;
    DayOfWeek(String ua){
        this.ua=ua;
    }
    public String getUa(){
        return ua;
    }
}
