package com.softserve.edu04.pt.task3;

import java.util.Scanner;

public class Task3 {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a name of country: ");
        String countryName = SCANNER.nextLine();



        Continent continent = getContinent(countryName);


        System.out.println("Continent: " + continent);
    }

    private static Continent getContinent(String countryName) {
        return switch (countryName.toLowerCase()) {
            case "canada", "united states" -> Continent.NORTH_AMERICA;
            case "brazil", "argentina" -> Continent.SOUTH_AMERICA;
            case "united kingdom", "france", "germany", "ukraine" -> Continent.EUROPE;
            case "china", "japan" -> Continent.ASIA;
            default -> throw new IllegalStateException("Unexpected value: " + countryName);
        };
    }
}
