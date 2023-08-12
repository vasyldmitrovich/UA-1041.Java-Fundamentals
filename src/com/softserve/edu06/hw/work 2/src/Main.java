public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[]{
                new Employee("Alex", 23, 40000.00),
                new Developer("Alice", 21, 120000.50, "Java Developer")
        };

        for (var staff : employee) {
            System.out.println(staff.report());
        }
    }
}