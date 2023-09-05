package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final LocalDate birthday = LocalDate.of(2004,12,21);
    public final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yy");
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
                case 1 -> runTask1();
                case 2 -> runTask2();
                case 3 -> runTask3();
                case 4 -> runTask4();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print
                ("\nPlease choose one of the tasks :" +
                        "\n\t1 - Task 1" +
                        "\n\t2 - Task 2" +
                        "\n\t3 - Task 3" +
                        "\n\t4 - Task 4" +
                        "\n\t0 - Exit\n");
    }
    public static boolean isValidDayFormat(String date){
        try{
            dtf.parse(date);
            return true;
        }catch (DateTimeParseException e){
            e.getMessage();
            return false;
        }
    }
    public static boolean isLeapYear(LocalDate date){
        return date.isLeapYear();
    }
    public static void runTask1(){
        CaesarCipher caesar = new CaesarCipher();
        String textToCrypt = "Hi, my name is Ivan and I'm learning Java";
        String cryptedText =caesar.encrypt(textToCrypt,5);
        String decryptedText =caesar.decrypt(cryptedText,5);

        System.out.format("Original text:%s%n",textToCrypt);
        System.out.format("Encrypted text:%s%n",cryptedText);
        System.out.format("Decrypted text:%s%n",decryptedText);

    }
    public static void runTask2(){
        System.out.println("Please enter a date in this format [mm.dd.yy]");
        String date = SCANNER.nextLine();
        if (isValidDayFormat(date)){
            String month = dtf.parse(date,LocalDate::from).getMonth().name();
            int year = dtf.parse(date,LocalDate::from).getYear();
            String day = dtf.parse(date,LocalDate::from).getDayOfWeek().name();
            System.out.format("This is:%s %s %s",day,month,year);
        }else{
            System.out.println("This isn't valid input");
        }
    }
    public static void runTask3(){
        LocalDate d1 = LocalDate.of(2004,1,5);
        LocalDate d2 = LocalDate.of(2005,12,21);

        System.out.format("%s : %s%n",dtf.format(d1),isLeapYear(d1)?"Leap":"Not Leap");
        System.out.format("%s : %s%n",dtf.format(d2),isLeapYear(d2)?"Leap":"Not Leap");

    }
    public static void runTask4(){
        System.out.format("This day was:%s%n",birthday.getDayOfWeek().name());
        System.out.format("After 6 months day was:%s%n",birthday.plusMonths(6).getDayOfWeek().name());
        System.out.format("After 12 months day was:%s%n",birthday.plusMonths(12).getDayOfWeek().name());
    }
}
