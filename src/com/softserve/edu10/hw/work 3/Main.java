import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Carol", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Eve", 2));

        Student.printStudents(students, 2);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("\nStudents sorted by name: ");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
        
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        });

        System.out.println("\n Students sorted by course: ");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
    }
}