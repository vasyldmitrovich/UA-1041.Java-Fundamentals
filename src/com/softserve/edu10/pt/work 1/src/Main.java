import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //point 1
        var employeeMap = Map.of(
                1, "Mary",
                2, "Alex",
                3, "Bobby",
                4, "Susan",
                5, "John",
                6, "Ann",
                7, "Jimmy"
        );
        System.out.println(employeeMap);

        //point 2
        System.out.println("Enter ID: ");
        int id = SCANNER.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name is " + employeeMap.get(id));
        } else {
            System.out.println("No ID");
        }

        //point 3
        System.out.println("Enter a name: ");
        String name = SCANNER.next();
        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("The ID is: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("No name");
        }

    }
}