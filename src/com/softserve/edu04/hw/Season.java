package com.softserve.edu04.hw;

public enum Season {
    SUMMER("Summer", "Літо", 3),
    SPRING("Spring", "Весна", 2),
    WINTER("Winter", "Зима", 1),
    AUTUMN("Autumn", "Осінь", 4);
    private final String englishName;
    private final String ukranianName;
    private final int number;

    Season(String englishName, String ukranianName, int number) {
        this.englishName = englishName;
        this.ukranianName = ukranianName;
        this.number = number;
    }

    public String getEngSeason() {
        return this.englishName;
    }

    public String getUkSeason() {
        return this.ukranianName;
    }

    public void printUkSeason() {
        System.out.println("Назва сезону");
    }

    public int getNumber() {
        return this.number;
    }
}
