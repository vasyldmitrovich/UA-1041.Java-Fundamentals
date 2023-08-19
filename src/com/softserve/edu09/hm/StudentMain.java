package com.softserve.edu09.hm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> people = new ArrayList<>();
        people.add(new Student("John", 2, 1, 5, 7, 6));
        people.add(new Student("Mary", 1, 2, 2, 1, 1));
        people.add(new Student("Bob", 2, 1, 1, 1, 1));
        people.add(new Student("Alice", 1, 2, 7, 8, 9));

        Student student = new Student("", 0, 0, 0, 0, 0);
        ArrayList fixed = student.fixArray(people);
        System.out.println(fixed);
        List<Student> sortedPeopleList = new ArrayList<>(fixed);
        student.printStudents(sortedPeopleList, sc.nextInt());

    }
}
