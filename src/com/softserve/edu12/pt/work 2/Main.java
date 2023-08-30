import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Let's create a plant!");
                System.out.println("Enter the size: ");
                int size = Integer.parseInt(SCANNER.nextLine());

                System.out.println("Enter color: ");
                String color = SCANNER.nextLine();

                System.out.println("Enter type: ");
                String type = SCANNER.nextLine();

                Plant plant = new Plant(size, color, type);
                System.out.println("Here is the plant: " + plant);
                break;
            } catch (ColorException | TypeException e) {
                System.out.println("Your input is incorrect: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}

enum Color {
    RED, GREEN, BROWN;
}

enum Type {
    TREE, BUSH, GRASS;
}