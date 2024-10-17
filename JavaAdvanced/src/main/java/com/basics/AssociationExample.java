package com.basics;

public class AssociationExample {

    public static void main(String[] args) {
        Driver driver = new Driver("Alice");
        Car car = new Car("Toyota");

        // Driver and Car have an association
        System.out.println(driver.name + " drives a " + car.model);
    }
}

    class Driver {
        String name;

        Driver(String name) {
            this.name = name;
        }
    }

    class Car {
        String model;

        Car(String model) {
            this.model = model;
        }
    }




