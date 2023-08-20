package com.softserve.edu07.hw.task1;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(((Payment) o1).calculatePay(), ((Payment) o2).calculatePay());
    }
}
