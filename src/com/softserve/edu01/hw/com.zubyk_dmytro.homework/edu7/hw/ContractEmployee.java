package edu7.hw;

class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
