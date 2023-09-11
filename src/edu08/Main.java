package edu08;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Olha", "Derbak"), 31, 92);
        Student student2 = new Student(new FullName("Ivan", "Ivanov"), 25, 97);
        Student student3 = student1.clone();
        student3.setCourseNumber(101);

        System.out.println("Student1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println();
        System.out.println("Student2:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println();
        System.out.println("Student3:");
        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}

