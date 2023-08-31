package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Bill", "Smith");
        personMap.put("Jordan", "Spencer");
        personMap.put("Michael", "Spencer");
        personMap.put("Alfie", "Butcher");
        personMap.put("Jarno", "Verstappen");
        personMap.put("Will", "Johnson");
        personMap.put("Bobby", "Fletcher");
        personMap.put("Kevin", "Mag");
        personMap.put("Bob", "Fisher");
        personMap.put("Nate", "Hill");
        System.out.println(personMap);

        Methods.checkForDuplicates(personMap);
        Methods.removeSpecificPersonByFirstName(personMap);

        System.out.println(personMap);
    }
}
