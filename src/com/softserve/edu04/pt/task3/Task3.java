package com.softserve.edu04.pt.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String country = getCountry("Input one of the countries from the list (Indonesia, Australia, Kenya, Ukraine, Brazil, Mexico) to see their continent: ");
        getContinent(country);
    }

    private static void getContinent(String number) {
        Continent continent;
        continent = switch (number) {
            case "Indonesia" -> Continent.ASIA;
            case "Australia" -> Continent.AUSTRALIA;
            case "Kenya" -> Continent.AFRICA;
            case "Ukraine" -> Continent.EUROPE;
            case "Brazil" -> Continent.SOUTH_AMERICA;
            case "Mexico" -> Continent.NORTH_AMERICA;
            default -> null;
        };
        if (continent == null) {
            System.out.println(Continent.ANTARCTICA);
        } else {
            System.out.println(continent);
        }
    }

    public static String getCountry(String num) {
        Scanner sc = new Scanner(System.in);
        System.out.print(num);
        return sc.nextLine();
    }

}


