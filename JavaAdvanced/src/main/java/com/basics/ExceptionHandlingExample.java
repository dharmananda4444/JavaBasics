package com.basics;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero. " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // Potentially throws ArithmeticException
    }
}
