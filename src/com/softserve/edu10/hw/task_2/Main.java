package com.softserve.edu10.hw.task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        putPersonToMap(personMap);
        printMap(personMap);

        System.out.println("___________________________");
        System.out.println("Are there two persons with the same first name?");
        findDuplicateFirstName(personMap);

        System.out.println("___________________________");
        System.out.println("Remove the person from the map whose first name is 'Orest':");
        removeByFirstName("Orest", personMap);
        printMap(personMap);

    }

    private static void removeByFirstName(String firstName, Map<String, String> personMap) {
        var iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            var el = iterator.next().getValue();
            if (el.equals(firstName)) {
                iterator.remove();
            }
        }

    }

    private static void printMap(Map<String, String> personMap) {
        for (var el : personMap.keySet()
        ) {
            System.out.println("[" + el + " " + personMap.get(el) + "]");
        }
    }


    private static void findDuplicateFirstName(Map<String, String> personMap) {
        Set<String> uniqueValues = new HashSet<>();
        boolean haveDuplicate = true;

        for (var stringStringEntry : personMap.entrySet()) {
            var el = stringStringEntry.getValue();
            if (!uniqueValues.add(el)) {
                haveDuplicate = false;
                System.out.println("PersonMap contains few persons with name:" + el);
            }
        }

        if (haveDuplicate) {
            System.out.println("PersonMap don`t has duplicate!");
        }

    }

    private static void putPersonToMap(Map<String, String> personMap) {
        personMap.put("Hawthorne", "Amelia");
        personMap.put("Mercer", "Jackson");
        personMap.put("Winslow", "Amelia");
        personMap.put("Carver", "Olivia");
        personMap.put("Delaney", "Sophia");
        personMap.put("Thorne", "Jackson");
        personMap.put("Sinclair", "Ethan");
        personMap.put("Harrington", "Amelia");
        personMap.put("Callahan", "Orest");
        personMap.put("Montgomery", "Noah");
    }
}
