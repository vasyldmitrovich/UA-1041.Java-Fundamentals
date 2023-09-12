package com.softserve.edu09.Homework.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        var rnd = new Random(1);
        List<Integer> myCollaction = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollaction.add(rnd.nextInt(-10, 10));
        }
        System.out.println(myCollaction);


        // Find the maximum and minimum elements
        int maxIndex = Collections.max(myCollaction);
        System.out.println("Max number is:" + maxIndex);
        int minIndex = Collections.min(myCollaction);
        System.out.println("Min number is:" + minIndex);

        // Swap the maximum and minimum elements
        Collections.swap(myCollaction, myCollaction.indexOf(maxIndex), myCollaction.indexOf(minIndex));
        System.out.println("List after swapping: ");
        for (Integer num : myCollaction) {
            System.out.print(num + " ");
        }


        System.out.println("=================");

        int firstNegativeIndex = -1;
        for (int i = 0; i < myCollaction.size(); i++) {
            if (myCollaction.get(i) < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1) {
            Random random = new Random(1);
            int random_three_digit_number = random.nextInt(100) + 100;
            myCollaction.add(firstNegativeIndex, random_three_digit_number);
        }
        System.out.println(myCollaction);

        System.out.println("=================");

        List<Integer> modifiedCollection = new ArrayList<>();

        // Вставити нуль між елементами з різними знаками
        for (int i = 0; i < myCollaction.size(); i++) {
            modifiedCollection.add(myCollaction.get(i));
            if (i < myCollaction.size() - 1) {
                int currentElement = myCollaction.get(i);
                int nextElement = myCollaction.get(i + 1);
                if ((currentElement < 0 && nextElement > 0) || (currentElement > 0 && nextElement < 0)) {
                    modifiedCollection.add(0);
                }
                System.out.println(modifiedCollection);
            }

        }

        System.out.println("=================");

        int k = 5;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.addAll(myCollaction.subList(0,k));
        list2.addAll(myCollaction.subList(k,myCollaction.size()));
        Collections.reverse((list2));
        System.out.println("List1 in direct order: " + list1);
        System.out.println("List1 in reverse order: " + list2);

        System.out.println("=================");

        List<Integer> modifiedCollection2 = new ArrayList<>();

        // Знайдемо і видалимо останній парний елемент (якщо є)
        int lastIndex = -1;
        for (int i = myCollaction.size() - 1; i >= 0; i--) {
            if (myCollaction.get(i) % 2 == 0) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex != -1) {
            myCollaction.remove(lastIndex);
            System.out.println("Останній парний елемент був видалений = "+ lastIndex);
        } else {
            System.out.println("Парних елементів не знайдено.");
        }

        // Виведіть оновлений список myCollection
        System.out.println("Оновлений список myCollection: " + modifiedCollection2);

        System.out.println("=================");



        //int minIndex = -1; // Індекс першого мінімального елемента

        // Знайдемо індекс першого мінімального елемента
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < myCollaction.size(); i++) {
            int currentValue = myCollaction.get(i);
            if (currentValue < minValue) {
                minValue = currentValue;
                minIndex = i;
            }
        }

        // Перевіримо, чи мінімальний елемент не є останнім
        if (minIndex < myCollaction.size() - 1) {
            myCollaction.remove(minIndex + 1);
            System.out.println("Елемент, наступний за першим мінімальним, був видалений.");
        } else {
            System.out.println("Перший мінімальний елемент - останній у списку, нічого не видаляємо.");
        }


        System.out.println("Оновлений список myCollection: " + myCollaction);
    }
}




























