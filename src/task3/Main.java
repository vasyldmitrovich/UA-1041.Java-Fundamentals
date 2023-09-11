package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        addStudentsToList(students);
        System.out.println(students);

        System.out.println("_______________________");
        int courseNumber = 85;
        System.out.println("Student names who are enrolled in the specified course:" + courseNumber);
        Student.printStudents(students, courseNumber);

        System.out.println("_______________________");
        System.out.println("Students sorted by name:");
        Student.compareByName(students);
        System.out.println(students);


        System.out.println("_______________________");
        System.out.println("Students sorted by course:");
        Student.compareByCourse(students);
        System.out.println(students);

    }

    private static void addStudentsToList(List<Student> students) {
        students.add(new Student("Alice", 2019));
        students.add(new Student("Mary", 2018));
        students.add(new Student("Meryl", 2020));
        students.add(new Student("Helen", 2021));
        students.add(new Student("Sylvia", 2023));

    }
}
