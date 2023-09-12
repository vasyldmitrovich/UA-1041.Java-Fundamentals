package com.softserve.edu10.hw;

public class App {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        var set1 = Task_1.getRandom(-10,10,7);
        var set2 = Task_1.getRandom(-10,10,7);
        System.out.println("First set: " + set1);
        System.out.println("Second set: "+set2);
        System.out.println("Union set: "+ Task_1.getUnion(set1,set2));
        System.out.println("Intersect set: " + Task_1.getIntersect(set1,set2));

        // Task 2
        System.out.println();
        System.out.println("Task 2");
        var personMap = Task_2.addPersons();
        com.softserve.edu10.pt.Task_1.printHashMap(personMap);
        Task_2.nameDuplicated(personMap);
        System.out.println();
        System.out.print("Please, input name for removing: ");
        var name = com.softserve.edu10.pt.Task_1.getName();
        var newPersonMap= Task_2.removedName(personMap,name);
        com.softserve.edu10.pt.Task_1.printHashMap(newPersonMap);

        // Task 3
        System.out.println("Task 3");
        var students = Student.getStudentsList();
     //   Student.printStudents(students);

    }
}
