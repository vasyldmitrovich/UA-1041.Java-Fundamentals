package com.softserve.edu10.pt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    static int id = 1;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        initWorkers(employeeMap);
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task");
            SCANNER.nextLine();
            switch (numOfTask) {
                case 1 -> dispalyEmps(employeeMap);
                case 2 -> displayEmpById(employeeMap);
                case 3 -> dispalyEmpByName(employeeMap);
                case 4 -> {
                    addingWithoutDuplicates(employeeMap,3,new Employee("Ivan","TikTok manager",300,"09/11/2011"));
                    addingWithoutDuplicates(employeeMap,11,new Employee("Maria", "Product manager", 2500, "07/06/2000"));
                    addingWithoutDuplicates(employeeMap,14,new Employee("Viktor", "Content maker", 2550, "09/11/2001"));
                }
                case 5 -> updateEmps(employeeMap,1,"Ioan","Java developer","12/21/2004");
                case 6 -> {
                    printSortedById(employeeMap);
                    printSortedBySalary(employeeMap);
                    printSortedByName(employeeMap);
                    printSortedByDob(employeeMap);
                    printSortedByPositioin(employeeMap);
                }
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print
                ("\nPlease choose one of the tasks :" +
                        "\n\t1 - Print all emps" +
                        "\n\t2 - Find by ID" +
                        "\n\t3 - Find by Name" +
                        "\n\t4 - Add without duplicates" +
                        "\n\t5 - Update emp" +
                        "\n\t6 - Print sorted emps" +
                        "\n\t0 - Exit\n");
    }


    public static void dispalyEmps(Map<Integer, Employee> empMap) {
        System.out.println("\nThe empMap:\n");
        empMap.forEach((empKey, empValue) -> System.out.format("ID: %d\tNAME: %s%n", empKey, empValue));
    }

    public static void displayEmpById(Map<Integer, Employee> empMap) {
        System.out.println("Please enter an ID of emp:");
        int key = SCANNER.nextInt();
        if (empMap.containsKey(key)) {
            System.out.format("This is %s with %d ID%n", empMap.get(key), key);
        } else {
            System.out.println("There is no such ID%n");
        }
    }

    public static void dispalyEmpByName(Map<Integer, Employee> empMap) {

        System.out.println("Please enter name of emp:");
        String name = SCANNER.nextLine();
        boolean isNameInMap = false;
        for (Employee empValue : empMap.values()) {
            if (empValue.getName().equals(name)) {
                isNameInMap = true;
                System.out.println("Emp: " + empValue);
                break;
            }
        }
        if (!isNameInMap) System.out.println("There is no such name");
    }

    public static void addingWithoutDuplicates(Map<Integer, Employee> empMap, Integer key, Employee value) {

        if (!empMap.containsKey(key) && !Objects.equals(null, key)) {
            Set<Employee> uniqueEmps = new HashSet<Employee>(empMap.values());
            if (!uniqueEmps.contains(value) && !Objects.equals(null, value)) {
                System.out.println("Add emp: %s with %d ID".formatted(value, key));
                empMap.put(key, value);
            } else {
                System.out.println("There is already emp: %s".formatted(value));
            }
        } else {
            System.out.println("Current map already contains %d ID".formatted(key));
        }
    }

    public static void updateEmps(Map<Integer, Employee> empMap, Integer id, String name, String position, String dob) {
        if (empMap.containsKey(id)) {
            Employee empToUpdate = empMap.get(id);
            System.out.println("Old emp:%s %s %s".formatted(empToUpdate.getName(), empToUpdate.getPosition(), empToUpdate.getDob()));
            empToUpdate.setName(name);
            empToUpdate.setPosition(position);
            empToUpdate.setDob(dob);
            System.out.println("New emp:%s %s %s".formatted(empToUpdate.getName(), empToUpdate.getPosition(), empToUpdate.getDob()));
            dispalyEmps(empMap);
        } else {
            System.out.println("There is no such id!!!");
        }
    }

    public static void initWorkers(Map<Integer, Employee> employeeMap) {
        employeeMap.put(id++, new Employee("Ivan", "Programmer", 3000, "12/12/2000"));
        employeeMap.put(id++, new Employee("Ian", "CEO", 6500, "10/07/1989"));
        employeeMap.put(id++, new Employee("Oleh", "Project manager", 2500, "11/09/2000"));
        employeeMap.put(id++, new Employee("Maria", "Product manager", 2500, "07/06/2000"));
        employeeMap.put(id++, new Employee("Oksana", "Devops", 3000, "12/12/2001"));
        employeeMap.put(id++, new Employee("Slava", "HR", 2000, "12/21/2004"));
        employeeMap.put(id++, new Employee("Olha", "CTO", 6000, "01/02/1991"));
    }

    public static void printSortedById(Map<Integer, Employee> empMap) {
        List<Integer> sortedById = new ArrayList<>(empMap.keySet());
        sortedById.sort((id1, id2) -> Integer.compare(id1, id2));
        System.out.println("Sorted by ID:");
        sortedById.forEach(id -> System.out.println("ID:%d\t%s".formatted(id, empMap.get(id))));
    }

    public static void printSortedBySalary(Map<Integer, Employee> empMap) {
        List<Employee> sortedBySalary = new ArrayList<>(empMap.values());
        sortedBySalary.sort((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()));
        System.out.println("Sorted by Salary:");
        sortedBySalary.forEach(emp -> System.out.println(emp));
    }

    public static void printSortedByPositioin(Map<Integer, Employee> empMap) {
        List<Employee> sortedByPosition = new ArrayList<>(empMap.values());
        sortedByPosition.sort((emp1, emp2) -> emp1.getPosition().compareTo(emp2.getPosition()));
        System.out.println("Sorted by Position:");
        sortedByPosition.forEach(emp -> System.out.println(emp));
    }

    public static void printSortedByName(Map<Integer, Employee> empMap) {
        List<Employee> sortedByName = new ArrayList<>(empMap.values());
        sortedByName.sort((emp1, emp2) -> emp1.getPosition().compareTo(emp2.getPosition()));
        System.out.println("Sorted by Name:");
        sortedByName.forEach(emp -> System.out.println(emp));
    }

    public static void printSortedByDob(Map<Integer, Employee> empMap) {
        List<Employee> sortedByDob = new ArrayList<>(empMap.values());
        sortedByDob.sort(Comparator.comparing(emp -> LocalDate.parse(emp.getDob(), dtf)));
        System.out.println("Sorted by DOB:");
        sortedByDob.forEach(emp -> System.out.println(emp));
    }
    public static void test(){
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        initWorkers(employeeMap);
        dispalyEmps(employeeMap);
        addingWithoutDuplicates(employeeMap, 3, new Employee("Oleh", "Project manager", 2500, "11/09/2000"));
        addingWithoutDuplicates(employeeMap, 18, new Employee("Mark", "SEO", 1500, "11/09/2002"));
        dispalyEmps(employeeMap);


        displayEmpById(employeeMap);
        SCANNER.nextLine();

        dispalyEmpByName(employeeMap);

        updateEmps(employeeMap, 1, "Ioan", "Java Programer", "12/21/2004");
        printSortedById(employeeMap);
        printSortedBySalary(employeeMap);
        printSortedByName(employeeMap);
        printSortedByPositioin(employeeMap);
        printSortedByDob(employeeMap);
    }
}