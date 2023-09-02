import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("apple", "cherry", "peach", "banana", "watermelon"));

        sort(stringList);
        System.out.println(stringList);
    }
    public static void sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
    }
}