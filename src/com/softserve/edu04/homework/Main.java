package src.com.softserve.edu04.homework;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int taskNum;

        do {
            printMenu();
            System.out.print("\nPlease input the number of the task: ");
            taskNum = SCANNER.nextInt();
            SCANNER.nextLine();
            System.out.println("Performing task number " + taskNum);

            switch (taskNum) {
                case 1 -> performFirstTask();
                case 2 -> performSecondTask();
                case 3 -> performThirdTask();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid number of the task");
            }
            printLine();
        } while (taskNum != 0);

    }

    private static void performFirstTask() {
        //
        BelongTheRange obj = new BelongTheRange();
        obj.promptBelongTheRange(obj);
        obj.isBelongTheRange(obj);
        printLine();
        System.out.print("\nTask 1 completed! ");
        SCANNER.nextLine();
    }

    private static void performSecondTask() {
        MaxAndMin maxAndMin = new MaxAndMin();
        maxAndMin.promptMaxAndMin(maxAndMin);
        maxAndMin.resultMaxAndMin(maxAndMin);
        printLine();
        System.out.print("\nTask 2 completed! ");
        SCANNER.nextLine();
    }

    private static void performThirdTask() {
        HTTPError errorNum = new HTTPError();
        errorNum.promptNumberOfIssue(errorNum);
        errorNum.printTheNameOfIssue(errorNum);
        printLine();
        System.out.print("\nTask 3 completed! ");
        SCANNER.nextLine();
    }

    public static void printLine() {
        System.out.println(" ");
        int count = 40;
        for (int i = 0; i < count; i++) {
            System.out.print("-_");
        }
    }

    private static void printMenu() {
        System.out.print("\nChose the task which you want to use :)" +
                "\n\t1 - First homework task" +
                "\n\t2 - Second homework task" +
                "\n\t3 - Third homework task" +
                "\n\t0 - Exit");
    }
}
