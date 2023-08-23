package com.softserve.edu10.pt.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        Map<Integer, String> employeeMap=new HashMap<>();
        employeeMap.put(123456789,"Alex");
        employeeMap.put(234567891,"Max");
        employeeMap.put(345678912,"Mike");
        employeeMap.put(456789123,"Nike");
        employeeMap.put(567891234,"Jon");
        employeeMap.put(678912345,"Sara");
        employeeMap.put(789123456,"Ivan");
        System.out.println(employeeMap);
        System.out.println("Enter ID");
        var usersID=scaner.nextInt();
        if(employeeMap.containsKey(usersID)) {
            System.out.println("Name- "+employeeMap.get(usersID));
        }else System.out.println("There are no people with this ID "+usersID);
        System.out.println("Enter name");
        scaner.nextLine();
        String usersName=scaner.nextLine();
        if(employeeMap.containsValue(usersName)){
            for (var entry:employeeMap.entrySet()) {
                if(entry.getValue().equals(usersName))
                {
                    System.out.println("ID-"+entry.getKey());
                    break;
                }

            }

        }
        System.out.println("Enter the ID of the people you want to add ");
        int IDToAdd=scaner.nextInt();
        System.out.println("Enter the name of the people you want to add ");
        scaner.nextLine();
        String NameToAdd=scaner.nextLine();
        boolean nameFound = false;
        int correspondingID = -1;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(NameToAdd)) {
                nameFound = true;
                correspondingID = entry.getKey();
                break;
            }
        }
        boolean IDFound = false;
        int correspondingName = -1;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getKey().equals(IDToAdd)) {
                IDFound = true;
                correspondingName = entry.getKey();
                break;
            }
        }

        if (nameFound && IDFound) {
            System.out.println();
            System.out.println("Corresponding ID: " + correspondingID);
            System.out.println("Corresponding name: "+ correspondingName);
        } else {
            System.out.println();
            System.out.println("Name not found.");
            System.out.println("ID not found.");
            System.out.println("Added to list");
        }
    }
}
