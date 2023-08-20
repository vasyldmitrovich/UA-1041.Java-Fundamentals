package com.softserve.edu09.homeworktask2;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu09.homeworktask2.Student.*;


public class Main {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Steve", 1, 1, List.of(3, 4, 5, 2, 5)));
        listOfStudents.add(new Student("Alen", 3, 2, List.of(3, 2, 2, 3, 3)));
        listOfStudents.add(new Student("Arnold", 1, 2, List.of(3, 4, 5, 2, 5)));
        listOfStudents.add(new Student("Mila", 4, 1, List.of(4, 4, 3, 5, 4)));
        listOfStudents.add(new Student("Diana", 4, 2, List.of(4, 4, 3, 5, 4)));
        listOfStudents.add(new Student("Alice", 5, 3, List.of(3, 2, 2, 2, 3)));
        listOfStudents.add(new Student("John", 2, 1, List.of(3, 5, 5, 5, 4)));

        printListOfStudents(listOfStudents);
        removeStudents(listOfStudents);
        printListOfStudents(listOfStudents);
        printStudents(listOfStudents, 11);
        printStudents(listOfStudents, 12);
    }
}
