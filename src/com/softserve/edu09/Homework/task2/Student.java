package com.softserve.edu09.Homework.task2;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student {

   public String name;
   public int group;
   public int course;

   private List<Integer> grades;

    public Student() {
    }

    public Student(String name, int group, int course, List<Integer> grades) {
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

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
    public double getAverageGrade() {
        double sum = 0;
        for (var d : grades) {
            sum += d;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }



}
