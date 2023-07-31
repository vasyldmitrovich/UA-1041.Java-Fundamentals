import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Number of day: ");
        int numDay = scanner.nextInt();
        switch (numDay){
            case 1-> System.out.println("Monday (Понеділок)");
            case 2-> System.out.println("Tuesday (Вівторок)");
            case 3-> System.out.println("Wednesday (Середа)");
            case 4-> System.out.println("Thursday (Четвер)");
            case 5-> System.out.println("Friday (Пятниц'я)");
            case 6-> System.out.println("Saturday (Субота)");
            case 7-> System.out.println("Sunday (Неділя)");
            default -> {
                System.out.println("ERROR it is more then 7 or less then 1");
                System.out.println("Pleas enter a number that belong to the range [1, 7] ");
            }
        }
    }
}
