package edu09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        addStudentsToList(students);
        for (var el : students
        ) {
            System.out.println(el);
        }

        System.out.println("_______________________________");
        Student.removeToAverageGrade(students);

        System.out.println("_______________________________");
        int courseNumber = getCourseNumber();
        Student.printStudents(students, courseNumber);
    }

    private static int getCourseNumber() {
        System.out.println("Enter course number:");
        return SCANNER.nextInt();
    }

    private static void addStudentsToList(List<Student> students) {
        students.add(new Student("Nazar", 1, 85, 4.5, 4.1, 3.7));
        students.add(new Student("Svitlana", 3, 90, 3.5, 2.1, 2.7));
        students.add(new Student("Mykola", 2, 85, 3.1, 2.5, 4));
        students.add(new Student("Volodymyr", 8, 95, 5, 2, 3));
        students.add(new Student("Valerii", 5, 90, 2, 2, 3));
    }

}