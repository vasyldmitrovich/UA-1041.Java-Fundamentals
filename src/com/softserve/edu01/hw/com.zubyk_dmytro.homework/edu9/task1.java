package edu9;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and fill the collection
        ArrayList<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        // Swap max and min elements
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

        // Insert random three-digit number before first negative element
        int randNumber = new Random().nextInt(900) + 100;
        int firstNegativeIndex = myCollection.indexOf(myCollection.stream().filter(n -> n < 0).findFirst().orElse(null));
        if (firstNegativeIndex != -1) {
            myCollection.add(firstNegativeIndex, randNumber);
        }

        // Insert zero between neighboring elements with different signs
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i - 1) * myCollection.get(i) < 0) {
                myCollection.add(i, 0);
                i++; // Skip the newly inserted zero
            }
        }

        // Copy elements to list1 and list2
        int k=5;
        ArrayList<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        ArrayList<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        // Remove last even element
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
        } else {
            System.out.println("No even elements found.");
        }

        // Remove element following first minimum
        int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
        if (firstMinIndex < myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        }

        // Display myCollection, list1, list2
        System.out.println("myCollection: " + myCollection);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        scanner.close();
    }
}
