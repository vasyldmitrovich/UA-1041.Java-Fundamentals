package com.softserve.edu07.pt.task2;

public class Appl {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Andrii"),
                new Teacher("Anna"),
                new Cleaner("Valya"),
                new Student("Maxim"),
                new Teacher("Serhii")
        };

        for(Person person : persons){
            person.print();
            if(person instanceof Staff){
                 ((Staff) person).salary();
            }
        }
    }
}
