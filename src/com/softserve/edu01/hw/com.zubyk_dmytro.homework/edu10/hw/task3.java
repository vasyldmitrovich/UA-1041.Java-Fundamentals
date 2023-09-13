package edu10.hw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Course: " + course;
    }

    public static void printStudents(List<Student> students, int targetCourse) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students in Course " + targetCourse + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 101));
        students.add(new Student("David", 103));
        students.add(new Student("Eve", 102));

        // Sort students by name
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort students by course
        Collections.sort(students, Comparator.comparingInt(Student::getCourse));
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Print students in a specific course
        Student.printStudents(students, 102);
    }
}

