package src.com.softserve.edu01.hw;

import java.util.Scanner;

public class CostOfCall {
    public static void main(String[] args) {
        System.out.println("You did three calls to different countries" +
                        "\nLet's try to calculate each cost of this call :)");
        System.out.println("Write down cost per minute for each call: ");

        Scanner scanner = new Scanner(System.in);
        double[] costPerMinute = new double[3];
        for (int i = 0; i < costPerMinute.length; i++) {
            costPerMinute[i] = scanner.nextDouble();
        }

        System.out.println("Write down the duration of your calls: ");

        double[] duration = new double[3];
        for (int i = 0; i < duration.length; i++) {
            duration[i] = scanner.nextDouble();
        }

        scanner.nextLine();

        double[] result = new double[3];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = costPerMinute[i] * duration[i];
            count++;
            System.out.format("\nTotal cost of you call number " + count + " is %.2f", + result[i]);
        }

    }
}
