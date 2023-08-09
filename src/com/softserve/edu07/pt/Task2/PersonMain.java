package com.softserve.edu07.pt.Task2;

public class PersonMain {
    static int lineLength = 20;
    static Person[] school = {
            new Cleaner("Sam"),
            new Student("Ann"),
            new Teacher("John"),
            new Cleaner("Alex"),
            new Student("Michel"),
            new Teacher("Jorge")
    };

    public static void main(String[] args) {
        printAllSchool();
    }

    static void printAllSchool() {
        for (var person : school
        ) {
            System.out.println("_".repeat(lineLength));
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println("_".repeat(lineLength));
        }
    }
}
