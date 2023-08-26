package com.softserve.edu10.pt.task2;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new LinkedHashMap<>();

        fillMap(personMap);
        displayMap(personMap);
        System.out.println("Map contain same names: " + (containSameName(personMap) ? "Yes" : "No"));
        removeName(personMap, "Olivia");
        displayMap(personMap);
    }

    public static void fillMap(Map<String, String> map){
        map.put("Smith", "John");
        map.put("Johnson", "Emily");
        map.put("Williams", "Michael");
        map.put("Brown", "Jessica");
        map.put("Jones", "David");
        map.put("Davis", "Sarah");
        map.put("Miller", "Michael");
        map.put("Wilson", "Olivia");
        map.put("Moore", "William");
        map.put("Taylor", "Sophia");
    }

    public static <K, V> void displayMap(Map<K, V> map){
        for (Map.Entry<K, V> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static <K, V> boolean containSameName(Map<K, V> map){
        return new HashSet<>(map.values()).size() != map.size();
    }

    public static <K, V> void removeName(Map<K, V> map, String name){
        if (map.containsValue(name)){
            List<Map.Entry<K, V>> entries = new LinkedList<>(map.entrySet());
            for (int i = 0; i < entries.size(); i++){
                Map.Entry<K, V> temporaryEntry = entries.get(i);
               if(temporaryEntry.getValue().equals(name))
                   map.remove(temporaryEntry.getKey());
            }
        }
    }
}