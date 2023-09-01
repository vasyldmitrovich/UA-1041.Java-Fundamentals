package com.softserve.edu10.hw;

import java.util.*;

public class Hw02 {

    public final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Ivanov", "Anton");
        personMap.put("Petrov", "Ivan");
        personMap.put("Sirko", "Oleg");
        personMap.put("Bogun", "Igor");
        personMap.put("Mazepa", "Yevgen");
        personMap.put("Franko", "Masha");
        personMap.put("Sidorova", "Vera");
        personMap.put("Boiko", "Ira");
        personMap.put("Nikityuk", "Lesya");
        personMap.put("Chech", "Oleg");

        printMap(personMap);

        checkDuplicate(personMap);

        System.out.print("\nEnter first name person for removing: ");

        String firstName = SC.nextLine();

        removePerson(personMap, firstName);

        System.out.format("Map after removing %s:\n", firstName);

        printMap(personMap);
    }

    private static void printMap(Map<String, String> personMap) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
        }
    }

    private static void checkDuplicate(Map<String, String> personMap) {
        Set<String> nameSet = new HashSet<>();

        var name = personMap.values();

        for (var personName : name) {
            if (nameSet.contains(personName)) {
                System.out.format("\nName %s has duplicate", personName);
            } else {
                nameSet.add(personName);
            }
        }
        if (nameSet.size() == name.size()) System.out.println("No name duplicates");
    }

    private static void removePerson(Map<String, String> personMap, String firstName) {
        var iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            var el = iterator.next().getValue();
            if (el.equals(firstName)) {
                iterator.remove();
            }
        }
    }
}