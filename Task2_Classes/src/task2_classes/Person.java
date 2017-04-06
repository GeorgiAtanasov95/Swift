/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2_classes;

/**
 *
 * @author Georgi
 */
public class Person {
     String name;
    int age;

    Person() {
        name = "No name";
        age = -1;
        System.out.println("Hello, i am John Doe");
    }

    Person(String name) {
       this.name = name;
        age = -1;
        System.out.printf("Hello i am %s.", name);
        System.out.println();
    }

    Person(String name, int age) {
        this.name = name;
        if (age < 0 || age > 150) {
            System.out.println("ERROR");
        } else {
            this.age = age;
            System.out.printf("Hello i am %s. I am %d years old.", name, age);

        }

    }
}
