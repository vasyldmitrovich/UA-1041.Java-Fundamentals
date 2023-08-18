package com.softserve.edu08.pt.task1_task2;

public class Task1 {


    public static void main(String[] args) {


        Student student1 = new Student(new FullName("John", "Smith"), 19, 20);
        Student student2 = new Student(new FullName("Billy", "Smith"), 18, 19);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("=".repeat(15));

        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("=".repeat(15));

        Student student3 = student1.copy();

        student3.setCourse(22);

        System.out.println(student3.info());
        System.out.println(student3.activity());

/*
        Programmer programmer = new Programmer(new FullName("John", "Smith"), 25);

        System.out.println(programmer.info());
        programmer.activity();
*/
    }
}
