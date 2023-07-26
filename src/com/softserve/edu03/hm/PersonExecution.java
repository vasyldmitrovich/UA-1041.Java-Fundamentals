package com.softserve.edu03.hm;
import java.util.Scanner;
import com.softserve.edu03.hm.Person;
public class PersonExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        Person.input(person1);
        Person.output(person1);

        Person person2 = new Person();
        Person.input(person2);
        Person.output(person2);

        Person person3 = new Person();
        Person.input(person3);
        person3.changeName(sc.nextLine(), sc.nextLine());
        Person.output(person3);

        Person person4 = new Person();
        Person.input(person4);
        Person.output(person4);

        Person person5 = new Person();
        Person.input(person5);
        Person.output(person5);
    }
}
