package edu8.hw;

public class task1 {
    public static void main(String[] args){
        FullName studetn1name = new FullName("John", "Lenon");
        Student student1 = new Student(studetn1name, 20, 1);

        FullName student2name = new FullName("Michael", "James");
        Student student2 = new Student(student2name, 21, 2);

        System.out.println("Student 1 info: " + student1.info() + ", Student 1 activity: " + student1.activity());
        System.out.println("Student 2 info: " + student2.info() + ", Student 2 activity: " + student2.activity());

        try{
            Student student3 = (Student) student1.clone();
            student3 =  new Student(student3.fullName, student3.age, 3);

            System.out.println("Student 3 Info (Original): " + student1.info());
            System.out.println("Student 3 Info (Cloned): " + student3.info());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
