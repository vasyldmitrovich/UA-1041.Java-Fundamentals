package com.softserve.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.printf("Students of %d course%n", course);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (course == student.getCourse()) {
                System.out.printf("Name:%s,Course:%d%n", student.getName(), student.getCourse());
                System.out.println("_".repeat(10));
            }
        }
    }

    public static void printStudents(List<Student> students) {
       students.forEach(System.out::println);
    }

    public static void sortByCourse(List<Student> students) {
        students.sort(Comparator.comparing(Student::getCourse));
        printStudents(students);
    }

    public static void sortByName(List<Student> students) {
        students.sort(Comparator.comparing(Student::getName));
        printStudents(students);
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

    @Override
    public String toString() {
        return "Name:%s\tCourse:%d".formatted(name,course);
    }
}
