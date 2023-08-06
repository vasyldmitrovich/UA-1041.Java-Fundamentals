package com.softserve.edu04.PT;

import java.util.Scanner;

public class PT3 {
    public static void main(String[] args) {
        enum continents {
            AFRICA, ASIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA
        }
        System.out.println("Enter the country");
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();

        var response = switch (country) {
            case "Nigeria","Ethiopia","Egypt","Kenya","Uganda" -> continents.AFRICA;
            case "India","China","Indonesia","Pakistan","Japan" -> continents.ASIA;
            case "Ukraine","Germany", "United Kingdom", "France", "Italy" -> continents.EUROPE;
            case "USA", "Mexico", "Canada" -> continents.NORTH_AMERICA;
            case "Brazil", "Colombia", "Argentina", "Peru" -> continents.SOUTH_AMERICA;
            case "Australia" -> continents.AUSTRALIA;
            default -> throw new IllegalStateException("Unexpected value");
        };
        System.out.println(response);
    }
}
