# JAVA

# OOPS

    The OOP (Object-Oriented Programming) concept is a programming paradigm based on the concept of "objects," which can contain data and code: data in the form of fields (often known as attributes or properties), and code in the form of procedures (often known as methods).

    1.Objects & Classes
    2.Inheritance
    3.Encapsulation 
    4.Polymorphism
    5.Abstraction
    

## Objects & Classes

**Class:** A blueprint for creating objects. It defines a type of object according to its attributes and methods.
Collection of objects is called class. It is a logical entity.
A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.

**Object:** An instance of a class. It represents a specific example of the class.
Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.

An object contains an address and takes up some space in memory. Objects can communicate without knowing the details of each other's data or code. The only necessary thing is the type of message accepted and the type of response returned by the objects.

**Example:** A car is an object because it has states like color, name, breed, etc. as well as behaviors like wagging the tail, barking, eating, etc.


```java
class Car {
    String make;
    String model;

    // Constructor
    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void drive() {
        System.out.println("The " + make + " " + model + " is driving.");
    }
}

// Creating an object of the Car class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Fortuner");
        myCar.drive(); // The Toyota Fortuner is driving
    }
}
```

##  Inheritance

When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Bike extends Vehicle {  // Bike inherits from Vehicle
    void ride() {
        System.out.println("Bike is riding.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start();  // Output: Vehicle is starting.
        myBike.ride();   // Output: Bike is riding.
    }
}
```

## Encapsulation

Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.

A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.

Encapsulation restricts direct access to some of an object's components, promoting data hiding.


```java
class BankAccount {
    private double balance;  // Private variable

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        System.out.println(account.getBalance());  // Output: 150
        // System.out.println(account.balance);  // Error: balance has private access
    }
}
```

## Polymorphism

If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It occurs in two forms: compile-time polymorphism (method overloading) and run-time polymorphism (method overriding).

Polymorphism allows methods to behave differently based on the object they are called on.


**Method overloading**

```java
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class to demonstrate method overloading
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));            // Output: 15
        System.out.println(math.add(5, 10, 15));        // Output: 30
        System.out.println(math.add(5.5, 10.5));        // Output: 16.0
    }
}
```

**Method overiding**

```java
// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the sound method on each object
        myDog.sound();  // Output: Woof
        myCat.sound();  // Output: Meow

        // Demonstrating polymorphism using an array of Animal references
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            animal.sound();  // Outputs: Woof and then Meow
        }
    }
}
```



## Abstraction

Abstraction hides complex implementation details and exposes only the essential features.

Hiding internal details and showing functionality. For example phone call, we don't know the internal processing.


```java
abstract class Shape {
    abstract double area();  // Abstract method
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());  // Output: 78.53981633974483
    }
}
```

## Summary

**Classes and Objects:** Fundamental building blocks of OOP.
**Encapsulation:** Restricts access to certain components.
**Inheritance:** Allows new classes to inherit from existing ones.
**Polymorphism:** Methods behave differently based on the object.
**Abstraction:** Hides complex details and exposes essential features.


# Abstract Classes and Interfaces


## Abstarct Classes

An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body) as well as concrete methods (methods with a body). Abstract classes are used when you want to define a base class that shares common functionality among subclasses while allowing some methods to be implemented by the subclasses.

**Key Features:**

Can contain both abstract methods and concrete methods.
Can have instance variables and constructors.
Supports inheritance (subclasses can extend the abstract class).
A class can extend only one abstract class (single inheritance).



```java
abstract class Animal {
    abstract void sound();  // Abstract method

