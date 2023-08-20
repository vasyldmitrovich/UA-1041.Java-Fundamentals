package com.softserve.edu09.homeworktask1;

import java.util.*;


public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        var random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(21) - 10);
        }
        System.out.println(myCollection);

//        Swap the maximum and minimum elements in the list

        Collections.sort(myCollection);
        Collections.swap(myCollection, 0, myCollection.size() - 1);
        System.out.println(myCollection);

//        Insert a random three-digit number before the first negative element of the list

        int threeDigitNumber = 100 + random.nextInt(900);

        int negativeIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }

        if(negativeIndex != -1) {
            myCollection.add(negativeIndex, threeDigitNumber);
        }
        System.out.println(myCollection);

//        Insert a zero between all neighboring elements collection myCollection with different signs

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int number = myCollection.get(i);
            int nextNumber = myCollection.get(i + 1);

            if ((number < 0 && nextNumber > 0) || (number > 0 && nextNumber < 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println(myCollection);

//        Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order

        System.out.println("Please input the the value of elements which you would like to copy from array");

        int k = SCANNER.nextInt();
        SCANNER.nextLine();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list1.add(i, myCollection.get(i));
        }
        System.out.println(list1);

        for (int i = k; i <= myCollection.size() - 1; i++) {
            int j = 0;
                list2.add(j, myCollection.get(i));
                j++;
        }
        System.out.println(list2);

//       In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.

        if (myCollection.get(myCollection.size() - 1) % 2 == 0) {
            myCollection.remove(myCollection.get(myCollection.size() - 1));
            System.out.println("The list with removed the last even element");
            System.out.println(myCollection);
        } else {
            System.out.println("The last element in the list is odd");
        }


//       Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed

        int min = Integer.MAX_VALUE;
        int indexToRemove = -1;

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int element = myCollection.get(i);

            if (element < min) {
                min = element;
                indexToRemove = i + 1;
            }
        }

        if (indexToRemove != -1 && indexToRemove <= myCollection.size() - 1) {
            myCollection.remove(indexToRemove);
        }

        System.out.println(myCollection);
    }
}
