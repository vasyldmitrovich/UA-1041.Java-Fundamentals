package com.softserve.edu10.pt.task3;

import java.util.Collections;
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

    public static void printStudents(List<Student> students, int course){
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()){
            Student temporaryStudent = iterator.next();
            if (temporaryStudent.getCourse() == course){
                System.out.println(temporaryStudent.getName());
            }
        }
    }

    public static void sortByName(List<Student> students){
      //  Collections.sort(students, Comparator.comparing(Student::getName));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void sortByCourse(List<Student> students){
       // Collections.sort(students, Comparator.comparing(Student::getCourse));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getCourse(), o2.getCourse());
            }
        });
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void displayStudents(List<Student> students){
        for(Student student : students){
            System.out.println(student);
        }
    }

}