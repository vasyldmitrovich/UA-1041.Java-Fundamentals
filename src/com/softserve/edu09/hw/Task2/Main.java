package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alex", "PMA-13", 1, List.of(5, 4, 3, 4, 3)));
        studentList.add(new Student("Bob", "PMA-22", 2, List.of(3, 4, 5, 2, 1)));
        studentList.add(new Student("Fox", "PMA-21", 2, List.of(1, 1, 1, 1, 1)));
        studentList.add(new Student("Jon", "PMP-13", 3, List.of(5, 4, 5, 5, 5)));
        studentList.add(new Student("Max", "PMI-23", 3, List.of(5, 1, 3, 2, 1)));
        studentList.add(new Student("Mark", "FPM-13", 1, List.of(4, 2, 3, 4, 1)));
        System.out.println(studentList);

        Student.myRemove(studentList);
        System.out.println(studentList);
        int courseToPrint = 4;

        Student.printStudents(studentList, courseToPrint);
    }


}
