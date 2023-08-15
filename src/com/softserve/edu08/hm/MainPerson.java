package com.softserve.edu08.hm;

class MainPerson {
    public static void main(String[] args) {
        Student student1 = new Student(new Person.FullName("Mary", "Smith"), 25, 2);
        Student student2 = new Student(new Person.FullName("John", "Collins"), 30, 3);


        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = (Student) student1.clone();
        System.out.println(student3.info());
        student3.course = 4;
        System.out.println(student3.info());

    }
}

