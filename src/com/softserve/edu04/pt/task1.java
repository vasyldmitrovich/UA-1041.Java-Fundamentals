import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        int s=0;
        System.out.println("First number: ");
        int number1=scanner.nextInt();
        System.out.println("Second number: ");
        var number2=scanner.nextInt();
        System.out.println("Third number: ");
        var number3=scanner.nextInt();
        if(number1 % 2 == 0){
            System.out.println("First number is even");
        }
        else {
            System.out.println("First number is odd");
            s++;
        }
        if(number2 % 2 == 0){
            System.out.println("Second number is even");
        }
        else {
            System.out.println("Second number is odd");
            s++;
        }
        if(number3 % 2 == 0){
            System.out.println("Third number is even");
        }
        else {
            System.out.println("Third number is odd");
            s++;
        }
        System.out.println("Number of odd: "+(s));

    }
}