package com.softserve.edu04.pt.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input country:");
        String country = sc.nextLine();
        System.out.println();
        String continent = switch (country) {
            case "China", "India", "Japan", "Indonesia", "Pakistan" -> Continent.ASIA.toString();
            case "Nigeria", "Ethiopia", "Egypt", "Congo", "Tanzania" -> Continent.AFRICA.toString();
            case "USA", "Canada", "Mexico", "Cuba", "Dominican Republic" -> Continent.NORTH_AMERICA.toString();
            case "Brazil", "Argentina", "Peru", "Colombia", "Chile" -> Continent.SOUTH_AMERICA.toString();
            case "Antarctica" -> Continent.ANTARCTICA.toString();
            case "France", "Spain", "Italy", "Germany", "United Kingdom" -> Continent.EUROPE.toString();
            case "Australia" -> Continent.AUSTRALIA.toString();
            default -> "don`t now country";
        };
        System.out.println(continent);
    }
}
