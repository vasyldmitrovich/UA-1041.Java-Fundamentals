package com.softserve.edu10.pt.task3;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 2));
        students.add(new Student("Maxim", 3));
        students.add(new Student("David", 3));
        students.add(new Student("Roman", 5));

        Student.printStudents(students, 2);

        System.out.println("Sorted by name:");
        Student.sortByName(students);
        Student.displayStudents(students);

        System.out.println("Sorted by course:");
        Student.sortByCourse(students);
        Student.displayStudents(students);
    }
}