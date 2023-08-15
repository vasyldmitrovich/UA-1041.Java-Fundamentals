public class ContractEmployee extends Employee implements Payable {
    private int federalTaxId;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(int employeeID, String name, int federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeID, name);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(int federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}