package com.softserve.edu07.pt;

public class App {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        Animals[] pets = {
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat(),
                new Cat()
        };
        for (var animals : pets) {
            animals.voice();
            animals.feed();
            System.out.println();
        }

        // Task 2
        System.out.println("Task 2");

        Person[] person = {
                new Student(),
                new Teacher(),
                new Cleaner(),
                new Cleaner(),
                new Student()
        };
        for (var persons : person) {
            persons.print();
            if (persons instanceof Staff) {
                ((Staff) persons).salary();
            }
            System.out.println();
        }
    }
}
