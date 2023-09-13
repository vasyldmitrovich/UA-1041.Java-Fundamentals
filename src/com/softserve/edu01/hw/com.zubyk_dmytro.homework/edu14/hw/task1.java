package edu14.hw;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String manufacturer;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacturer, String category, LocalDate dateOfManufacture, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}

public class task1 {
    public static void main(String[] args) {
        List<Product> products = createProductList();

        // Sort products by price in ascending order and filter by category, price, and date of manufacture
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getCategory().equals("Phone")
                        && product.getPrice() > 3000
                        && product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted products:");
        filteredProducts.forEach(System.out::println);

        // Example stream of Employee objects
        Stream<Employee> employeeStream = createEmployeeStream();

        Optional<String> mostPopularEmployeeName = mostPopularName(employeeStream);
        System.out.println("Most popular employee name: " + mostPopularEmployeeName.orElse("No employees found"));
    }

    // Method to create a list of Product objects (for testing purposes)
    private static List<Product> createProductList() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Samsung", "Phone", LocalDate.of(2021, 8, 15), 3500.0));
        productList.add(new Product("Apple", "Phone", LocalDate.of(2020, 7, 10), 4000.0));
        productList.add(new Product("Google", "Phone", LocalDate.of(2021, 6, 5), 3200.0));
        productList.add(new Product("Sony", "Phone", LocalDate.of(2020, 9, 25), 3100.0));
        productList.add(new Product("Samsung", "Phone", LocalDate.of(2021, 3, 12), 3300.0));
        productList.add(new Product("LG", "Phone", LocalDate.of(2020, 12, 8), 3400.0));
        productList.add(new Product("Apple", "Phone", LocalDate.of(2019, 11, 20), 4200.0));
        productList.add(new Product("Sony", "Phone", LocalDate.of(2020, 5, 18), 3150.0));
        productList.add(new Product("Google", "Phone", LocalDate.of(2021, 4, 30), 3280.0));
        productList.add(new Product("Motorola", "Phone", LocalDate.of(2021, 2, 1), 3400.0));
        productList.add(new Product("Samsung", "Tablet", LocalDate.of(2021, 7, 8), 2600.0));
        productList.add(new Product("Apple", "Tablet", LocalDate.of(2020, 6, 15), 3800.0));
        productList.add(new Product("Samsung", "Tablet", LocalDate.of(2020, 5, 10), 2700.0));
        productList.add(new Product("Google", "Tablet", LocalDate.of(2021, 4, 12), 3300.0));
        productList.add(new Product("Sony", "Tablet", LocalDate.of(2021, 1, 22), 2950.0));
        productList.add(new Product("Samsung", "Laptop", LocalDate.of(2020, 9, 7), 4100.0));
        productList.add(new Product("Apple", "Laptop", LocalDate.of(2019, 10, 5), 5000.0));
        productList.add(new Product("Dell", "Laptop", LocalDate.of(2020, 8, 14), 4200.0));
        productList.add(new Product("Lenovo", "Laptop", LocalDate.of(2021, 3, 28), 3800.0));
        productList.add(new Product("HP", "Laptop", LocalDate.of(2021, 2, 16), 3900.0));

        return productList;
    }

    // Example Employee class
    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Method to create a stream of Employee objects (for testing purposes)
    private static Stream<Employee> createEmployeeStream() {
        List<Employee> employees = Arrays.asList(
                new Employee("John"),
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("John"),
                new Employee("Alice")
        );
        return employees.stream();
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        return nameCountMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}

