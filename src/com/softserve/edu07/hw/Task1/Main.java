package com.softserve.edu07.hw.Task1;

import com.softserve.edu05.hw.Task3.Car;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees=new Employee[4];
        employees[0]=new SalariedEmployee("gjfddf","Alex","1234dzc",95,100);
        employees[1]=new ContractEmployee("gjpova","Fox","4235dzc",8000);
        employees[2]=new SalariedEmployee("gjroga","Mike","9876dzc",100,100);
        employees[3]=new ContractEmployee("gjtoro","Jon","5678dzc",7000);

        Arrays.sort(employees, Comparator.comparing(
                Employee::calculatePay
        ));
        for (int i = 0; i < 4; i++) {
            employees.toString();
        }

        for(Employee employee:employees){
            //System.out.println( employee.calculatePay());
            System.out.println(employee.toString());
        }
    }

}
