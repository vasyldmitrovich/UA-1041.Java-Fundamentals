package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;

public class Continents {

    public static String getCountryName() {
        System.out.print("Input the name of the country: \n (you can chose one of the next countries \n" +
                "Austria, Belgium, Bulgaria, Croatia, Cyprus \n" +
                "China, India, Kazakhstan, Saudi_Arabia \n" +
                "Algeria, Angola, Benin, Botswana, Burkina_Faso, Burundi \n" +
                "USA, Mexico, Canada, Guatemala, Haiti, Cuba \n" +
                "Brazil, Colombia, Argentina, Peru, Chile, Ecuador \n" +
                "Australia, Fiji, Micronesia, Vanuatu, Antarctica) - ");
        String countryName = SCANNER.nextLine();
        return countryName;
    }

    public static void getContinent(String country) {
        Continent continent;

        continent = switch (country) {
            case "Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus" -> Continent.EUROPE;
            case "China", "India", "Kazakhstan", "Saudi_Arabia" -> Continent.ASIA;
            case "Algeria", "Angola", "Benin", "Botswana", "Burkina_Faso", "Burundi" -> Continent.AFRICA;
            case "USA, Mexico", "Canada", "Guatemala", "Haiti", "Cuba" -> Continent.NORTH_AMERICA;
            case "Brazil", "Colombia", "Argentina", "Peru", "Chile", "Ecuador" -> Continent.SOUTH_AMERICA;
            case "Australia", "Fiji", "Micronesia", "Vanuatu" -> Continent.AUSTRALIA;
            case "Antarctica" -> Continent.ANTARCTICA;
            default -> throw new IllegalArgumentException("an unknown continent");
        };
        System.out.println();
        System.out.println(country + " is located in " + continent);
    }

    public enum Continent {
        ASIA, EUROPE, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, AUSTRALIA
    }
}
