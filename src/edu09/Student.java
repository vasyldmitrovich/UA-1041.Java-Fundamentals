package edu09;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private int group;
    private int course;
    private Map<String, Double> grades = new HashMap<>();

    public Student() {
    }

    public Student(String name, int group, int course, double chemistryGrade, double biologyGrade, double psychologyGrade) {
        this.name = name;
        this.group = group;
        this.course = course;

        this.grades.put("chemistry", chemistryGrade);
        this.grades.put("biology", biologyGrade);
        this.grades.put("psychology", psychologyGrade);
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

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public static void removeToAverageGrade(List<Student> students) {

        for (var student : students
        ) {
            int total = 0;
            double summ = 0.0;
            for (var el : student.getGrades().values()
            ) {
                summ += el;
                total++;
            }
            double average = summ / total;
            if (average >= 3) {
                System.out.println("Student " + student.getName() + ": will be automatically promoted to the next course level!");
            } else {
                System.out.println("The student " + student.getName() + ": will not be transferred to the next course!");
            }

        }

    }

    public static void printStudents(List<Student> students, int course) {
        int n = 0;
        for (var el : students
        ) {
            if (el.getCourse() == course) {
                System.out.println(el.getName());
                n++;
            }
        }
        if (n == 0) {
            System.out.println("course not found!");

        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course='" + course + '\'' +
                ", grades=" + grades +
                '}';
    }
}