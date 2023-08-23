package com.softserve.edu10.hm;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student{
    private String name;
    private int course;

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

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, int course){
        List<String> studentsName = new ArrayList<>();

        for (var person:students){
            if (person.getCourse() == course){
                studentsName.add(person.getName());
            }
        }
        Iterator iter = studentsName.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public int compareCourse(Object a, Object b) {
        if (((Student) a).getCourse() == ((Student) b).getCourse()) {
            return 0;
        } else if (((Student) a).getCourse() < ((Student) b).getCourse()) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareName(Object a, Object b) {
        if (((Student) a).getName() == ((Student) b).getName()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
