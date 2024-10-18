package com.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void readFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        readFile("D://javabasics/JavaBasics/JavaAdvanced/example.txt");
       // readFile("example.txt"); //gives exception because example.txt is not present
    }
}
