package edu07;

public class ContractEmployee extends Employee{
    private int hours;
    private double fixedRate;
    private String federalTaxIdMember;

    public ContractEmployee() {

    }

    public ContractEmployee(String employeeId, String name, int hours, double fixedRate, String federalTaxIdMember) {
        super(employeeId, name);
        this.hours = hours;
        this.fixedRate = fixedRate;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(double fixedRate) {
        this.fixedRate = fixedRate;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hours * fixedRate;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + super.toString() + " " + calculatePay() + "uah}";
    }
}
