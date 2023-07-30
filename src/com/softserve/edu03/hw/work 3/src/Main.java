import java.util.Scanner;

class Person {
    static final Scanner SCANNER = new Scanner(System.in);
    private String firstName, lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int getAge(int birthYear) {
        return 2023 - birthYear;
    }

    public void input() {
        System.out.println("Enter your first name: ");
        this.firstName = SCANNER.nextLine();
        System.out.println("Enter your last name: ");
        this.lastName = SCANNER.nextLine();
        System.out.println("Enter your the birthday year: ");
        this.birthYear = SCANNER.nextInt();
    }

    public void output() {
        System.out.println("Hello, " + firstName + " " + lastName);
        System.out.println("You are " + getAge(birthYear) + " years old");
    }

    public void changeName() {
        String temp;
        System.out.println("Do you want to change name? (print yes or no)");
        SCANNER.nextLine(); // Consume the leftover newline character
        temp = SCANNER.nextLine();
        if (temp.equals("yes")) {
            System.out.println("Enter new first name: ");
            this.firstName = SCANNER.nextLine();
            System.out.println("Enter new last name: ");
            this.lastName = SCANNER.nextLine();
            output();
        } else if (temp.equals("no")) {
            System.out.println("Okay, your name has not changed");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        person1.output();
        person1.changeName();

        Person person2 = new Person();
        person2.input();
        person2.output();
        person2.changeName();

        Person person3 = new Person();
        person3.input();
        person3.output();
        person3.changeName();

        Person person4 = new Person();
        person4.input();
        person4.output();
        person4.changeName();

        Person person5 = new Person();
        person5.input();
        person5.output();
        person5.changeName();
    }
}