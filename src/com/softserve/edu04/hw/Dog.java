package com.softserve.edu04.hw;

import javax.management.MBeanAttributeInfo;
import java.util.Objects;
import java.util.Scanner;

public class Dog {
    static Scanner SCANNER = new Scanner(System.in);
    private String name;
    private String breed;
    private  int age;


    //Add spaces between fields and methods
    void input() {
        System.out.println("name: ");
        name = SCANNER.nextLine();
        System.out.println("age ");
        age = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("breed: ");
        breed = SCANNER.nextLine();
        Breed breedk = Breed.valueOf(breed);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }


    public static void main(String[] args) {
        Dog dog1 =new Dog();
        Dog dog2 =new Dog();
        Dog dog3 =new Dog();
        dog1.input();
        dog2.input();
        dog3.input();
        if(dog1.age>dog3.age && dog1.age>dog2.age){
            System.out.println(("The oldest dog is ")+dog1.name+(" ")+dog1.breed);
        }
        else if(dog2.age>dog3.age && dog2.age>dog1.age){
            System.out.println(("The oldest dog is ")+dog2.name+(" ")+dog2.breed);
        }
        else System.out.println(("The oldest dog is ")+dog3.name+(" ")+dog3.breed);
        System.out.println(("two dogs with the same name: ")+dog1.equals(dog2));
    }

}
