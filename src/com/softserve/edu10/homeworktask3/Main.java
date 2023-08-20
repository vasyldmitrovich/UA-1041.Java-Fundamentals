package com.softserve.edu10.homeworktask3;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu10.homeworktask3.Student.*;

public class Main {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();

        createList(listOfStudents);
        printStudents(listOfStudents);
        printStudents(listOfStudents, 1);
        printStudents(listOfStudents, 2);
        enrolledStudents(listOfStudents);
        compareStudentsByName(listOfStudents);
        compareStudentsByCourse(listOfStudents);
    }
}
