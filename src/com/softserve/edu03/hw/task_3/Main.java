package com.softserve.edu03.hw.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people you need?");
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 1; i <= n; i++) {
            Person person = new Person();
            System.out.printf("Input information about person%s: ", i);
            System.out.println();
            person = Person.input();
            people[i - 1] = person;
        }
        for (var pers : people
        ) {
            Person.output(pers);
        }


    }
}
