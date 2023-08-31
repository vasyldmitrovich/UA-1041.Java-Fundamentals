package com.softserve.edu10.hw.task2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Methods {
    public static void checkForDuplicates(Map<String, String> personMap) {
        Set<String> uniqueValues = new HashSet<>(personMap.values());
        if (uniqueValues.size() == personMap.size()) {
            System.out.println("There is no persons with the same last name.");
        } else {
            System.out.println("There is at least two persons with the same last name");
        }
    }

    public static void removeSpecificPersonByFirstName(Map<String, String> personMap) {
        if (personMap.containsKey("Bill")) {
            personMap.remove("Bill");
        }
    }
}
