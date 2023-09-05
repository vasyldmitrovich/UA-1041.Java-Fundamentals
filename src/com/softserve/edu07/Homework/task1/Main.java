package com.softserve.edu07.Homework.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main (String[] args) {
        Employee[] employees =
                {
                new ContractEmployee("03245", "Alona", 2000, 15),
                new ContractEmployee("03657","Svetlana",1500,152),
                new SalariedEmployee("03985","Vasil",158,28,90),
                new SalariedEmployee("08756","Maxim",165,68,85)


        };
        Arrays.sort(employees, Comparator.comparing(Employee::calculatePay));
        for (Employee employee: employees) {
            //System.out.println(employee);
            System.out.println("Employee\t"+ employee.getName());
            System.out.println("Employeed ID\t" + employee.getEmployeeld());
            System.out.println("Average monthly wage\t"+ ((Payment)employee).calculatePay());
        }




    }

   public int compare(Employee o1,Employee o2){
       return Integer.compare(((Payment)o1).calculatePay(),((Payment)o2).calculatePay());
   }
}
