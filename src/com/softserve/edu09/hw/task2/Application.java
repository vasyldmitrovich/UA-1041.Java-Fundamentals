package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>(
                List.of(
                        new Student("Anna", "A", 2, List.of(1, 2, 3, 4, 3, 3)),
                        new Student("Serhii", "B", 2, List.of(2, 3, 5, 4, 5, 2)),
                        new Student("Maxim", "B", 4, List.of(1, 2, 5, 4, 2, 1)),
                        new Student("Roman", "A", 3, List.of(1, 1, 5, 5, 5, 4)),
                        new Student("Ihor", "C", 2, List.of(4, 4, 5, 4, 4, 3)),
                        new Student("Alex", "B", 2, List.of(3, 3, 2, 2, 4, 5))
                )
        );

        checkAverageGrade(students);
        System.out.println(students);
        System.out.println("Students, who enrolled to next course: ");
        printStudents(students, 3);
    }

    public static void checkAverageGrade(List<Student> list){
        for (int i = 0; i < list.size(); ){
            Student student = list.get(i);
          if(student.getGrades()
                  .stream()
                  .mapToDouble(Integer::doubleValue)
                  .average().getAsDouble() >= 3.0){
              student.setCourse(student.getCourse() + 1);
              i++;
          } else list.remove(student);
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (Student student : students){
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }
}