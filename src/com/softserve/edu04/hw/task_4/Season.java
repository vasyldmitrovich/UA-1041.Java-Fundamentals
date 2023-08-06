package com.softserve.edu04.hw.task_4;

public enum Season {
    SPRING("Spring", "Весна"), SUMMER("Summer", "Літо"),
    AUTUMN("Autumn", "Осінь"), WINTER("Winter", "Зима");
    private final String en;
    private final String ua;

    Season(String en, String ua) {
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
