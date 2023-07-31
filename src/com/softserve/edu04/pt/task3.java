import java.util.Scanner;

public class task3 {
    public enum Country {
        England, USA, CHILE, BRAZIL, NORWAY, FRANCE, ITALY
    }


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
