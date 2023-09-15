package com.softserve.edu10.Homework.task2;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main (String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Smote", "Jim");
        personMap.put("Miller", "Olga");
        personMap.put("Klim", "Sem");
        personMap.put("Mol", "Moly");
        personMap.put("Orger", "Dan");
        personMap.put("Molchan", "Serge");
        personMap.put("Gum", "John");
        personMap.put("Kutova", "Olena");
        personMap.put("Miple", "Mike");

        System.out.println(personMap);
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("First name:" + entry.getKey() + "\t" + "Second name: " + entry.getValue());
        }
        boolean hasDuplicateNames = hasDuplicateNames(personMap);
        System.out.println("Чи є особи з однаковими іменами: " + hasDuplicateNames);
        String nameToRemove = "John";
        removeByName(personMap, nameToRemove);
        System.out.println("\nМапа після видалення за іменем '" + nameToRemove + "':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


        public static boolean hasDuplicateNames(Map<String, String> personMap) {

            Map<String, Integer> nameCountMap = new HashMap<>();
            for (String name : personMap.values()) {
                nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
            }

             for (int count : nameCountMap.values()) {
                if (count > 1) {
                    return true;
                }
            }
            return false;
        }
    public static void removeByName(Map<String, String> map, String nameToRemove) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(nameToRemove));
    }


    }


