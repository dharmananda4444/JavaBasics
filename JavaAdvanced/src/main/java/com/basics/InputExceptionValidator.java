package com.basics;

public class InputExceptionValidator {

    public static void main(String[] args) {
        try {
            validateInput("abc");
           // validateInput("");  // This will throw custom InvalidInputException
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
        }
    }

    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty.");
        }
        System.out.println("Input is valid: " + input);
    }
}
