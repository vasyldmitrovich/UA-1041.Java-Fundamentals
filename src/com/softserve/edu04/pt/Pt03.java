package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt03 {
    public static void main(String[] args) {
        enum Continent {
            EUROPE, AUSTRALIA, NORTH_AMERICA
        }//This enum should be in file Continent.java not there
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country: ");
        String nameCountry = scanner.nextLine();

        switch (nameCountry){
            case "Ukraine", "Poland", "Germany" -> System.out.println(Continent.EUROPE);
            case "Sydney", "Melbourne", "Brisbane" -> System.out.println(Continent.AUSTRALIA);
            case "Toronto", "Chicago", "Houston" -> System.out.println(Continent.NORTH_AMERICA);
            default -> System.out.println("Wrong country, try else");
        }
    }
}
