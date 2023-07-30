package src.com.softserve.edu04.practicaltask;

public enum Continent {
    AFRICA ("Africa"),
    ANTARCTICA ("Antarctica"),
    ASIA ("Asia"),
    EUROPE ("Europe"),
    NORTH_AMERICA ("North America"),
    SOUTH_AMERICA ("South America"),
    AUSTRALIA ("Australia");

    private final String nameOfCont;

    Continent(String nameOfCont) {
        this.nameOfCont = nameOfCont;
    }

    public String getName() {
        return nameOfCont;
    }
}
