package com.softserve.edu04.Practical.task3;

import java.util.Scanner;

public class Country {
    public static void main(String[] args) {


        Continents continents = Continents.ASIA;

        System.out.println("Input your country : ");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();




        switch (country) {
            case "China": case "Japan": case "India":
                continents = Continents.ASIA;break;
            case "Africa": case  "Morocco": case  "Kenya":
                continents = Continents.AFRICA;break;
            case "Ukraine", "France", "Norway":
                continents = Continents.EUROPE;break;
            case "USA", "Mexico", "Canada":
                continents = Continents.AMERICA;break;

            default:
                System.out.println("No found");break;


        }
        System.out.println("located on the continent :" + continents);

    }
}
