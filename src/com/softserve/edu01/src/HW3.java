import java.util.Scanner;

public class HW3 {
    public static void main(String[] args){
        System.out.println("Enter first cost per minute: ");
        Scanner scan = new Scanner(System.in);
        double c1 = scan.nextDouble();
        System.out.println("Enter second cost per minute: ");
        double c2 = scan.nextDouble();
        System.out.println("Enter third cost per minute: ");
        double c3 = scan.nextDouble();
        System.out.println("Enter duration first call : ");
        double t1 = scan.nextDouble();
        System.out.println("Enter duration second call : ");
        double t2 = scan.nextDouble();
        System.out.println("Enter duration third call : ");
        double t3 = scan.nextDouble();
        double tc1 = c1 * t1;
        System.out.println("First call cost: " + tc1);
        double tc2 = c2 * t2;
        System.out.println("Second cost: " + tc2);
        double tc3 = c3 * t3;
        System.out.println("Third call cost: " + tc3);
        double tc4 = tc1 + tc2 + tc3;
        System.out.println("Total cost: " + tc4);
    }
}