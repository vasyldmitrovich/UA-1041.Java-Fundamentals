package com.softserve.edu03.HW3;

import java.util.Scanner;

import static com.softserve.edu03.HW3.Person.printPersonAge;


public class HW3 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //Good
        Person person1 = new Person();
        Person.promptParameters(person1);
        System.out.println(person1);
        printPersonAge();

        Person person2 = new Person();
        Person.promptParameters(person2);
        System.out.println(person2);
        printPersonAge();

        Person person3 = new Person();
        Person.promptParameters(person3);
        System.out.println(person3);
        printPersonAge();

        Person person4 = new Person();
        Person.promptParameters(person4);
        System.out.println(person4);
        printPersonAge();

        Person person5 = new Person();
        Person.promptParameters(person5);
        System.out.println(person5);
        printPersonAge();


    }


}
