package com.softserve.edu07.pr;

class Main {
    public static void main(String[] args) {
        Person[] peopleArray = {
                new Student("Anna"),
                new Teacher("Olya"),
                new Cleaner("John"),
                new Student("Ken")
        };
        for (var person : peopleArray) {
            if (person instanceof Student) {
                person.print();
            } else {
                person.print();
                ((Staff) person).salary();
            }
        }
    }
}
