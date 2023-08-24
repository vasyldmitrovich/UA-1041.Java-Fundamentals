import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person(1, "Olga", 19));
        map.put(2, new Person(2, "Jahn", 23));
        map.put(3, new Person(3, "Mike", 31));
        map.put(4, new Person(4, "Sue", 25));
        System.out.println(map);

        List<Map.Entry<Integer, Person>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Person>>() {
            @Override
            public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
                return Integer.compare(
                        o1.getValue().getAge(),
                        o2.getValue().getAge());
            }
        });
        System.out.println(list);


    }
}