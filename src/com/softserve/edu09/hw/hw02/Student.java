package com.softserve.edu09.hw.hw02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades = new HashMap<>();

    public Student() {
    }

    public Student(String name, String group, int course, int gradeMath, int gradePhysics, int gradeCS) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades.put("Math", gradeMath);
        this.grades.put("Physics", gradePhysics);
        this.grades.put("CS", gradeCS);
    }

    public String getName() {
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public double averageGrade() {
        double sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void studentsRemove(List<Student> students) {
        var itr = students.iterator();
        while (itr.hasNext()) {
            Student student = itr.next();
            if (student.averageGrade() < 3) {
                itr.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.format("Student %s enrolled on course %d\n", student.getName(), student.getCourse());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

}
