package com.softserve.edu09.hw;

import java.util.Arrays;
import java.util.Map;

public class Student {
    private String name;
    private int group;
    private int course;
    private int[] grades;

    public Student(String name, int group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public int getAverageGrade() {
        int sum = 0;
        for (var grade : this.grades
        ) {
            sum += grade;
        }
        return sum / grades.length;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
