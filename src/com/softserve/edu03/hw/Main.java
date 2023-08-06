package com.softserve.edu03.hw;

//<<<<<<< HEAD
import com.softserve.edu03.hw.Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person.createPerson(person1);
        Person person2 = new Person();
        Person.createPerson(person2);
        Person person3 = new Person();
        Person.createPerson(person3);
        Person person4 = new Person();
        Person.createPerson(person4);
        Person person5 = new Person();
        Person.createPerson(person5);
        System.out.println("The first person is: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("The second person is: " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("The thread person is: " + person3.getFirstName() + " " + person3.getLastName());
        System.out.println("The fourth person is: " + person4.getFirstName() + " " + person4.getLastName());
        System.out.println("The fifth person is: " + person5.getFirstName() + " " + person5.getLastName());
    }
}
/*=======
package com.softserve.edu03.hw;public class Main {
}//What this class do? why you write this class and all is in one line
>>>>>>> fde61ccfa9675d5329e6091f81d18a50de400b64*/
