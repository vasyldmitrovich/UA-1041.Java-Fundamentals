package com.softserve.edu08.hw;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(new FullName("Serhii", "Kovalenko"), 20, 3);
        printInfo(student);

        Student copyOfStudent = (Student) student.clone();
        System.out.println("\nStudent after cloning");
        printInfo(copyOfStudent);
        System.out.println("\nStudent with changed course");
        copyOfStudent.setCourse(4);
        printInfo(copyOfStudent);
    }

    public static void printInfo(Person person){
        System.out.println(person.info());
        System.out.println(person.activity());
    }
}
