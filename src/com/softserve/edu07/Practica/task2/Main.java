package com.softserve.edu07.Practica.task2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Cleaner("Steve"),
                new Student("Kevin"),
                new Teacher("Helen"),


        };

        for (Person person : persons) {
            person.print();
            if(person instanceof Staff) {
                ((Staff) person).salary();
            }

        }
    }
}
