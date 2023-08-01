package com.softserve.edu04.pt.Continents;

import static com.softserve.edu04.pt.Continents.Continent.*;
import static com.softserve.edu04.util.CollectInputs.inputString;
import static com.softserve.edu04.util.WorkingWithStrings.capitalizeString;

public class Countries {
    private String countryName;
    private String continent;

    public Countries() {

    }

    public Countries(String country) {
        this.countryName = capitalizeString(country);
    }

    public String getCountry() {
        return countryName;
    }

    public void setCountry(String country) {
        this.countryName = capitalizeString(country);
    }

    public String getContinent() {
        return continent;
    }

    public void enterNameOfCountry() {
        this.countryName = capitalizeString(inputString("Input Country"));
    }

    public void getContinentName() {
        switch (this.countryName) {
            case "Uganda", "Egypt", "Cameroon", "Central African Republic" -> {
                this.continent = AFRICA.getNameOfContinet();

            }
            case "Antarctica" -> {
                this.continent = ANTARCTICA.getNameOfContinet();
            }
            case "Sri Lanka", "India", "China", "Nepal", "Vietnam" -> {
                this.continent = ASIA.getNameOfContinet();

            }
            case "Australia", "Fiji", "New Zealand" -> {
                this.continent = AUSTRALIA.getNameOfContinet();

            }
            case "Ukraine", "Czech Republic", "United Kingdom" -> {
                this.continent = EUROPE.getNameOfContinet();

            }
            case "El Salvador", "Jamaica", "Mexico" -> {
                this.continent = NORTH_AMERICA.getNameOfContinet();

            }
            case "Brazil", "Bolivia", "Chile" -> {
                this.continent = SOUTH_AMERICA.getNameOfContinet();

            }
            default -> {
                System.out.println("This isn't existing country");
            }
        }
    }
}
