package com.softserve.edu09.hm;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    private String name;
    private int group;
    private int course;

    private int englishGrade;
    private int mathGrade;
    private int historyGrade;

    public Student(String name, int group, int course, int englishGrade, int mathGrade, int historyGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
    }

    private int averageGrade() {

        return (getEnglishGrade() + getMathGrade() + getHistoryGrade()) / 3;
    }


    public ArrayList fixArray(ArrayList<Student> people) {
        ArrayList<Student> studentsToKeep = new ArrayList<>();

        for (Student person : people) {
            if (person.averageGrade() >= 3) {
                person.setCourse(person.getCourse() + 1);
                studentsToKeep.add(person);
            }
        }

//        people.clear();
//        people.addAll(studentsToKeep);
        return  studentsToKeep;
    }


    public void printStudents(List<Student> students, int course) {
        for (var person : students) {
            if (person.getCourse() == course) {
                System.out.println(person.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", englishGrade=" + englishGrade +
                ", mathGrade=" + mathGrade +
                ", historyGrade=" + historyGrade +
                '}';
    }
}
