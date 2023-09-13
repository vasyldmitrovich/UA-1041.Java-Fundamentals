package edu10.hw;
import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        // Create and populate the personMap
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Alice");
        personMap.put("Williams", "David");
        personMap.put("Brown", "Orest");
        personMap.put("Jones", "Emma");
        personMap.put("Miller", "Oscar");
        personMap.put("Davis", "Orest"); // Duplicate first name "Orest"
        personMap.put("Garcia", "Sophia");
        personMap.put("Rodriguez", "Liam");
        personMap.put("Martinez", "Olivia");

        // Display the contents of the original map
        System.out.println("Original Person Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = hasDuplicateFirstName(personMap);

        if (hasDuplicateFirstName) {
            // Remove the person with the specified first name (e.g., "Orest")
            String firstNameToRemove = "Orest";
            removePersonByFirstName(personMap, firstNameToRemove);

            // Display the resulting map after removal
            System.out.println("\nPerson Map after Removing '" + firstNameToRemove + "':");
            for (Map.Entry<String, String> entry : personMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } else {
            System.out.println("\nThere are no persons with the same first name.");
        }
    }

    // Method to check if there are at least two persons with the same first name
    private static boolean hasDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);

            if (firstNameCount.get(firstName) >= 2) {
                return true;
            }
        }

        return false;
    }

    // Method to remove a person from the map by their first name
    private static void removePersonByFirstName(Map<String, String> personMap, String firstNameToRemove) {
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(firstNameToRemove));
    }
}
