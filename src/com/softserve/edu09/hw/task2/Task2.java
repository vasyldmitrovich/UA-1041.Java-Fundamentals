package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "A1", 1, List.of(3, 3, 2)));
        students.add(new Student("Emily", "B2", 2, List.of(3, 4, 2)));
        students.add(new Student("Michael", "A1", 2, List.of(4, 5, 4)));


        removeStudents(students);

        System.out.println("=".repeat(10));
        printStudents(students, 3);
    }

    private static void removeStudents(List<Student> students) {
        var it = students.iterator();

        while (it.hasNext()) {
            Student student = it.next();

            double average = student.getAverageGrade();

            if (average < 3) {
                it.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Student " + student.getName() + " has been promoted to the next course level");
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        for (var student : students) {
            if (student.getCourse() == course) System.out.println(student);
        }
    }
}
