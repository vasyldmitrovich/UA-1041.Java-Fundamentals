import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //point 1
        String [] strings = {"Jack", "Mary", "Emily", "Harry"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        //point 2
        double[] numbers = {2.4, 5.7, 9.0, 1.3, 76.81};
        double sum = 0;
        for (var d : numbers) {
            sum += d;
        }
        double average = sum / numbers.length;
        System.out.println("Average = " + average);

        //point 3
        System.out.println("Enter the name to search: ");
        Scanner scanner = new Scanner(System.in);
        var nameToSearch = scanner.nextLine();
        var index = Arrays.binarySearch(strings, nameToSearch);
        if (index < 0) {
            System.out.println("Not found");
        } else {
            System.out.println(nameToSearch + " is found in position " + index);
            }

        }
    }