package com.softserve.edu09.hw;

import java.util.*;

public class App {
    static final Random RANDOM = new Random();
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task\n");

            switch (numOfTask) {
                case 1 -> runTask1();
                case 2 -> runTask2();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print("\nPlease choose one of the tasks :" + "\n\t1 - First task" + "\n\t2 - Second task" +  "\n\t0 - Exit\n");
    }
    public static void runTask2(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 121, 1, genRandGrades()));
        students.add(new Student("Misha", 123, 3, genRandGrades()));
        students.add(new Student("Danil", 121, 1, genRandGrades()));
        students.add(new Student("Pavel", 122, 2, genRandGrades()));
        students.add(new Student("Dasha", 122, 1, genRandGrades()));

        printStudents(students);

        removeStudents(3, students);

        printStudents(2, students);
    }
    public static void runTask1() {
        List<Integer> myCollection = new ArrayList<>(10);
        fillWithTenRands(myCollection);
        System.out.println("Original list:");
        System.out.println(myCollection);

        //Swap the maximum and minimum elements in the list.
        System.out.println("\nSwapped min and max list:");
        printMinAndMax(myCollection);
        swapMinAndMax(myCollection);
        System.out.println(myCollection);

        //Insert a random three-digit number before the first negative element of the list
        System.out.println("\nAfter inserting a random three-digit number:");
        insertDigitBeforeFirstNegative(myCollection);
        System.out.println(myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        System.out.println("\nZeroes between numbers with different sign:");
        insertZeroBetween(myCollection);
        System.out.println(myCollection);

        //Copy the first k elements of the myCollection to the list1, in direct order,
        //and the rest to the list2 in reverse order.
        System.out.println("\nCopy k elements");
        int k = myCollection.size() / 2;
        List<Integer> list1 = new ArrayList<>(List.copyOf(myCollection.subList(0, k)));
        List<Integer> list2 = new ArrayList<>(List.copyOf(myCollection.subList(k, myCollection.size())));
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println("\nList1: \n" + list1);
        System.out.println("List2: \n" + list2);

        //In a list myCollection remove the last even element (if there are even elements in the list). If
        //there is no such element, display a message.
        System.out.println("Removing last even:");
        removeLastEven(myCollection);
        System.out.println(myCollection);

        //Remove from the list myCollection the element following the first minimum. If the minimum
        //element is the last one, nothing needs to be removed.
        System.out.println("\nRemove element which following min:");
        removeFollowingMinEl(myCollection);
        System.out.println(myCollection);

    }

    public static void fillWithTenRands(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(RANDOM.nextInt(-10, 11));
        }
    }

    public static void swapMinAndMax(List<Integer> list) {
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        int minIndex = list.indexOf(min);
        int maxIndex = list.indexOf(max);
        list.set(minIndex, max);
        list.set(maxIndex, min);
    }

    public static void printMinAndMax(List<Integer> list) {
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
    }

    public static void insertDigitBeforeFirstNegative(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if (num < 0) {
                list.set(list.indexOf(num) - 1, RANDOM.nextInt(100, 999));
                break;
            }
        }
    }

    public static void insertZeroBetween(List<Integer> list) {
        for (int i = 1; i < list.size() - 1; i++) {
            if ((list.get(i - 1) * list.get(i + 1)) < 0) {
                list.set(i, 0);
            }
        }
    }

    public static void removeLastEven(List<Integer> list) {
        boolean evenFound = false;
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) % 2 == 0) {
                evenFound = true;
                list.remove(i);
                break;
            }
        }
        if (!evenFound) System.out.println("There are no even numbers");
    }

    public static void removeFollowingMinEl(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i), Collections.min(list))) {
                list.remove(i + 1);
            }
        }
    }

    public static int[] genRandGrades() {
        int size = RANDOM.nextInt(4, 8);
        int[] grades = new int[size];
        for (int i = 0; i < size; i++) {
            grades[i] = RANDOM.nextInt(1, 6);
        }
        return grades;
    }

    public static void removeStudents(int lowerBound, List<Student> students) {
        System.out.println("\nWho will move to next year?");
        Iterator iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getAverageGrade() < lowerBound) {
                System.out.println("Student :" + student + " was removed");
                iterator.remove();
            } else {
                System.out.println("Student :" + student + " was promoted");
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students) {
        System.out.println("\nAll students:");
        students.forEach(student -> System.out.println(student));
    }

    public static void printStudents(int course, List<Student> students) {
        System.out.println("\nThis is students of " + course + " course:");
        int numOfStudents = 0;
        for (var student : students) {
            if (student.getCourse() == course) {
                numOfStudents++;
                System.out.format("%s is enrolled to %d course\n", student.getName(), student.getCourse());
            }
        }
        if (numOfStudents==0) System.out.println("There no students of this course");
    }
}
