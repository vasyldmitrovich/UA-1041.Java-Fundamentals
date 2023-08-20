package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) {


        Student student1 = new Student(new FullName("Alex", "Black"), 21, 4);
        Student student2 = new Student(new FullName("John", "Snow"), 19, 2);
        Student student3 = student1.clone();
        student3.setCourse(3);

        System.out.println("=====================");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("=====================");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("=====================");
        System.out.println(student3.info());
        System.out.println(student2.activity());
    }

}
