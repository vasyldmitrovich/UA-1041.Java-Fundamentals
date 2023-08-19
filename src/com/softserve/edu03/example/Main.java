package com.softserve.edu03.example;

import java.util.Scanner;

import static com.softserve.edu03.example.Student.printStudentsStats;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);
   // Locale.setDefault(Locale.ROOT);
    public static void main(String[] args) {
        printStudentsStats();

        Student student1 = new Student();
        Student.promptParameters(student1);
        printStudentsStats();

        Student student2 = new Student();
        Student.promptParameters(student2);
        printStudentsStats();

        Student student3 = new Student();
        Student.promptParameters(student3);
        printStudentsStats();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
