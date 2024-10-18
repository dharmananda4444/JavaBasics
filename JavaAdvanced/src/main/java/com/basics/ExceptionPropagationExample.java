package com.basics;

public class ExceptionPropagationExample {

        public static void main(String[] args) {
            try {
                methodA();
            } catch (Exception e) {
                System.out.println("Caught in main: " + e.getMessage());
            }
        }

        public static void methodA() {
            System.out.println("In methodA");
            methodB();
        }

        public static void methodB() {
            System.out.println("In methodB");
            methodC();
        }

        public static void methodC() {
            System.out.println("In methodC");
            // This will throw an exception
            throw new ArithmeticException("Division by zero error");
        }

}
