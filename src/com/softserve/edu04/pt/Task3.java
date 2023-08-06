package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(inputData().getContinent());
    }

    private static Country inputData(){
        System.out.print("Input name of country: ");
        return Country.valueOf(sc.nextLine().toUpperCase());
    }
}

enum Country{
    UKRAINE("Europe"),
    POLAND("Europe"),
    GERMANY("Europe"),
    CHINA("Asia"),
    USA("North America"),
    CANADA("North America"),
    BRAZIL("South America"),
    MADAGASCAR("Africa"),
    EGYPT("Africa");

    private String continent;

    Country(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}

