package com.softserve.edu10.hw.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        addStudentsToList(students);
        System.out.println(students);

        System.out.println("_______________________");
        int courseNumber = 85;
        System.out.println("Student names who are enrolled in the specified course:" + courseNumber);
        Student.printStudents(students, courseNumber);

        System.out.println("_______________________");
        System.out.println("Students sorted by name:");
        Student.compareByName(students);
        System.out.println(students);


        System.out.println("_______________________");
        System.out.println("Students sorted by course:");
        Student.compareByCourse(students);
        System.out.println(students);

    }

    private static void addStudentsToList(List<Student> students) {
        students.add(new Student("John", 85));
        students.add(new Student("Silvia", 84));
        students.add(new Student("Orest", 85));
        students.add(new Student("Makar", 84));
        students.add(new Student("David", 81));

    }
}
