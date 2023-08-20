package com.softserve.edu07.pt.task2;

public class App {
    public static void main(String[] args) {
        Person[] people = {
                new Cleaner("Maria", 10000),
                new Student("George"),
                new Teacher("Den", 12000)
        };
        for (Person p : people) {
            p.print();
            if (p instanceof Staff) {
                ((Staff) p).salary();
            }
        }
    }
}
