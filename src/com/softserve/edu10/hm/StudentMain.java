package com.softserve.edu10.hm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> people = new ArrayList<>();
        people.add(new Student("Kit", 2));
        people.add(new Student("Alice", 2));
        people.add(new Student("Bob", 1));
        people.add(new Student("Alex", 1));
        people.add(new Student("Lisa", 3));
//        Student.printStudents(people,2);
        people.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.compareName(s1, s2);
            }
        });
        System.out.println(people);
        people.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.compareCourse(s1, s2);
            }
        });
        System.out.println(people);
    }
}
