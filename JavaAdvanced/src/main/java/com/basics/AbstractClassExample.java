package com.basics;


public class AbstractClass {

    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create an instance of Dog
        myDog.sound();         // Call the sound method
        myDog.eat();           // Call the eat method
    }
}

    abstract class Animal {
        abstract void sound();  // Abstract method

        void eat() {            // Concrete method
            System.out.println("This animal eats food.");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof");
        }
    }



