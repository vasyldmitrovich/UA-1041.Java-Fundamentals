package com.softserve.edu10.hw.hw03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner CS = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 5));
        students.add(new Student("Eva", 3));
        students.add(new Student("Mark", 3));
        students.add(new Student("Karl", 5));
        students.add(new Student("Sonya", 5));

        System.out.println("Enter course number: ");
        int course = CS.nextInt();
        Student.printStudents(students, course);

        System.out.println("Sorted by course:");
        Student.compareByCourse(students);
        System.out.println(students);

        System.out.println("Sorted by name:");
        Student.compareByName(students);
        System.out.println(students);
    }


}
