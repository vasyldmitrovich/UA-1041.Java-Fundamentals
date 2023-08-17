package com.softserve.edu07.pt.work2;

public class Main {//Ok
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Teacher("Emy", 10000),
                new Student("Tony"),
                new Cleaner("Susie", 7000)
        };

        for (var people : persons) {
            people.print();

            if (people instanceof Staff) {
                ((Staff) people).salary();
            }
        }
    }
}