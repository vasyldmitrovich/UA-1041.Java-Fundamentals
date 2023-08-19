package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // Task 1

        System.out.println("Task1");

        Task01 result1 = new Task01();
        int num11 = Task01.getNumber("Input side 1: ");
        int num12 = Task01.getNumber("Input side 2: ");
        int num13 = Task01.getNumber("Input side 3: ");

        System.out.println(Task01.getArea(num11, num12, num13));
        System.out.println();

        // Task 2
        System.out.println("Task2");

        Task02 result2 = new Task02();
        int num21 = Task02.getNumber("Input the first number: ");
        int num22 = Task02.getNumber("Input the second number: ");
        int num23 = Task02.getNumber("Input the third number: ");

        System.out.println(Task02.getMinNumber(num21, num22, num23));
        System.out.println();

        // Task 3
        System.out.println("Task3");

        Person person1 = new Person();
        Person.input(person1);

        Person person2 = new Person();
        Person.input(person2);

        Person person3 = new Person();
        Person.input(person3);

        Person person4 = new Person();
        Person.input(person4);

        Person person5 = new Person();
        Person.input(person5);

        System.out.println();
        System.out.println("List of persons.");
        Person.output(person1);
        Person.output(person2);
        Person.output(person3);
        Person.output(person4);
        Person.output(person5);
    }
}
