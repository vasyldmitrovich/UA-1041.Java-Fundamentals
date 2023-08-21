package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer>grades;

    public Student() {
    }

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public  int getCourse() {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", grades=" + grades +
                '}';
    }
    private double averageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    private void promptToNextCourse() {
        course +=1;
    }
    public static void myRemove(List<Student> listOfStudents) {
        List<Student>studentList = new ArrayList<>();
        for (Student student : listOfStudents) {
            double averageGrade = student.averageGrade();
            if (averageGrade < 3) {
                studentList.add(student);
            } else {
                student.promptToNextCourse();
            }
        }
        listOfStudents.removeAll(studentList);
    }

    public static void printStudents(List<Student> students, int course) {
        int counter=0;
        for (Student student : students) {
            if (course == student.getCourse()) {
                System.out.println("Student " + student.getName() + " course " + student.getCourse());
                counter++;
            }
        }
        if(counter==0){
            System.out.println("there are no students studying on the course: "+course);
        }
    }

}

