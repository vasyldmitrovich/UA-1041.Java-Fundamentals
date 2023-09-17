import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            products.add(new Product("Manufacturer" + (i+1), "Phone", LocalDate.now().minusYears(2), 3000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Laptop", LocalDate.now().minusYears(1), 12000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Car", LocalDate.now().minusYears(3), 50000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Phone", LocalDate.now().minusYears(3), 5000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Earphones", LocalDate.now().minusYears(2), 2000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Plane", LocalDate.now().minusYears(1), 3000000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Phone", LocalDate.now().minusYears(5), 1500 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Hoodie", LocalDate.now().minusYears(4), 400 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Camera", LocalDate.now().minusYears(6), 2000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Pillow", LocalDate.now().minusYears(8), 300 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Window", LocalDate.now().minusYears(1), 3000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Cable", LocalDate.now().minusYears(2), 100 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Bottle", LocalDate.now().minusYears(3), 200 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Paper", LocalDate.now().minusYears(2), 30 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Phone", LocalDate.now().minusYears(4), 5000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Mirror", LocalDate.now().minusYears(10), 3000 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Clock", LocalDate.now().minusYears(9), 2500 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Plate", LocalDate.now().minusYears(7), 250 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Key", LocalDate.now().minusYears(2), 20 + i * 100));
            products.add(new Product("Manufacturer" + (i+1), "Box", LocalDate.now().minusYears(1), 10 + i * 100));
        }

        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .distinct()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        filteredProducts.forEach(System.out::println);

        List<Employee> employeeList = Arrays.asList(
                new Employee("John"),
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("John")
        );

        Optional<String> mostPopularName = mostPopularName(employeeList.stream());
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameFrequencyMap = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return nameFrequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}