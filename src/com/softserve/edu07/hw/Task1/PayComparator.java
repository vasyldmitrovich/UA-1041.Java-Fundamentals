package com.softserve.edu07.hw.Task1;

import java.util.Comparator;

class PayComparatorDesc implements Comparator<Employee> {//Good
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Double.compare(emp2.calculatePay(), emp1.calculatePay());
    }
}

class PayComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Double.compare(emp1.calculatePay(), emp2.calculatePay());
    }
}