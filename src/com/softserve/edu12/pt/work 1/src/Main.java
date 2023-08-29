import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {

            try {
                System.out.println("Enter a: ");
                int a = Integer.parseInt(SCANNER.nextLine());
                System.out.println("Enter b: ");
                int b = Integer.parseInt(SCANNER.nextLine());

                int area = rectangleArea(a, b);
                System.out.println("Area of the rectangle is " + area);
                break;

            } catch (NumberFormatException e) {
                System.out.println("You should enter an integer");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides should be non negative");
        }
        return a*b;
    }
}