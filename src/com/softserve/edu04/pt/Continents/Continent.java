package com.softserve.edu04.pt.Continents;

enum Continent {
    AFRICA("Africa"),
    ASIA("Asia"),
    AUSTRALIA("Australia"),
    EUROPE("Europe"),
    ANTARCTICA("Antarctica"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America");

    private final String nameOfContinent;

    Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinet() {
        System.out.println("This is " + nameOfContinent);
        return nameOfContinent;
    }
}
