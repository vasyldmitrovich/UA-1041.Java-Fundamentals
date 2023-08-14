package com.softserve.edu07.hm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write class in its own file like App.java and there write main method
class MainPayment {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new SalariedEmployee("Mary", 125, 140));
        list.add(new ContractEmployee("Ken", 24355));
        list.add(new SalariedEmployee("john", 12, 59));
        list.add(new ContractEmployee("Bob", 536));
        for (Employee person : list) {
            ((Payment) person).calculatePay();
            System.out.println(person);

        }
        System.out.println("----------------------------------------------------");

        Collections.sort(list, new SortSalary());
        for (Employee person : list) {
            System.out.println(person);
            ((Payment) person).calculatePay();
        }
    }
}
