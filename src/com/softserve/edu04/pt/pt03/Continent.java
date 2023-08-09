package com.softserve.edu04.pt.pt03;

public enum Continent {
    EUROPE ("Europe"),
    AUSTRALIA ("Australia"),
    NORTH_AMERICA ("North America");

    private final String contName;

    Continent(String contName) {
        this.contName = contName;
    }

    public void getContName() {
        System.out.print("This is " + contName );
    }
}
