package com.basics;

public class UncheckedExceptionExample {

        public static void divide(int a, int b) {
            try {
                int result = a / b; // This may throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.err.println("Cannot divide by zero: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            divide(10, 0); // This will cause an ArithmeticException
        }

}
