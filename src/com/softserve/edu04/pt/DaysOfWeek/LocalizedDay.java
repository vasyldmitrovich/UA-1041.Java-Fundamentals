package com.softserve.edu04.pt.DaysOfWeek;

public enum LocalizedDay {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String englishName;

    private final String ukrainianName;

    LocalizedDay(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getUkrainianName() {
        return ukrainianName;
    }


}
