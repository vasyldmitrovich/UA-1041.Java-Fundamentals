package com.softserve.edu10.hw;

import java.util.*;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }
    private static void run() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task");

            switch (numOfTask) {
                case 1 -> runTask1();
                case 2 -> runTask2();
                case 3 -> runTask3();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print
                ("\nPlease choose one of the tasks :" +
                        "\n\t1 - First task" +
                        "\n\t2 - Second task" +
                        "\n\t3 - Third task" +
                        "\n\t0 - Exit\n");
    }
    public static void runTask3() {
        List<Student> students = new ArrayList<>(10);
        initStudents(students);
        Student.printStudents(students,1);
        Student.printStudents(students,2);
        Student.printStudents(students,3);

        System.out.println("Sorted by name:");
        Student.sortByName(students);

        System.out.println("Sorted by course:");
        Student.sortByCourse(students);

    }

    public static void runTask2() {
        Map<String, String> peopleMap = new HashMap<>();
        initPersonMap(peopleMap);

        printMap(peopleMap);

        System.out.println("Are there duplicated names:%s".formatted(areThereDuplicates(peopleMap)));

        removePerson(peopleMap);

        printMap(peopleMap);
    }

    public static void runTask1() {
        Set<Integer> set1 = fillWithRandoms();
        Set<Integer> set2 = fillWithRandoms();

        System.out.println("Set1:%s".formatted(set1));
        System.out.println("Set2:%s".formatted(set2));

        System.out.println("Union:%s".formatted(union(set1, set2)));
        System.out.println("Intersect:%s".formatted(intersect(set1, set2)));
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        var setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        return setUnion;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        var setUnion = new HashSet<>(set1);
        setUnion.retainAll(set2);
        return setUnion;
    }

    private static Set<Integer> fillWithRandoms() {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(random.nextInt(-5, 6));
        }
        return set;
    }

    public static void initPersonMap(Map<String, String> personMap) {
        personMap.put("Holotsvan", "Ivan");
        personMap.put("Shevchenko", "Dasha");
        personMap.put("Donez", "Ann");
        personMap.put("Puzikova", "Viktoria");
        personMap.put("Micaelian", "Mihailo");
        personMap.put("Smith", "Jack");
        personMap.put("Dizel", "Vin");
        personMap.put("Torvald", "Linus");
        personMap.put("Gosling", "James");
        personMap.put("Stone", "Orest");

    }

    public static void printMap(Map<String, String> peopleMap) {
        System.out.println("FullMap:");
        peopleMap.forEach((lastName, firstName) -> {
            System.out.println("Last Name:%s\nFirst Name:%s".formatted(lastName, firstName));
            System.out.println("-".repeat(10));
        });
    }

    public static boolean areThereDuplicates(Map<String, String> peopleMap) {
        Set<String> uniqueNames = new HashSet<String>(peopleMap.values());
        return uniqueNames.size() != peopleMap.values().size();
    }

    public static void removePerson(Map<String, String> personMap) {
        String nameToDelete = "Orest";
        for (var person : personMap.entrySet()
        ) {
            if (nameToDelete.equals(person.getValue())) {
                System.out.println("%s %s was deleted".formatted(person.getKey(), person.getValue()));
                personMap.remove(person.getKey());
                break;
            }
        }
    }

    public static void removePerson(Map<String, String> personMap, String nameToDelete) {
        for (var person : personMap.entrySet()
        ) {
            if (nameToDelete.equals(person.getValue())) {
                System.out.println("%s %s was deleted".formatted(person.getKey(), person.getValue()));
                personMap.remove(person.getKey());
                break;
            }
        }
    }
    public static void initStudents(List<Student>students){
        students.add(new Student("Ivan",3));
        students.add(new Student("Misha",1));
        students.add(new Student("Slavic",2));
        students.add(new Student("Danil",1));
        students.add(new Student("Grisha",1));
        students.add(new Student("Pasha",2));
        students.add(new Student("Danil",2));
        students.add(new Student("Ivan",1));
        students.add(new Student("Semen",3));
    }

}
