package com.softserve.edu08.Homework.task1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Maksim", "Smit"),28,3);
        Student student2 = new Student(new FullName("Petro", "Shevchenko"),32,4);

        Student student3 = student1.clone();
        student3.setCourse(2);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }

}
