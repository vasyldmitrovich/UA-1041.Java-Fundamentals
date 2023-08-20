package com.softserve.edu09.homeworktask2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Integer> grades;

    public Student() {
    }

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public static void printListOfStudents(List<Student> listOfStudents) {
        Iterator<Student> iterator = listOfStudents.iterator();
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void removeStudents(List<Student> listOfStudents) {
        List<Student> studentToRemove = new ArrayList<>();
        for (Student student : listOfStudents) {
            double averageGrade = student.averageGrade();
            if (averageGrade < 3) {
                studentToRemove.add(student);
            } else {
                student.promptToNextCourse();
            }
        }
        listOfStudents.removeAll(studentToRemove);
    }

    public static void printStudents(List<Student> listOfStudents, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : listOfStudents) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", group=" + group + ", course='" + course + '\'';
    }

    private double averageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    private void promptToNextCourse() {
        course = course + 10;
    }
}
