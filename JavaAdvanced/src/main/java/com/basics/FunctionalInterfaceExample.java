package com.basics;

public class FunctionalInterfaceExample {

        public static void main(String[] args) {
            // Using a lambda expression to implement the calculate method
            Calculator add = (a, b) -> a + b;
            Calculator subtract = (a, b) -> a - b;
            Calculator multiply = (a, b) -> a * b;
            Calculator divide = (a, b) -> {
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            };

            // Testing the operations
            System.out.println("Addition: " + add.calculate(5, 3));         // Output: 8
            System.out.println("Subtraction: " + subtract.calculate(5, 3)); // Output: 2
            System.out.println("Multiplication: " + multiply.calculate(5, 3)); // Output: 15
            System.out.println("Division: " + divide.calculate(6, 3));      // Output: 2
        }
    }

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b); // Single abstract method
    }
