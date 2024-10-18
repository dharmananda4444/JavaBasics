package com.basics;

import java.util.Arrays;
import java.util.List;

public final class ImmutableClassExample {


        private final String name;
        private final List<String> hobbies;

        // Constructor
        public ImmutableClassExample(String name, List<String> hobbies) {
            this.name = name;
            // Create a defensive copy of the list to prevent modification
            this.hobbies = List.copyOf(hobbies);
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for hobbies
        public List<String> getHobbies() {
            return hobbies; // Returns the unmodifiable list
        }

    public static void main(String[] args) {
        List<String> hobbies = Arrays.asList("Reading", "Swimming", "Cycling");
        ImmutableClassExample person = new ImmutableClassExample("Alice", hobbies);

        System.out.println(person); // Output: ImmutablePerson{name='Alice', hobbies=[Reading, Swimming, Cycling]}

        // Trying to modify the name or hobbies will result in an error
        // person.name = "Bob"; // Compilation error
        // person.getHobbies().add("Running"); // Runtime error if attempted
    }


}