public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student_1 = new Student(21, new FullName("Bill", "Gates"), 3);
        Student student_2 = new Student(19, new FullName("Ilon", "Mask"),2);

        System.out.println(student_1.info());
        System.out.println(student_1.activity());
        System.out.println(student_2.info());
        System.out.println(student_2.activity());

        Student student3 = (Student) student_1.clone();
        student3.setCourse(4);
        System.out.println(student3.info());
    }
}