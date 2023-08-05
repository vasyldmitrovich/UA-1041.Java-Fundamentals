package com.softserve.edu04.pt.Task3;
//When you past your code there, write package like package com.softserve.edu04.pt;
import java.util.Scanner;

//Name of class should start from upper case
public class Task3 {
    //enum should not be there should be in file com.softserve.edu04.pt.Task3.Country.java
    //This method should be in class like App.java
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Select one of the countries:UK, USA, CHILE, BRAZIL, NORWAY, FRANCE, ITALY");
        String users_Country = scanner.nextLine();
        Country country =Country.valueOf(users_Country);
        String response=switch (country){
            case England, NORWAY->{
                yield "ПІВНІЧНА ЄВРОПА";
            }
            case USA-> {
                yield "ПІВНІЧНА АМЕРИКА";
            }
            case CHILE,BRAZIL-> {
                yield "ПІВДЕННА АМЕРИКА";
            }
            case FRANCE-> {
              yield "ЗАХІДНА ЄВРОПА";
            }
            case ITALY-> {
               yield "ПІВДЕННА ЄВРОПА";
            }

        };
        System.out.println(response);


    }
}
