package com.softserve.edu09.Homework.task2;

import java.util.*;

import static java.util.Scanner.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 15, 1, List.of(1, 3, 2, 3, 4)));
        students.add(new Student("Britany", 12, 3, List.of(3, 5, 3, 4, 4)));
        students.add(new Student("Sem", 10, 2, List.of(3, 4, 2, 3, 4)));

        removeUnderperformingStudents(students);


        for (Student student : students) {
            System.out.println(student);
        }
    }


    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                // Видаляємо студента зі списку, якщо середній бал менше 3.0
                iterator.remove();
            } else {
                // Якщо середній бал >= 3.0, переводимо студента на наступний рівень курсу
                student.setCourse(student.getCourse() + 1);
                System.out.println("Student\t" + student.getName() +"\t"+ "promoted to the next course level");
            }

        }
    }

    public static void Students_of_course(List<Student> students, int course) {


        for (Student student : students) {
           // if (student.getCourse() == course) {
                System.out.println("Enter the course:");
                course = SCANNER.nextInt();
            System.out.println("Студенти на " + course + " курсі:");
                System.out.println(student.getName());

            }
        }
    }










