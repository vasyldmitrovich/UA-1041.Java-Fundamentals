import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Davis", "Michael");
        personMap.put("Wilson", "Sarah");
        personMap.put("Anderson", "James");
        personMap.put("Taylor", "Jennifer");
        personMap.put("Brown", "John");
        personMap.put("Thomas", "Jessica");
        personMap.put("Clark", "David");
        personMap.put("Miller", "Laura");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        boolean duplicate = duplicate(personMap, "John");
        if (duplicate) {
            System.out.println("\nThere are at least two persons with the same first name\n");
        } else {
            System.out.println("\nThere are no persons with the same first name\n");
        }

        String remove = "John";
        personMap.values().removeIf(firstName -> firstName.equals(remove));
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    private static boolean duplicate(Map<String, String> personMap, String firstName) {
        int count = 0;
        for (String value : personMap.values()) {
            if (value.equals(firstName)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
