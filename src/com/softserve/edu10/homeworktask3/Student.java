package com.softserve.edu10.homeworktask3;

import java.util.Comparator;
import java.util.Iterator;
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

    public static void printStudents(List<Student> students, int course) {
        printLine();
        System.out.println("Students from to the Course: " + course);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student studentIt = iterator.next();
            if (studentIt.getCourse() == course) {
                System.out.println("\t" + studentIt.getName());
            }
        }
    }

    public static void printStudents(List<Student> students) {
        printLine();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student studentIt = iterator.next();
            System.out.println(studentIt.getName() + ", Course: " + studentIt.getCourse());
        }
    }

    public static void enrolledStudents(List<Student> students) {
        printLine();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student studentIt = iterator.next();
            if (studentIt.getCourse() == 2) {
                System.out.println("Congratulations!!! " + studentIt.getName() + " you were enrolled to the specified course");
            }
        }
    }

    public static void createList(List<Student> listOfStudents) {
        listOfStudents.add(0, new Student("John", 1));
        listOfStudents.add(1, new Student("Emily", 2));
        listOfStudents.add(2, new Student("Michael", 2));
        listOfStudents.add(3, new Student("Jessica", 1));
        listOfStudents.add(4, new Student("David", 1));
        listOfStudents.add(5, new Student("Sarah", 2));
        listOfStudents.add(6, new Student("Robert", 1));
        listOfStudents.add(7, new Student("Jennifer", 2));
        listOfStudents.add(8, new Student("William", 1));
        listOfStudents.add(9, new Student("Elizabeth", 1));
    }

    public static void printLine() {
        for (int i = 0; i < 30; i++) {
            System.out.print("---");
        }
        System.out.println();
    }

    public static void compareStudentsByName(List<Student> student) {
        student.sort(Comparator.comparing(Student::getName));
        printStudents(student);
    }

    public static void compareStudentsByCourse(List<Student> student) {
        student.sort(Comparator.comparing(Student::getCourse));
        printStudents(student);
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
}
