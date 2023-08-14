package com.softserve.edu07.hm;

class ContractEmployee extends Employee implements Payment {
    private int federalTaxIdmember;
    private double fixedPayment = 20000.0;

    public ContractEmployee(String employeeld, int federalTaxIdmember) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", fixedPayment=" + fixedPayment +
                ", salary=" + fixedPayment +
                ", employeeld='" + getEmployeeld() + '\'' +
                '}';
    }
}
