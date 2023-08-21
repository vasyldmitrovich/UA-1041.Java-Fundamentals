package com.softserve.edu08.hw.task12;

public class App {
    public static void main(String[] args) {
        Student stud1 = new Student(new FullName("David", "Cooper"), 18, 2);
        Student stud2 = new Student(new FullName("Alice", "Baker"), 19, 3);

        Student stud3 = stud1.clone();
        stud3.setCourse(1);


        System.out.println(stud1.info());
        System.out.println(stud1.activity());


        System.out.println("===================");


        System.out.println(stud2.info());
        System.out.println(stud2.activity());


        System.out.println("===================");


        System.out.println(stud3.info());
        System.out.println(stud3.activity());
    }
}
