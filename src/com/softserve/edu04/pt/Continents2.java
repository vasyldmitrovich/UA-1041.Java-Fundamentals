package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;

public class Continents2 {

    public enum Continent {
        ASIA, EUROPE, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, AUSTRALIA
    }

    public enum Asia {
        CHINA, INDIA, KAZAKHSTAN, SAUDI_ARABIA, IRAN, MONGOLIA, INDONESIA, PAKISTAN, TURKEY;
    }

    public enum Europe {
        AUSTRIA, BELGIUM, BULGARIA, CROATIA, CYPRUS, CZECHIA, DENMARK, ESTONIA, FINLAND, FRANCE;
        }

    public enum Africa {
        ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA_FASO, BURUNDI, CAMEROON, CAPE_VERDE, CENTRAL_AFRICAN_REPUBLIC;
    }

    public enum North_America {
        USA, MEXICO, CANADA, GUATEMALA, HAITI, DOMINICAN_REPUBLIC, CUBA, HONDURAS, NICARAGUA, EL_SALVADOR;
    }

    public enum South_America {
        BRAZIL, COLOMBIA, ARGENTINA, PERU, VENEZUELA, CHILE, ECUADOR, BOLIVIA, PARAGUAY;
    }

    public enum Australia {
        AUSTRALIA, PAPUA_NEW_GUINEA, NEW_ZEALAND, FIJI, SOLOMON_ISLANDS, MICRONESIA, VANUATU;
    }

    public static String getNameOfTheCountry() {
        System.out.print("Input the name of the country: ");
        String  nameOfTheCountry = SCANNER.nextLine();
        return nameOfTheCountry.toUpperCase();
    }

    public static void getNameOfContinent(String country){
        Continent continent=null;

        Asia contryAsia = Asia.valueOf(country);
        Europe contryEurope = Europe.valueOf(country);
        Africa contryAfrica = Africa.valueOf(country);
        North_America contryNorth_America = North_America.valueOf(country);
        South_America contrySouth_America = South_America.valueOf(country);
        Australia contryAustralia = Australia.valueOf(country);

        if (contryAsia != null) {
            continent = Continent.ASIA;
        }

        if (contryEurope != null) {
            continent = Continent.EUROPE;
        }

        if (contryAfrica != null) {
            continent = Continent.AFRICA;
        }

        if (contryNorth_America != null) {
            continent = Continent.NORTH_AMERICA;
        }

        if (contrySouth_America != null) {
            continent = Continent.SOUTH_AMERICA;
        }

        if (contryAustralia != null) {
            continent = Continent.AUSTRALIA;
        }

        System.out.println(continent.name());

    }
}
