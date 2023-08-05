package com.softserve.edu04.hw.Task3;

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Select one of the errors: CONTINUE,OK,FOUND,FORBIDDEN");
        String  users_Error = scanner.nextLine();
        HTTPError country = HTTPError.valueOf(users_Error);
        int response=switch (country){
            case CONTINUE->{
                yield 100;
            }
            case OK-> {
                yield 200;
            }
            case FOUND-> {
                yield 302;
            }
            case FORBIDDEN-> {
                yield 403;
            }
        };
        System.out.println(response);


    }
}