    void eat() {            // Concrete method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}
```

**Interfaces**

An interface is a reference type in Java, similar to a class, that can only contain abstract methods (prior to Java 8) and static final variables. Since Java 8, interfaces can also contain default methods and static methods.

**Key Features:**

Can only contain method declarations (abstract methods), static methods, and default methods.
Cannot have instance variables (only constants).
Supports multiple inheritance (a class can implement multiple interfaces).
All methods in an interface are implicitly public.

```java
interface Animal {
    void sound();  // Abstract method

    default void eat() {  // Default method
        System.out.println("This animal eats food.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
```

## Abstarct Classes vs Interface


|          Feature          |                                    Abstract Class                                   |                                             Interface                                            |
|:-------------------------:|:-----------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------:|
| Instantiation             | Cannot be instantiated.                                                             | Cannot be instantiated.                                                                          |
| Method Implementation     | Can have both abstract and concrete methods.                                        | Can have only abstract methods (until Java 8).                                                   |
| Inheritance               | Supports single inheritance.                                                        | Supports multiple inheritance.                                                                   |
| Constructor               | Can have constructors.                                                              | Cannot have constructors.                                                                        |
| Cannot have constructors. | Can use access modifiers (public, protected, private).                              | Methods are implicitly public.                                                                   |
| Instance Variables        | Can have instance variables.                                                        | Cannot have instance variables (only constants).                                                 |
| Use Case                  | Use when classes share common functionality but may have different implementations. | Use to define a contract that multiple classes can implement, regardless of the class hierarchy. |


**When to Use Each**

Abstract Class: Use when you want to provide a common base with some shared implementation, and you want to enforce a class hierarchy.

Interface: Use when you want to define a contract for classes without dictating how they should implement the methods, allowing for greater flexibility and multiple inheritance.


# Comparable vs Comparator

Comparable and Comparator are two interfaces used to define the order of objects.


## Comparable

The Comparable interface is implemented by the class whose objects are to be compared. It provides a single method, compareTo(T o), which defines the natural ordering of objects.

**Example:**

```java
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


// Usage
List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25));
Collections.sort(people);
System.out.println(people); // Output: [Bob (25), Alice (30)]
```


## Comparator

The Comparator interface is used to define an external comparison logic. It allows you to create multiple different ways to compare objects, and it provides two methods: compare(T o1, T o2) and equals(Object obj).

**Example:**


```java
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

// Usage
List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25));
Collections.sort(people, new AgeComparator());
System.out.println(people); // Output: [Bob (25), Alice (30)]

Collections.sort(people, new NameComparator());
System.out.println(people); // Output: [Alice (30), Bob (25)]
```

**Summary**

* Comparable is used to define the natural ordering of a class (one way to compare).
* Comparator allows you to create multiple comparison strategies (multiple ways to compare).
* Use Comparable when you want a default way to sort a class, and Comparator when you need custom sorting logic.


# Composition-Aggregation-Association

In Java, composition, aggregation, and association are concepts used to describe relationships between classes.

1. Association

Association is a general term that describes a relationship between two classes. It implies that one class uses or interacts with another class but does not have ownership. The relationship can be one-to-one, one-to-many, or many-to-many.

**Example:**

```java
class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Alice");
        Car car = new Car("Toyota");
        
        // Driver and Car have an association
        System.out.println(driver.name + " drives a " + car.model);
    }
}
```

2. Aggregation

Aggregation is a special form of association that represents a "whole-part" relationship where the part can exist independently of the whole. In aggregation, the lifecycle of the part is not strictly tied to the lifecycle of the whole. This means that while one class (the whole) contains references to another class (the part), the part can outlive the whole and exists independently.

**Example:**


```java
class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department> departments;

    University(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department department) {
        departments.add(department);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        University university = new University("XYZ University");
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");
        
        university.addDepartment(cs);
        university.addDepartment(math);
        
        System.out.println(university.name + " has departments: " + cs.name + ", " + math.name);
    }
}
```

3. Composition

Composition is a stronger form of aggregation where the part cannot exist independently of the whole. In this relationship, if the whole is destroyed, the part is also destroyed. It represents a "strong ownership" relationship.

**Example:**


```java
class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
}

class Car {
    String model;
    Engine engine;  // Composition: Car has an Engine

    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);  // Engine is created within Car
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "V6");
        System.out.println(car.model + " has an engine of type: " + car.engine.type);
    }
}
```

**Summary:**

**Association:** A general relationship where one class uses another. Both classes can exist independently.
**Aggregation:** A "whole-part" relationship where the part can exist independently of the whole.
**Composition:** A strong "whole-part" relationship where the part's lifecycle is tied to the whole; if the whole is destroyed, the part is also destroyed.
