import java.util.List;
public class Student {
    private String name;
    private char group;
    private int course;
    private List<Double> grades;

    public Student() {
    }

    public Student(String name, char group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean promoteStudent() {
        double average = calculateAverage();
        if (average >= 3.0) {
            course++;
            return true;
        }
        return false;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ": ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
