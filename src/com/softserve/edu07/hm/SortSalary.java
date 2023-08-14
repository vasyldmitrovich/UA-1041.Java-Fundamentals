package com.softserve.edu07.hm;

import java.util.Comparator;

class SortSalary implements Comparator<Employee> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Employee a, Employee b) {
        if (((Payment) a).calculatePay() == ((Payment) b).calculatePay()) {
            return 0;
        } else if (((Payment) a).calculatePay() < ((Payment) b).calculatePay()) {
            return 1;
        } else {
            return -1;
        }
    }
}
