package hw;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        System.out.println("First number: ");
        int number1=scanner.nextInt();
        System.out.println("Second number: ");
        var number2=scanner.nextInt();
        System.out.println("Third number: ");
        var number3=scanner.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("The maximum is "+(number1));
        }
        else if(number2>number1 && number2>number3){
            System.out.println("The maximum is "+(number2));
        }
        else System.out.println("The maximum is "+(number3));

        if(number1<number2 && number1<number3){
            System.out.println("The minimum is "+(number1));
        }
        else if(number2<number1 && number2<number3){
            System.out.println("The minimum is "+(number2));
        }
        else System.out.println("The minimum is "+(number3));
    }
}
