package edu04.pt;

import java.util.Scanner;

// Enum to represent continents
enum Continent {
    AFRICA, ASIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
}

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Input three numbers and find out how many of them are odd
        int oddCount = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Number of odd numbers: " + oddCount);

        // Task 2: Input the number of the day of the week and output the name in two languages
        System.out.print("Enter the number of the day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of the week (English): " + dayNames[dayOfWeek - 1]);
        // You can add translations for other languages here.

        // Task 3: Input the name of the country and output the name of the continent
        System.out.print("Enter the name of the country: ");
        String country = scanner.next();
        Continent continent = getContinentForCountry(country);
        System.out.println("Continent: " + continent);

        scanner.close();
    }

    // Function to map a country to its continent
    public static Continent getContinentForCountry(String country) {
        switch (country.toLowerCase()) {
            case "africa":
                return Continent.AFRICA;
            case "asia":
                return Continent.ASIA;
            case "europe":
                return Continent.EUROPE;
            case "north america":
                return Continent.NORTH_AMERICA;
            case "south america":
                return Continent.SOUTH_AMERICA;
            case "australia":
                return Continent.AUSTRALIA;
            case "antarctica":
                return Continent.ANTARCTICA;
            default:
                return null; // Unknown continent
        }
    }
}

