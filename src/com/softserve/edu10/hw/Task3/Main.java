package com.softserve.edu10.hw.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Jon", 2));
        students.add(new Student("Sara", 1));
        students.add(new Student("Max", 2));
        students.add(new Student("Olha", 2));
        students.add(new Student("Ivan", 1));
        students.add(new Student("Mike", 2));

        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Comparator.comparingInt(Student::getCourse));
        System.out.println("Sorted by Course:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("What course you search");
        int usersCourse=scaner.nextInt();
        System.out.println("Students Enrolled in Course " + usersCourse + ":");
        Student.printStudentsByCourse(students, usersCourse);
    }
}
