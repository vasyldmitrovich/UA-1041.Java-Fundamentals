package com.softserve.edu10.pt;

import java.util.Map;
import java.util.Scanner;

public class Pt01 {
    public final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        var employeeMap = Map.of(
                1, "Alex",
                2, "Alice",
                3, "Bob",
                4, "Jack",
                5, "John",
                6, "Andrew",
                7, "Kyle"
        );
        System.out.println(employeeMap);
        System.out.println("Enter id: ");
        int id = SC.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name is \n" + employeeMap.get(id));
        } else {
            System.out.println("No such id \n");
        }

        System.out.println("Enter a name: ");
        String name = SC.next();
        if (employeeMap.containsValue(name)){
        for (var e : employeeMap.entrySet()){
            if (e.getValue().equals(name)){
                System.out.println("The ID is " + e.getKey());
            }
        }
        } else {
            System.out.println("No such a name");
        }
    }
}
