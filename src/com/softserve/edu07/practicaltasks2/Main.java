package com.softserve.edu07.practicaltasks2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Teacher("Alice", 3000),
                new Student("Bob"),
                new Cleaner("John", 2000)
        };

        for(var people : persons){
            people.print();

            if(people instanceof Staff){
                ((Staff) people).salary();
            }
        }
    }
}
