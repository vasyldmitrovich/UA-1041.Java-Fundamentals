package edu9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void promoteStudent() {
        double average = calculateAverageGrade();
        if (average >= 3.0) {
            course++;
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}

public class task2 {
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Add students to the collection
        studentList.add(new Student("Alice", "Group A", 1, List.of(90, 85, 78)));
        studentList.add(new Student("Bob", "Group B", 2, List.of(70, 65, 72)));
        studentList.add(new Student("Charlie", "Group A", 3, List.of(85, 80, 88)));
        studentList.add(new Student("David", "Group B", 1, List.of(60, 72, 75)));
        studentList.add(new Student("Eve", "Group C", 2, List.of(78, 85, 90)));

        // Remove students with GPA < 3 and promote others
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = student.calculateAverageGrade();
            if (average < 3.0) {
                iterator.remove();
            } else {
                student.promoteStudent();
            }
        }

        // Print students in a specific course
        int targetCourse = 2;
        printStudents(studentList, targetCourse);
    }
}
