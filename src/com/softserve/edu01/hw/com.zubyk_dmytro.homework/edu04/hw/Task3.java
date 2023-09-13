package edu04.hw;
import java.util.Scanner;

public class Task3 {
    enum Errors{
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),
        FORBIDDEN(403),
        NOT_FOUND(404);

        private int value;
        Errors(int value){this.value = value;}

        public int getValue() {
            return value;
        }
    }
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Введіть код помилки:");
        int input = scanner.nextInt();
        Errors selectedError = null;
        for(Errors errors : Errors.values()){
            if(errors.getValue() == input){
                selectedError = errors;
                break;
            }
        }

        if(selectedError != null){
            switch (selectedError){
                case BAD_REQUEST -> System.out.println("Bad request");
                case UNAUTHORIZED -> System.out.println("Unauthorized");
                case PAYMENT_REQUIRED -> System.out.println("Payment required");
                case FORBIDDEN -> System.out.println("Forbidden");
                case NOT_FOUND -> System.out.println("Not found");
                default -> System.out.println("Error not found");
            }
        }

    }
}
