package com.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {


    public static void main(String[] args) {
        List<Person1> people = Arrays.asList(
                new Person1("Alice", 30),
                new Person1("Bob", 25)
        );

        // Sort by age
        Collections.sort(people, new AgeComparator());
        System.out.println("Sorted by age: " + people); // Output: [Bob (25), Alice (30)]

        // Sort by name
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name: " + people); // Output: [Alice (30), Bob (25)]
    }
}

    class Person1 {
        String name;
        int age;

        public Person1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    class AgeComparator implements Comparator<Person1> {
        @Override
        public int compare(Person1 p1, Person1 p2) {
            return p1.age - p2.age; // Compare by age
        }
    }

    class NameComparator implements Comparator<Person1> {
        @Override
        public int compare(Person1 p1, Person1 p2) {
            return p1.name.compareTo(p2.name); // Compare by name
        }
    }


