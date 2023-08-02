import java.util.Scanner;

public class Main {
    enum Continent {
        AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, EURASIA, AUSTRALIA
    }
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the name of the country: ");
        String country = SCANNER.nextLine();

        Continent continent = getContinent(country);

        if (continent != null) {
            System.out.println("The continent of " + country + " is: " + continent);
        } else {
            System.out.println("For this country continent not found ");
        }
    }
    public static Continent getContinent(String country) {
        String Country = country.toUpperCase();

        switch (Country) {
            case "CHINA", "INDIA", "JAPAN", "GERMANY", "FRANCE", "UKRAINE":
                return Continent.EURASIA;
            case "EGYPT", "NIGERIA", "SOUTH AFRICA":
                return Continent.AFRICA;
            case "USA", "CANADA", "MEXICO":
                return Continent.NORTH_AMERICA;
            case "BRAZIL", "ARGENTINA", "PERU":
                return Continent.SOUTH_AMERICA;
            case "AUSTRALIA", "NEW ZEALAND":
                return Continent.AUSTRALIA;
            case "ANTARCTICA":
                return Continent.ANTARCTICA;
        }
        return null; // continent not found
    }
}
