package com.softserve.edu08.hw;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Student student1 = new Student(new Person.FullName("Ivan", "Holotsva"), 18, 1);
        Student student2 = new Student(new Person.FullName("Ann", "Smith"), 21, 3);
        Student student3 = student1.clone();
        student3.setCourse(5);

        printStudentInfoAndActivity(student1);
        printStudentInfoAndActivity(student2);
        printStudentInfoAndActivity(student3);

    }
    public static void printStudentInfoAndActivity(Student student) {
        System.out.println(student.info());
        System.out.println(student.activity());
        System.out.println("-".repeat(20));
    }
}
