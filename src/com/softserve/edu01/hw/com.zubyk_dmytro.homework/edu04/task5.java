package edu04;

enum Breed{//Should be in file Breed.java
    French_Bulldog("French Bulldog"),
    Labrador_Retriever("Labrador Retriever"),
    German_Shepherd("German Shepherd"),
    Poodle("Poodle");

    private String name;

    Breed(String name){ this.name = name;}
}
class Dog{//Should be in file Dob.java
    String nameOfDog;//Fields should have access modifier private
    Breed breed;
    int age;

    //Add constructor without parameters

    public Dog(String name, Breed breed, int age) {
        this.nameOfDog = name; // Corrected variable name here
        this.breed = breed;
        this.age = age;
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    //Add setters equals hashcode and toString
}
public class task5 {//Rename to Task5 and move in file Task5.java
    public static void main(String[] args){
        Dog dog1 = new Dog("Chudo", Breed.Poodle, 1);
        Dog dog2 =  new Dog("Tokio", Breed.German_Shepherd, 3);
        Dog dog3 = new Dog("Wolt", Breed.French_Bulldog, 2);

        if(dog1.nameOfDog.equals(dog2.nameOfDog) || dog1.nameOfDog.equals(dog2.nameOfDog) || dog2.nameOfDog.equals(dog3.nameOfDog)){
            System.out.println("Some dogs have identical names");
        } else{
            System.out.println("No dogs have identical names");
        }

        // Find the oldest dog
        Dog oldestDog;
        if (dog1.age > dog2.age) {
            if (dog3.age > dog1.age) {
                oldestDog = dog3;
            } else {
                oldestDog = dog1;
            }
        } else {
            if (dog2.age > dog3.age) {
                oldestDog = dog2;
            } else {
                oldestDog = dog3;
            }
        }

        // Output the name of the oldest dog
        System.out.println("The oldest dog is: " + oldestDog.getNameOfDog());
        }
    }

