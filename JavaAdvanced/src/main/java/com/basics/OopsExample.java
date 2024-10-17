package com.basics;

public class OopsExample {

 /*
 //Object and classes usage
    // Creating an object of the Car class

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Fortuner");
        myCar.drive(); // The Toyota Fortuner is driving
    }

}

    class Car {
        String make;
        String model;

        // Constructor
        Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        void drive() {
            System.out.println("The " + make + " " + model + " is driving.");
        }
*/


/* //Inheritance
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start();  // Output: Vehicle is starting.
        myBike.ride();   // Output: Bike is riding.
    }
}

    class Vehicle {
        void start() {
            System.out.println("Vehicle is starting.");
        }
    }

    class Bike extends Vehicle {  // Bike inherits from Vehicle
        void ride() {
            System.out.println("Bike is riding.");
        }
    }

*/

/*  //Encapsulation
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        System.out.println(account.getBalance());  // Output: 150
        // System.out.println(account.balance);  // Error: balance has private access
    }
}


    class BankAccount {
        private double balance;  // Private variable

        BankAccount(double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
        }

        double getBalance() {
            return balance;
        }
    }
*/

/*    // Polymorphism - Method Overloading
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));            // Output: 15
        System.out.println(math.add(5, 10, 15));        // Output: 30
        System.out.println(math.add(5.5, 10.5));        // Output: 16.0
    }
}

    class MathOperations {
        // Method to add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Overloaded method to add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Overloaded method to add two double values
        double add(double a, double b) {
            return a + b;
        }
    }
*/

/*
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the sound method on each object
        myDog.sound();  // Output: Woof
        myCat.sound();  // Output: Meow

        // Demonstrating polymorphism using an array of Animal references
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            animal.sound();  // Outputs: Woof and then Meow
        }
    }
}

    // Base class
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Subclass Dog
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof");
        }
    }

    // Subclass Cat
    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow");
        }
    }
*/

/*   //Abstraction
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());  // Output: 78.53981633974483
    }
}


    abstract class Shape {
        abstract double area();  // Abstract method
    }

    class Circle extends Shape {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }
*/

}

















