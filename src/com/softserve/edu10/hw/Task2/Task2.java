package com.softserve.edu10.hw.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        Map<String , String >personMap=new HashMap<>();
        personMap.put("Dfb","Alex");
        personMap.put("Erero","Max");
        personMap.put("Wedw","Mike");
        personMap.put("Dsaf","Nike");
        personMap.put("Rret","Jon");
        personMap.put("Iuit","Sara");
        personMap.put("Adfs","Ivan");
        personMap.put("Itthyt","John");
        personMap.put("Pvfdvsf","Sara");
        personMap.put("Yarik","Orest");
        System.out.println(personMap);
        System.out.println(checkDuplicate(personMap));
        System.out.println("Enter the names of the people you want to remove");
        String nameToRemove=scaner.nextLine();
        removePerson(personMap,nameToRemove);
        System.out.println(personMap);
    }
    public static boolean checkDuplicate(Map<String, String> map) {
        Set<String> seenFirstNames = new HashSet<>();
        for (String firstName : map.values()) {
            if (!seenFirstNames.add(firstName)) {
                return true;
            }
        }
        return false;
    }

    public static void removePerson(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
                break;
            }
        }
    }
}
