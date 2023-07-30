package src.com.softserve.edu04.practicaltask;

import java.util.Scanner;


public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfTask;

        do {
            printMenu();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            SCANNER.nextLine();
            System.out.println("Performing task number " + numOfTask);

            switch (numOfTask) {
                case 1 -> performFirstTask();
                case 2 -> performSecondTask();
                case 3 -> performThirdTask();
                case 4 -> performFourthTask();
                case 5 -> performFivesTask();
                case 0 -> System.out.println("Exiting............");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
            printLine();

        } while (numOfTask != 0);

    }

    private static void performFirstTask() {
        //First practical task "Find out of the resul how many of numbers are odd"

        OddOrEven obj = new OddOrEven();
        OddOrEven.promptOddOrEven(obj);
        obj.isOdd(obj);
        obj.promptNumOfOdd(obj);
        printLine();
        System.out.print("\nTask 1 completed!" +
                "Press ENTER to go back to the menu");
        SCANNER.nextLine();
    }

    private static void performSecondTask() {
        //Second practical task "Print name of the day by his number"

        DayOfTheWeek day = new DayOfTheWeek();
        DayOfTheWeek.promptDayName(day);
        day.nameOfTheDay(day);
        printLine();
        System.out.print("\nTask 2 completed!" +
                "Press ENTER to go back to the menu");
        SCANNER.nextLine();
    }

    private static void performThirdTask() {
        //Third practical task "Output the name of the continent by name of country"
        NameOfContinent name = new NameOfContinent();
        NameOfContinent.promptContName(name);
        printLine();
        System.out.print("\nTask 3 completed!" +
                "Press ENTER to go back to the menu");
        SCANNER.nextLine();
    }

    private static void performFourthTask() {

    }

    private static void performFivesTask() {
    }

    public static void printLine() {
        System.out.println(" ");
        int count = 40;
        for (int i = 0; i < count; i++) {
            System.out.print("-_-_");
        }
    }

    private static void printMenu() {
        System.out.print("\nChose the task which you want to see :)" +
                "\n\t1 - First practical task" +
                "\n\t2 - Second practical task" +
                "\n\t3 - Third practical task" +
                "\n\t4 - Fourth practical task" +
                "\n\t5 - Fives practical task" +
                "\n\t0 - Exit");
    }
}
