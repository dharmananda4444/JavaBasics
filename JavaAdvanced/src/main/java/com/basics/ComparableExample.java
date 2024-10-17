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
        List<Person> people1 = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25));
        Collections.sort(people1);
        System.out.println(people); // Output: [Bob (25), Alice (30)]
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Compare by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}




