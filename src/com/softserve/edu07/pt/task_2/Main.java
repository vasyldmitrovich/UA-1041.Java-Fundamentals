package com.softserve.edu07.pt.task_2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Cleaner("Ivan"),
                new Teacher("Stepan"),
                new Student("Sergij"),
                new Teacher("Maria")

        };
        for (var el : persons
        ) {
            el.print();
            if (el.getClass() == Teacher.class || el.getClass() == Cleaner.class) {
                ((Staff) el).salary();
            }
        }
    }
}
