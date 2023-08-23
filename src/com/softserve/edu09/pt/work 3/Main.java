import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var rand = new Random();
        List<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(30));
        }
        System.out.println(myCollection);

        //point 1
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        //point 2
        var iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            var elem = iterator.next();
            if (elem > 20) {
                iterator.remove();
            }
        }
        System.out.println(myCollection);

        //point 3
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            int element = myCollection.get(i);
            System.out.println("position - " + i + ", value of element - " + element);
        }

        //point 4
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}