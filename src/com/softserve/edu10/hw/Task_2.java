package com.softserve.edu10.hw;

import java.util.*;

public class Task_2 {
    public static HashMap addPersons() {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Jonson", "Ann");
        employeeMap.put("Roberts", "Ivan");
        employeeMap.put("Smith", "Ann");
        employeeMap.put("Williams", "Bob");
        employeeMap.put("Taylor", "Alex");
        employeeMap.put("Brown", "Alice");
        employeeMap.put("Davies", "John");
        employeeMap.put("Evans", "Dave");
        employeeMap.put("Thomas", "Dan");
        employeeMap.put("Robinson", "John");
        return (HashMap) employeeMap;
    }

    public static void nameDuplicated(Map<String, String> persons) {
        Map<String, Integer> duplicateNames = new HashMap<>();
        for (var names : persons.values()) {
            int count = 0;
            for (var namesDuplicate : persons.values()) {
                if (names.equals(namesDuplicate)) {
                    count++;
                }
            }
            if (count > 1) {
                duplicateNames.put(names, count);
            }
        }
        for (var n : duplicateNames.entrySet()) {
            System.out.println("There are " + n.getValue() + " people with name " + n.getKey() + " in the list.");
        }
    }

    public static HashMap removedName(Map<String, String> namesHashMap, String removedName) {
        Iterator<Map.Entry<String, String>> nameIterator = namesHashMap.entrySet().iterator();
        while (nameIterator.hasNext()) {
            var name = nameIterator.next().getValue();
            if (name.equals(removedName)) {
                nameIterator.remove();
            }
        }
        return (HashMap) namesHashMap;
    }
}
