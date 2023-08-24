package com.softserve.edu10.hw.task3;

import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;

    private int course;


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

    public static void printStudents(List<Student> students, int course) {

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    public static Comparator<Student> courseComparator = Comparator.comparingInt(Student::getCourse);

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
