
class Employee {
    private String name;
    private int rate;
    private double hours;
    static public double totalSum;

    public Employee() {
    }

    public Employee(String name, int rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

     public double getSalary(int rate, double hours) {
        double salary = rate * hours;
        return salary;
     }

     static double getBonuses(double salary) {
        return salary/10;
     }

    public static double getTotalSum(double salary, double getBonuses) {
        totalSum = salary + getBonuses;
        return totalSum;
    }

    void toString(String name, int rate, double hours) {
         System.out.println(name);
         System.out.println("Your rate: " + rate);
         System.out.println("Your working hours: " + hours);
         System.out.println("Your salary: " + getSalary(rate, hours));
         System.out.println("Your bonuses sum: " + getBonuses(getSalary(rate, hours)));
         System.out.println("Your total sum: " + getTotalSum(getSalary(rate, hours),getBonuses(getSalary(rate, hours))));
     }
}

public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.toString("Bogdan", 5, 52.5);

        Employee person2 = new Employee();
        person1.toString("Anton", 3, 37.0);

        Employee person3 = new Employee();
        person1.toString("Maksym", 4, 48.0);
    }
}