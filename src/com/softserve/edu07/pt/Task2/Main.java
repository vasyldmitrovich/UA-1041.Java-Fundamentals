package com.softserve.edu07.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Person[] people=new Person[3];
        people[0]=new Teachers("Alex");
        people[1]=new Cleaners("John");
        people[2]=new Students("Tom");

        for(Person person:people){
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Teachers || person instanceof Cleaners) {
                ((Staff) person).salary();
            }
        }
       // ((Staff)people[2]).salary();
    }

}
