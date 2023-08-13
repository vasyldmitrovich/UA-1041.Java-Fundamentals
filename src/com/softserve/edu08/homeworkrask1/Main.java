package com.softserve.edu08.homeworkrask1;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Bob", "Devis"), 23, 1);
        Student student2 = new Student(new FullName("Alice", "Norman"), 29, 6);

        Student student3 = null;
        try {
            student3 = student1.clone();
            student3.setNumberOfCourse(6);
            student3.info();
            student3.activity();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        int numberOfDashes = 100;
        String line = "-".repeat(numberOfDashes);
        System.out.println(line);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(line);
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println(line);
        System.out.println("Copied student with new course number");
        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
