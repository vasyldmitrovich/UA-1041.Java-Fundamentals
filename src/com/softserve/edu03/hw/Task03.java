package com.softserve.edu03.hw;

public class Task03 {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            System.out.println("Enter information for person #" + (i + 1));
            people[i].input();
        }

        System.out.println("\nInformation about people:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}
