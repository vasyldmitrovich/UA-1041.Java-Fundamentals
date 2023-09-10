package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) {

        // Task 1,2
        System.out.println("Task 1,2");

        Student student1 = new Student(new FullName("Bob", "Jonson"), 22, 3);
        Student student2 = student1.clone();
        student2.setCourseNumber(4);
        System.out.println("First student:");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();
        System.out.println("Cloning and changing student:");
        System.out.println(student2.info());
        System.out.println(student2.activity());
    }
}
