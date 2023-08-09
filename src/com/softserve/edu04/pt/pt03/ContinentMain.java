package com.softserve.edu04.pt.pt03;

import java.util.Scanner;

public class ContinentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country: ");
        String nameCountry = scanner.nextLine();

        switch (nameCountry){
            case "Ukraine", "Poland", "Germany" -> Continent.EUROPE.getContName();
            case "Sydney", "Melbourne", "Brisbane" -> Continent.AUSTRALIA.getContName();
            case "Toronto", "Chicago", "Houston" -> Continent.NORTH_AMERICA.getContName();
            default -> System.out.println("Wrong country, try else");
        }
    }
}
