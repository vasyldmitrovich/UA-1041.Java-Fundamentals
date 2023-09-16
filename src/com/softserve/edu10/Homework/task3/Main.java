package com.softserve.edu10.Homework.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sergiy Wert", 2));
        students.add(new Student("Sam Kween", 1));
        students.add(new Student("Mark Quen", 3));
        students.add(new Student("Olga Kovalenko", 2));
        students.add(new Student("Melko Swetlana", 3));

        System.out.println("Студенти, відсортовані за іменами:");
        Collections.sort(students,Comparator.comparing(Student::getName));
        for (Student st : students) {
            System.out.println(st.getName());
        }


            System.out.println("Студенти, відсортовані за курсами:");
            Collections.sort(students,Comparator.comparingInt(Student::getCourse));
            for (Student st : students) {
                System.out.println(st.getName() + " - " + st.getCourse() + " курс");
            }


                System.out.println("Студенти, на 2 курсі:");
                int Yourcourse = 2;
                Student.printStudent(students, Yourcourse);


        }
    }


