package edu06;

public class Maindeveloper {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Sergii", 20, 50000, "Junior  developer");
        Employee employee1 = new Employee("Helena", 46, 16000.50);


        System.out.println(developer1);
        System.out.println(developer1.report());
        System.out.println("----------------------");
        System.out.println(employee1);
        System.out.println(employee1.report());
    }
}
}
