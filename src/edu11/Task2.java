package edu11;
import java.util.Scanner;
public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a sentence that contains words separated by more than one space:");
        String text = SCANNER.nextLine();
        String[] words = text.split("\\s+");
        for (var el : words) {
            System.out.print(el + " ");
        }
    }
}
