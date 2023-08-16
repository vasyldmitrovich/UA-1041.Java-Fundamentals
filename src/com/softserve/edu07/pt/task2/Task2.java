package com.softserve.edu07.pt.task2;

import com.softserve.edu07.pt.task2.people.*;

public class Task2 {


    public static void main(String[] args) {

        Person[] people = {
                new Teacher("John"),
                new Cleaner("Alice"),
                new Student("Bob"),
                new Teacher("Eve")
        };

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println("=".repeat(10));
        }
    }
}
