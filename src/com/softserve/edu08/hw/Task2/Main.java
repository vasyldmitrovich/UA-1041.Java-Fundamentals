package com.softserve.edu08.hw.Task2;

import com.softserve.edu08.hw.Task1.FullName;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student(new FullName("Jon","Fox"),19,2);
        Student student1=new Student(new FullName("Alex","Lontred"),20,3);
        student.activity();
        student.info();
        System.out.println("Info about second student");
        student1.activity();
        student1.info();
        Student student2=student1.clone();
        student2.setCourse(70);
        System.out.println("Info about cloned student");
        student2.activity();
        student2.info();

    }
}
