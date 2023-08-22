public class Main {
    public static void main(String[] args) {
        Department department_1 = new Department(
                "IT", new Department.Address("Lviv", "Kyivska", 14)
        );
        Department department_2 = department_1.clone();
        department_1.address.city = "Odesa";

        System.out.println(department_1);
        System.out.println(department_2);
    }
}
