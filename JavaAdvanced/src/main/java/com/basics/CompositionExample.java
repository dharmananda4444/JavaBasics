package com.basics;

public class CompositionExample {

    public static void main(String[] args) {
        Car1 car = new Car1("Toyota", "V6");
        System.out.println(car.model + " has an engine of type: " + car.engine.type);
    }
}

    class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }
    }

    class Car1 {
        String model;
        Engine engine;  // Composition: Car has an Engine

        Car1(String model, String engineType) {
            this.model = model;
            this.engine = new Engine(engineType);  // Engine is created within Car
        }
    }




