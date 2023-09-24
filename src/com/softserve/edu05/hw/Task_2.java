package com.softserve.edu05.hw;

import static com.softserve.edu05.hw.App.SCANNER;

public class Task_2 {

    private static int count = 0;
    private static int sum = 0;
    private static String result;

    public static void getNumbers() {
        do {
            System.out.print("Input the number: ");
            int number = SCANNER.nextInt();
            SCANNER.nextLine();
            sum += number;
            count++;
        } while (count < 2);
        do {
            System.out.println("Do you want to perform the operation again?\n" +
                    "Please input 'yes' or 'no'.");
            String answer = SCANNER.nextLine();
            count++;
            var result = switch (answer) {
                case "yes" -> "continue";
                case "no" -> "end";
                default -> "Please input 'yes' or 'no'.";
            };

            if (result.equals("continue")) {
                System.out.print("Input additional number: ");
                int additionalNumber = SCANNER.nextInt();
                SCANNER.nextLine();
                sum += additionalNumber;
            } else if (result.equals("end")) {
                count = 0;
                System.out.println("The sum of your numbers is " + sum + ".");
            } else {
                count = 0;
                System.out.println(result);
                System.out.println("The sum of your numbers is " + sum + ".");
            }
        } while (count > 0);
    }
}
