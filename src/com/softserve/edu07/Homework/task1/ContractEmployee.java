package com.softserve.edu07.Homework.task1;

public class ContractEmployee extends Employee implements Payment  {

    int fixed_monthly_payment;
    String name;
    int federalTaxIdmember;



    @Override
    public int calculatePay() {
        return fixed_monthly_payment ;
    }


    public ContractEmployee(String employeeld, String name, int fixed_monthly_payment, int federalTaxIdmember) {
        super(employeeld, name);
        this.fixed_monthly_payment = fixed_monthly_payment;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeld='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                "the average monthly salary = " + calculatePay() +
                '}';
    }
}
