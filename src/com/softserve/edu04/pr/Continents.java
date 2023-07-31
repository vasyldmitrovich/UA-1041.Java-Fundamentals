package com.softserve.edu04.pr;

import java.util.Scanner;

public class Continents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the country:");
        String country = sc.nextLine();
        enum ContinentByCountry{
            AFRICA, EUROPE, ASIA, NA, SA, AUSTRALIA, ANTARCTICA
        }
        switch (country){
            case "Nigeria", "Egypt", "Ghana", "Chad" -> System.out.println(ContinentByCountry.AFRICA);
            case "Ukraine", "Sweden", "UK", "France" -> System.out.println(ContinentByCountry.EUROPE);
            case "Japan", "China", "Thailand", "Taiwan" -> System.out.println(ContinentByCountry.ASIA);
            case "USA", "Mexico", "Canada", "Panama" -> System.out.println(ContinentByCountry.NA);
            case "Brazil", "Argentina", "Peru", "Chile" -> System.out.println(ContinentByCountry.SA);
            case "Australia" -> System.out.println(ContinentByCountry.AUSTRALIA);
            case "Only the continent" -> System.out.println(ContinentByCountry.ANTARCTICA);
            default -> System.out.println("can't find a continent");

        }
    }
}
