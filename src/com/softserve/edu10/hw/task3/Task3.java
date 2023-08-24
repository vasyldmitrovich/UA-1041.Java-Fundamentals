package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 1),
                new Student("Bob", 2),
                new Student("Charlie", 1),
                new Student("David", 3),
                new Student("Eve", 2))
        );

        System.out.println("Students enrolled in course 1");
        Student.printStudents(students, 1);

        System.out.println("=".repeat(10));

        System.out.println("Students sorted by name");
        students.sort(Student.nameComparator);
        for (Student student : students) {
            System.out.println(student.getName() + ". Course " + student.getCourse());
        }

        System.out.println("=".repeat(10));

        System.out.println("Students sorted by course:");
        students.sort(Student.courseComparator);
        for (Student student : students) {
            System.out.println(student.getName() + ". Course " + student.getCourse());
        }
    }
}
