package com.softserve.edu09.hw.hw02;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anton", "A", 1, 3, 3, 2));
        students.add(new Student("Kirill", "B", 1, 2, 2, 3));
        students.add(new Student("Olesya", "C", 1, 3, 4, 4));
        students.add(new Student("Dmytro", "A", 1, 2, 3, 3));
        students.add(new Student("Anna", "C", 1, 5, 3, 5));
        students.add(new Student("Oleg", "B", 1, 5, 2, 4));


        Student.studentsRemove(students);
        for (var el : students) {
            System.out.println(el);
        }
        System.out.println("===============");
        Student.printStudents(students, 2);


    }
}
