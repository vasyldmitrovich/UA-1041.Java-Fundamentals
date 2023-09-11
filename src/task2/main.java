package task2;


import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        putPersonToMap(personMap);
        printMap(personMap);

        System.out.println("___________________________");
        System.out.println("Are there two persons with the same first name?");
        findDuplicateFirstName(personMap);

        System.out.println("___________________________");
        System.out.println("Remove the person from the map whose first name is 'Olha':");
        removeByFirstName("Olha", personMap);
        printMap(personMap);

    }

    private static void removeByFirstName(String firstName, Map<String, String> personMap) {
        var iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            var el = iterator.next().getValue();
            if (el.equals(firstName)) {
                iterator.remove();
            }
        }

    }

    private static void printMap(Map<String, String> personMap) {
        for (var el : personMap.keySet()
        ) {
            System.out.println("[" + el + " " + personMap.get(el) + "]");
        }
    }


    private static void findDuplicateFirstName(Map<String, String> personMap) {
        Set<String> uniqueValues = new HashSet<>();
        boolean haveDuplicate = true;

        for (var stringStringEntry : personMap.entrySet()) {
            var el = stringStringEntry.getValue();
            if (!uniqueValues.add(el)) {
                haveDuplicate = false;
                System.out.println("PersonMap contains few persons with name:" + el);
            }
        }

        if (haveDuplicate) {
            System.out.println("PersonMap don`t has duplicate!");
        }

    }

    private static void putPersonToMap(Map<String, String> personMap) {
        personMap.put("Petrenko", "Petro");
        personMap.put("Semenyuk", "Semen");
        personMap.put("Rodina", "Darya");
        personMap.put("Lisova", "Olesya");
        personMap.put("Bilyk", "Nazar");
        personMap.put("Dmytruk", "Dmytro");
        personMap.put("Oleksienko", "Oleksii");
        personMap.put("Kyrylov", "Kyrylo");
        personMap.put("Derbak", "Olha");
        personMap.put("Ivanov", "Ivan");
    }
}