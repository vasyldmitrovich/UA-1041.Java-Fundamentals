import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);

        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersect);
    }
}