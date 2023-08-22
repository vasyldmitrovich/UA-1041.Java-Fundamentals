package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

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

    public static void runThirdTask() {
        String regx = "\\b[A-Za-z0-9_]{3,16}";
        for (int i = 0; i < 5; i++) {
            String str = inputString("Input :");
            System.out.println(str.matches(regx) ? "Valid" : "Invalid");
        }
    }

    public static void runSecondTask() {
        String fullNameRegx = "(?<firstName>\\w[a-zA-Z]+)\\s*(?<lastName>\\w[a-zA-Z]+)\\s+(?<middleName>\\w[a-zA-Z]+)";
        Pattern namePat = Pattern.compile(fullNameRegx);
        String name = inputString("Please enter first last and middle name:");
        Matcher nameMat = namePat.matcher(name);
        if (nameMat.matches()) {
            String firstName = nameMat.group("firstName");
            String lastName = nameMat.group("lastName");
            String middleName = nameMat.group("middleName");

            System.out.printf("Last name : %s\tInitials : %c.%c%n", lastName, firstName.charAt(0), lastName.charAt(0));
            System.out.printf("First name : %s%n", firstName);
            System.out.printf("%s %s %s", firstName, lastName, middleName);

        }
    }

    public static void runFirstTask() {
        String str1 = inputString("Input origin string:");
        String str2 = inputString("Input string you are looking for:");
        String msg = str1.contains(str2) ? "Yes str1 contains str2" : "No str1 doesn't contain str2";
        System.out.println(msg);
    }

    public static String inputString(String msg) {
        System.out.println(msg);
        return SCANNER.nextLine();
    }

    public static void isValid() {

    }
}
