package com.basics;

public class InterfaceExample {



    public static void main(String[] args) {
        Cat myCat = new Cat(); // Create an instance of Cat
        myCat.sound();         // Call the sound method
        myCat.eat();           // Call the eat method
    }
}

    interface Animal1 {
        void sound();  // Abstract method

        default void eat() {  // Default method
            System.out.println("This animal eats food.");
        }
    }

    class Cat implements Animal1 {
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }




