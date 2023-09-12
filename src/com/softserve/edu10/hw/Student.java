package com.softserve.edu10.hw;

import java.awt.*;
import java.util.ArrayList;

public class Student {
    private String name;
    private int courseNumber;

    public Student() {
    }

    public Student(String name, int courseNumber) {
        this.name = name;
        this.courseNumber = courseNumber;
    }

    public static void printStudents(List listOfStudents, int course){
        System.out.println("Students are enrolled in the " + course + " course:\n" + listOfStudents);
    }

    public static ArrayList<Object> getStudentsList(){
        var students = new ArrayList<>();
        students.add(new Student("Dave",3));
        students.add(new Student("Dan",2));
        students.add(new Student("Bob",3));
        students.add(new Student("Brian",4));
        students.add(new Student("Brian",3));
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseNumber=" + courseNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}
