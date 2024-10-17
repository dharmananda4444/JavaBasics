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

## Interfaces

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

**Abstract Class:** Use when you want to provide a common base with some shared implementation, and you want to enforce a class hierarchy.

**Interface:** Use when you want to define a contract for classes without dictating how they should implement the methods, allowing for greater flexibility and multiple inheritance.


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

**1. Association**

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

**2. Aggregation**

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

**3. Composition**

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



# Java(JVM) Memory Model

## Garbage collection

Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

The programmer need not care for all those objects which are no longer in use. Garbage collector destroys these objects. The main objective of Garbage Collector is to free heap memory by destroying unreachable objects. 

### How Does Garbage Collection in Java works?

Java garbage collection is an automatic process. Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. An in-use object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused or unreferenced object is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed. The programmer does not need to mark objects to be deleted explicitly. The garbage collection implementation lives in the JVM. 

### Types of Activities in Java Garbage Collection

Two types of garbage collection activity usually happen in Java.

**Minor or incremental Garbage Collection:** It is said to have occurred when unreachable objects in the young generation heap memory are removed.

**Major or Full Garbage Collection:** It is said to have occurred when the objects that survived the minor garbage collection are copied into the old generation or permanent generation heap memory are removed. When compared to the young generation, garbage collection happens less frequently in the old generation.


### Important Concepts Related to Garbage Collection in Java

1. **Unreachable objects:** An object is said to be unreachable if it doesn’t contain any reference to it. Also, note that objects which are part of the island of isolation are also unreachable. 

```java
Integer i = new Integer(4);
// the new Integer object is reachable  via the reference in 'i' 
i = null;
// the Integer object is no longer reachable. 
garbage collection
```

2. **Eligibility for garbage collection:** An object is said to be eligible for GC(garbage collection) if it is unreachable. After i = null, integer object 4 in the heap area is suitable for garbage collection in the above image.

**Ways to make an object eligible for Garbage Collector**

Even though the programmer is not responsible for destroying useless objects but it is highly recommended to make an object unreachable(thus eligible for GC) if it is no longer required.
There are generally four ways to make an object eligible for garbage collection.

* Nullifying the reference variable

* Re-assigning the reference variable

* An object created inside the method


**Ways for requesting JVM to run Garbage Collector**

* Once we make an object eligible for garbage collection, it may not destroy immediately by the garbage collector. Whenever JVM runs the Garbage Collector program, then only the object will be destroyed. But when JVM runs Garbage Collector, we can not expect.

* We can also request JVM to run Garbage Collector. There are two ways to do it : 
Using System.gc() method: System class contain static method gc() for requesting JVM to run Garbage Collector.

* Using Runtime.getRuntime().gc() method: Runtime class allows the application to interface with the JVM in which the application is running. Hence by using its gc() method, we can request JVM to run Garbage Collector.

* There is no guarantee that any of the above two methods will run Garbage Collector.
The call System.gc() is effectively equivalent to the call : Runtime.getRuntime().gc()

**Finalization**

* Just before destroying an object, Garbage Collector calls finalize() method on the object to perform cleanup activities. Once finalize() method completes, Garbage Collector destroys that object.

* finalize() method is present in Object class with the following prototype.
protected void finalize() throws Throwable


**Based on our requirement, we can override finalize() method for performing our cleanup activities like closing connection from the database.** 

* The finalize() method is called by Garbage Collector, not JVM. However, Garbage Collector is one of the modules of JVM.

* Object class finalize() method has an empty implementation. Thus, it is recommended to override the finalize() method to dispose of system resources or perform other cleanups.

* The finalize() method is never invoked more than once for any object.

* If an uncaught exception is thrown by the finalize() method, the exception is ignored, and the finalization of that object terminates.

**Advantages of Garbage Collection in Java**

* It makes java memory-efficient because the garbage collector removes the unreferenced objects from heap memory.

* It is automatically done by the garbage collector(a part of JVM), so we don’t need extra effort.


## Memory Management in Java - Young Generation

The young generation is the place where all the new objects are created. When the young generation is filled, garbage collection is performed. This garbage collection is called Minor GC.

Young Generation is divided into three parts -**Eden Memory** and **two Survivor Memory spaces**. 

**Important Points about Young Generation Spaces:**

* Most of the newly created objects are located in the Eden memory space.

* When Eden space is filled with objects, Minor GC is performed and all the survivor objects are moved to one of the survivor spaces.

* Minor GC also checks the survivor objects and move them to the other survivor space. So at a time, one of the survivor space is always empty.

* Objects that are survived after many cycles of GC, are moved to the Old generation memory space. Usually, it’s done by setting a threshold for the age of the young generation objects before they become eligible to promote to Old generation.


## Memory Management in Java - Old Generation

Old Generation memory contains the objects that are long-lived and survived after many rounds of Minor GC. Usually, garbage collection is performed in Old Generation memory when it’s full. Old Generation Garbage Collection is called Major GC and usually takes a longer time.

**Stop the World Event**

All the Garbage Collections are “Stop the World” events because all application threads are stopped until the operation completes.

Since Young generation keeps short-lived objects, Minor GC is very fast and the application doesn’t get affected by this.

Major GC takes a long time because it checks all the live objects. 

Major GC should be minimized because it will make your application unresponsive for the garbage collection duration. 

So if you have a responsive application and there are a lot of Major Garbage Collection happening, you will notice timeout errors. 

