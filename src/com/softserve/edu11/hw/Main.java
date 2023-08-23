package com.softserve.edu11.hw;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public final static String US_REGEX = "\\$\\s?[+-]?[0-9]{1,3}(?:,?[0-9])*(\\.[0-9]{1,2})?\\n";
    public final static Pattern US_PATTERN = Pattern.compile(US_REGEX);
    public final static Scanner SCANNER = new Scanner(System.in);
    public final static Random RANDOM = new Random();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task");

            switch (numOfTask) {
                case 1 -> runFirstTask();
                case 2 -> runSecondTask();
                case 3 -> runThirdTask();
                case 4 -> runFourthTask();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print
                ("\nPlease choose one of the tasks :" +
                        "\n\t1 - First task" +
                        "\n\t2 - Second task" +
                        "\n\t3 - Third task" +
                        "\n\t4 - Fourth task" +
                        "\n\t0 - Exit\n");
    }

    public static void runFourthTask() {
        String[] randMsgs = {"Welcome, %s %s", "First name:%s%nLast name:%s", "%s %s how are you doing?"};
        String nameRegex = "(?<firstName>[a-zA-z\\s\\-]+)\\s+(?<lastName>[a-zA-z\\s\\-]+)";
        Pattern namePat = Pattern.compile(nameRegex);
        Matcher nameMat;
        do {
            SCANNER.nextLine();
            System.out.print("Enter a first and last name:");
            String name = SCANNER.nextLine();
            nameMat = namePat.matcher(name);
            if (nameMat.matches()) {
                System.out.printf((randMsgs[RANDOM.nextInt(0, randMsgs.length)]) + "%n", nameMat.group("firstName"), nameMat.group("lastName"));
            } else {
                System.out.println("Please enter correct name");
            }
        } while (!nameMat.matches());
    }

    public static void runThirdTask() {
        String currencies = """
                $ 123,123,123.12
                €123,123,123.12
                ₴250.50
                $ 123,146
                $1245531
                ₴130.29
                $ 0.12
                $100,134.12
                €1.12
                $11.5
                €10.50
                ₴150,б00.00
                """;

        Matcher usMat = US_PATTERN.matcher(currencies);
        System.out.println("All currencies:");
        for (String cur : currencies.split("\\n")) {
            System.out.println(cur);
        }
        System.out.println("US currencies:");
        while (usMat.find()) {
            System.out.print(usMat.group());
        }
    }

    public static void runFirstTask() {
        String sentence = inputSentence();
        System.out.println(sentence);
        List<String> words = Arrays.asList(sentence.split("[,\\s]+"));
        String longestWord = Collections.max(words, Comparator.comparingInt(String::length));
        String secondWord = words.get(1);
        System.out.format("Longest word:%s%n", longestWord);
        System.out.format("Num of letters in longest word:%d%n", longestWord.length());
        System.out.format("Second word:%s%nSecond word in reverse order:%s%n", secondWord, reverseString(secondWord));
    }

    public static void runSecondTask() {
        String sentence = inputSentence();
        System.out.println(sentence);
        List<String> words = Arrays.asList(sentence.split("[,\\s]+"));
        String newSentence = String.join(" ", words);
        System.out.println(newSentence);
    }

    public static String inputSentence() {
        SCANNER.nextLine();
        System.out.print("Input sentence:\n");
        return SCANNER.nextLine();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
