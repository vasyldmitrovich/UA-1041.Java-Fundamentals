package lesson_3_Homework;

import java.util.Scanner;

public class Person {
    static Scanner SCANNER=new Scanner(System.in);
    static private int totalPeople;
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
        this("N/A","N/A");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        totalPeople++;
    }
    private void getAge(){
        System.out.println("you are: "+(2023-birthYear));

    }

    /**
     * this method request information about people and takes information from console
     */
    void input(){
        System.out.println("Your first name: ");
        firstName=SCANNER.nextLine();
        System.out.println("Your last name: ");
        lastName=SCANNER.nextLine();
        System.out.print("Your year of birth: ");
        birthYear=SCANNER.nextInt();
        SCANNER.nextLine();
    }

    /**
     * this method display information about people
     */
    void output(){
        System.out.println("Your first name: "+(firstName));

        System.out.println("Your last name: "+(lastName));

        System.out.println("Your year of birth: "+(birthYear));

    }
    public void changeName(String fn, String ln){
        String the_Third_Cup;
        the_Third_Cup=fn;
        fn=ln;
        ln=the_Third_Cup;
    }

    public static void main(String[] args) {


        Person people1=new Person();
        Person people2=new Person();
        Person people3=new Person();
        Person people4=new Person();
        Person people5=new Person();
        people1.input();
        people2.input();
        people3.input();
        people4.input();
        people5.input();
        people1.getAge();
        people1.output();
        people2.output();
        people3.output();
        people4.output();
        people5.output();
    }
}
