package com.softserve.edu10.hw.task_3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        boolean areNotStudents = true;
        var iter = students.iterator();
        while (iter.hasNext()) {
            var el = iter.next();
            if (el.getCourse() == courseNumber) {
                System.out.println(el.getName());
                areNotStudents = false;
            }
        }
        if (areNotStudents) {
            System.out.println("Students don`t found!");
        }

    }

    public static void compareByName(List<Student> students) {
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void compareByCourse(List<Student> students) {
        students.sort(Comparator.comparing(Student::getCourse));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}' + "\n";
    }
}
