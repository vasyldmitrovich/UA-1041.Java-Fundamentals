import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var rand = new Random();
        List<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(200) - 100);
        }
        System.out.println(myCollection);

        //point 1
        int max = myCollection.indexOf(Collections.max(myCollection));
        int min = myCollection.indexOf(Collections.min(myCollection));
        int temp = myCollection.get(max);
        myCollection.set(max, myCollection.get(min));
        myCollection.set(min, temp);
        System.out.println(myCollection);

        //point 2
        int negative = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negative = i;
                break;
            }
        }
        int num = rand.nextInt(900) + 100;
        if (negative != -1) {
            myCollection.add(negative, num);
        }
        System.out.println(myCollection);

        //point 3
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            newCollection.add(myCollection.get(i));
            if (i < myCollection.size() - 1) {
                int current = myCollection.get(i);
                int next = myCollection.get(i + 1);
                if ((current >= 0 && next < 0) || (current < 0 && next >= 0)) {
                    newCollection.add(0);
                }
            }
        }
        System.out.println(newCollection);

        //point 4
        int k = 6;
        List<Integer> list1 = new ArrayList<>(List.copyOf(myCollection.subList(0, k)));
        List<Integer> list2 = new ArrayList<>(List.copyOf(myCollection.subList(k, myCollection.size())));
        Collections.reverse(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        //point 5
        System.out.println(myCollection);
        int even = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                even = i;
                break;
            }
        }
        if (even != -1) {
            int removed = myCollection.remove(even);
        } else {
            System.out.println("No even elements found in the collection");
        }
        System.out.println(myCollection);

        //point 6
        if (min != myCollection.size() - 1) {
            myCollection.remove(min + 1);
            System.out.println(myCollection);
        } else {
            System.out.println("The minimum element is the last one. Nothing is removed.");
        }

    }
}