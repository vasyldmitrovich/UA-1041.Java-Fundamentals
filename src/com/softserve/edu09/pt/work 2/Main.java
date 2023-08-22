import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a set of numbers as a single string \"1, 2, 3, 4, 4, 5, 6, 6, 7, 8\" ");
        String line = SCANNER.nextLine();

        String [] elements = line.split(",\\s*");
        List<Integer> list = new ArrayList<>();

        int [] intElements = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            int elem = Integer.parseInt(elements[i]);
            if (!list.contains(elem)) {
                list.add(elem);
            }
        }
            System.out.println(list);
    }
}