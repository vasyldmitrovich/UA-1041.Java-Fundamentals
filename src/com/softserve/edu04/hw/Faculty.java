package hw;

import java.util.Scanner;

public class Faculty {
    public enum Season {
        WINTER, SPRING, SUMMER,AUTUMN
    }
    static Scanner SCANNER = new Scanner(System.in);
    private String name;
    private int age;
    private String Faculty;
    private String SeasonPS;
    private static String University;

    void input() {
        System.out.println("Your name: ");
        name = SCANNER.nextLine();
        System.out.println("Your age: ");
        age = SCANNER.nextInt();
        System.out.println("Your faculty ");
        Faculty = SCANNER.nextLine();
        SCANNER.nextLine();
        System.out.println("Your University: ");
        University = SCANNER.nextLine();
        System.out.println("Your Season: ");
        SeasonPS = SCANNER.nextLine();
        Season sezon = Season.valueOf(SeasonPS);
        String response = switch (sezon) {
            case WINTER, SPRING -> {
                yield "1 semester";
            }
            case SUMMER, AUTUMN -> {
                yield "2 semester";
            }
        };
        System.out.println(response);
    }

    public static void main(String[] args) {
        Faculty student1=new Faculty();
        Faculty student2=new Faculty();
        student1.input();
        student2.input();

    }


}