The duration taken by garbage collector depends on the strategy used for garbage collection. That’s why it’s necessary to monitor and tune the garbage collector to avoid timeouts in the highly responsive applications.

**Java Memory Model - Permanent Generation**

Permanent Generation or “Perm Gen” contains the application metadata required by the JVM to describe the classes and methods used in the application. Note that Perm Gen is not part of Java Heap memory. Perm Gen is populated by JVM at runtime based on the classes used by the application. Perm Gen also contains Java SE library classes and methods. Perm Gen objects are garbage collected in a full garbage collection.

**Java Memory Model - Method Area**

Method Area is part of space in the Perm Gen and used to store class structure (runtime constants and static variables) and code for methods and constructors.


**Java Memory Model - Memory Pool**

Memory Pools are created by JVM memory managers to create a pool of immutable objects if the implementation supports it. String Pool is a good example of this kind of memory pool. Memory Pool can belong to Heap or Perm Gen, depending on the JVM memory manager implementation.

**Java Memory Model - Runtime Constant Pool**

Runtime constant pool is per-class runtime representation of constant pool in a class. It contains class runtime constants and static methods. Runtime constant pool is part of the method area.

**Java Memory Model - Java Stack Memory**

Java Stack memory is used for execution of a thread. They contain method specific values that are short-lived and references to other objects in the heap that is getting referred from the method. 


**Java Heap Space**

Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. 

Whenever we create an object, it’s always created in the Heap space.

Garbage Collection runs on the heap memory to free the memory used by objects that don’t have any reference. 

Any object created in the heap space has global access and can be referenced from anywhere of the application.

**Java Stack Memory**

Java Stack memory is used for the execution of a thread. 

They contain method-specific values that are short-lived and references to other objects in the heap that is getting referred from the method. 

Stack memory is always referenced in LIFO (Last-In-First-Out) order. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. 

As soon as the method ends, the block becomes unused and becomes available for the next method. Stack memory size is very less compared to Heap memory.


# Spring IoC (Inversion of Control)

Spring IoC (Inversion of Control) Container is the core of Spring Framework. 

It creates the objects, configures and assembles their dependencies, manages their entire life cycle.

The Container uses Dependency Injection(DI) to manage the components that make up the application. It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class. 

These objects are called Beans. Since the Controlling of Java objects and their lifecycle is not done by the developers, hence the name Inversion Of Control. 

The followings are some of the main features of Spring IoC,

* Creating Object for us

* Managing our objects

* Helping our application to be configurable

* Managing dependencies

# Spring Dependency Injection

Dependency Injection is the main functionality provided by Spring IOC(Inversion of Control). 

The Spring-Core module is responsible for injecting dependencies through either Constructor or Setter methods. 

The design principle of Inversion of Control emphasizes keeping the Java classes independent of each other and the container frees them from object creation and maintenance.

 These classes, managed by Spring, must adhere to the standard definition of Java-Bean. Dependency Injection in Spring also ensures loose coupling between the classes. 

 Dependency Injection is a key feature of the Spring Framework, allowing for loosely coupled, reusable code.

 
 # Spring IoC (Inversion of Control) vs Spring Dependency Injection

 |                                                              Spring IoC (Inversion of Control)                                                              |                                                                     Spring Dependency Injection                                                                    |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| Spring IoC Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. | Spring Dependency injection is a way to inject the dependency of a framework component by the following ways of spring: Constructor Injection and Setter Injection |
|                       Spring helps in creating objects, managing objects, configurations, etc. because of IoC (Inversion of Control).                       |                               Spring framework helps in the creation of loosely-coupled applications because of Dependency Injection.                              |
|                                                     Spring IoC is achieved through Dependency Injection.                                                    |                Dependency Injection is the method of providing the dependencies and Inversion of Control is the end result of Dependency Injection.                |
|                                         IoC is a design principle where the control flow of the program is inverted.                                        |                                                 Dependency Injection is one of the subtypes of the IOC principle.                                                  |
|                                          Aspect-Oriented Programming is one way to implement Inversion of Control.                                          |                                            In case of any changes in business requirements, no code change is required.                                            |


# Types of DI(Dependency Injection) 

## Constructor Based Dependency Injection

Constructor Based Dependency Injection is the most recommended dependency injection technique in the Spring Framework. This technique involves passing all necessary dependencies for an object as arguments to the constructor. The object is created only after all necessary dependencies have been provided.

The main reason for preferring dependency injection through the constructor is that it allows dependencies to be explicit and mandatory. This means that all dependencies necessary for an object to function correctly must be provided at object creation time, which ensures that the object is in a valid state from the start. In addition, injecting dependencies through the constructor makes the code easier to understand and maintain, as all dependencies required for the object are clearly defined in the constructor.

Let’s look at an example:

```java
public class ProductService {
   private final ProductRepository productRepository;
  
   public ProductService(ProductRepository productRepository) {
      this.productRepository = productRepository;
   }
}
```
In this example, the ProductService class has a dependency on ProductRepository , which is passed as an argument in the constructor.

In the example I mentioned above, you don’t need to use the @Autowired annotation when using dependency injection through the constructor. This is because Spring Framework can automatically detect the constructor with arguments and provide the corresponding dependency instances at runtime.

So, in the example I showed, Spring Framework will detect that the ProductServiceclass has a constructor with an argument of type ProductRepository, and will look for a bean of type ProductRepositoryto inject. Since the ProductRepositoryis defined as a bean in the Spring context, an instance of ProductRepositorywill be created and injected into the constructor of ProductService.