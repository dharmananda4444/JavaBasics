package com.basics;

public class ThrowExample {

    public static void validateAge(int age) {
        if (age < 18) {
            // Throwing an exception
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}

