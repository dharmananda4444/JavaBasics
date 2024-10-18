package com.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Method declaration with throws
    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt"); // This may throw an IOException
        } catch (IOException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
