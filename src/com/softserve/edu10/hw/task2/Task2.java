package com.softserve.edu10.hw.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {


    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("Johnson", "Jessica");
        personMap.put("Williams", "Orest");
        personMap.put("Jones", "Jennifer");
        personMap.put("Brown", "Michael");
        personMap.put("Davis", "Laura");
        personMap.put("Miller", "James");
        personMap.put("Wilson", "Emily");
        personMap.put("Moore", "Orest");
        personMap.put("Taylor", "Jessica");

        displayMap(personMap);

        System.out.println("=".repeat(10));

        findDuplicate(personMap);

        System.out.println("=".repeat(10));

        removeFirstName(personMap, "Orest");

        displayMap(personMap);

    }

    private static void displayMap(Map<String, String> personMap) {

        for (var entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private static void findDuplicate(Map<String, String> personMap) {

        Set<String> personNames = new HashSet<>();

        var pNames = personMap.values();
        for (var personName : pNames) {
            if (personNames.contains(personName)) {
                System.out.println("Name " + personName + " has duplicates");
            } else {
                personNames.add(personName);
            }
        }

        if (personNames.size() == pNames.size()) System.out.println("No duplicates");
    }

    private static void removeFirstName(Map<String, String> personMap, String firstName) {

        var it = personMap.entrySet().iterator();

        while (it.hasNext()) {
            var entry = it.next();

            if (entry.getValue().equals(firstName)) {
                it.remove();
            }
        }
    }
}
