package com.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25)
        );

        // Sort by age
        Collections.sort(people, new AgeComparator());
        System.out.println("Sorted by age: " + people); // Output: [Bob (25), Alice (30)]

        // Sort by name
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name: " + people); // Output: [Alice (30), Bob (25)]
    }
}

    class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.age - p2.age; // Compare by age
        }
    }

    class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.name.compareTo(p2.name); // Compare by name
        }
    }


