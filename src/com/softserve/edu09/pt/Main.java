package com.softserve.edu09.pt;

import java.util.*;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    static final Random RANDOM = new Random(1);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task\n");

            switch (numOfTask) {
                case 1 -> runFirstTask();
                case 2 -> runSecondTask();
                case 3 -> runThirdTask();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print("\nPlease choose one of the tasks :" + "\n\t1 - First task" + "\n\t2 - Second task" + "\n\t3 - Third task" + "\n\t0 - Exit\n");
    }

    public static void runSecondTask() {
        Set<Integer> setOfInts = new HashSet<Integer>();
        System.out.print("Please enter some numbers:");
        String line = SCANNER.next();
        String[] elements = line.split(",\\s*");
        for (String element : elements) {
            setOfInts.add(Integer.parseInt(element));
        }

        System.out.println(setOfInts);
    }

    public static void runFirstTask() {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox("A", 1));
        heavyBoxes.add(new HeavyBox("B", 2));
        heavyBoxes.add(new HeavyBox("C", 3));
        heavyBoxes.add(new HeavyBox("D", 4));
        heavyBoxes.add(new HeavyBox("E", 5));

        System.out.println("Current list:");
        printHeavyBoxList(heavyBoxes);

        var el = heavyBoxes.get(0);
        el.setWeight(el.getWeight() + 1);
        System.out.println("After changing first weight of box by 1:");
        printHeavyBoxList(heavyBoxes);

        heavyBoxes.remove(heavyBoxes.size() - 1);
        System.out.println("After removing last element:");
        printHeavyBoxList(heavyBoxes);
    }

    public static void runThirdTask() {
        List<Integer> myCollection = new ArrayList<>(10);
        List<Integer> newCollection = new ArrayList<>(10);


        fillCollectionWithRandNums(myCollection, 10);

        System.out.println("Original collection:");
        System.out.println(myCollection);

        getIndexesOfElementsGreaterThanFive(myCollection, newCollection);

        System.out.println("List of indexes of elements which greater than 5:");
        System.out.println(newCollection);

        //Make copy of collection cause without elements that greater 20
        //Original collection was out of bound most of the time
        //for index 8 in next task
        List<Integer> copy = new ArrayList<>(myCollection);
        System.out.println("Collection of elements which less that 20:");
        copy.removeIf(el -> el > 20);
        System.out.println(copy);

        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);
        System.out.println("Changed list:");
        printIntList(myCollection);

        System.out.println("Sorted collection:");
        Collections.sort(myCollection);
        printIntList(myCollection);
    }

    public static void printHeavyBoxList(List<HeavyBox> heavyBoxList) {

        System.out.println("=".repeat(20));
        for (var el : heavyBoxList) {
            System.out.println(el);
        }
        System.out.println("=".repeat(20));
    }

    public static void fillCollectionWithRandNums(List<Integer> intList, int length) {
        for (int i = 0; i < length; i++) {
            intList.add(RANDOM.nextInt(0, 30));
        }
    }

    public static void getIndexesOfElementsGreaterThanFive(List<Integer> myCollection, List<Integer> newCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
    }

    public static void printIntList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.format("position:%d\telement:%d\n", i, list.get(i));
        }
    }
}
