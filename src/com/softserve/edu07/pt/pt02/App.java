package com.softserve.edu07.pt.pt02;

public class App {
    public static void main(String[] args) {
        Person[] rank = {
                new Cleaner("Igor"),
                new Student("Anton"),
                new Teacher("Olga")
        };

        for (Person person : rank) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
