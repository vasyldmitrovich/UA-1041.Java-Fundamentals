import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 'A', 1, List.of(3.5, 4.0, 2.5)));
        students.add(new Student("Alice", 'B', 2, List.of(2.0, 3.0, 3.2)));
        students.add(new Student("Bob", 'A', 1, List.of(2.8, 3.1, 3.4)));
        students.add(new Student("Emily", 'C', 3, List.of(4.0, 4.0, 4.0)));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateAverage() < 3.0) {
                iterator.remove();
            }
        }

        for (Student student : students) {
            student.promoteStudent();
        }

        int specificCourse = 2;
        Student.printStudents(students, specificCourse);
    }
}