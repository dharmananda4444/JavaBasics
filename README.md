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


# Immutable class

Immutable class in java means that once an object is created, we cannot change its content. 

In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. 

We can create our own immutable class as well. 

**Characteristics of imutable class**

* The class must be declared as final so that child classes can’t be created.

* Data members in the class must be declared private so that direct access is not allowed.

* Data members in the class must be declared as final so that we can’t change the value of it after object creation.

* A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.

* Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)

**Note:** There should be no setters or in simpler terms, there should be no option to change the value of the instance variable. 

```java
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

```
# Singleton Class

A Singleton class is a design pattern that restricts the instantiation of a class to a single instance. This is useful when exactly one object is needed to coordinate actions across the system.

**Different ways of intialization of Singleton:**

**1. Eager Initialization**

In this method, the instance of the class is created at the time of class loading.


```java
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // private constructor to prevent instantiation
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}


public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        System.out.println(singleton);
    }
}
```

**2. Lazy Initialization**

This method creates the instance only when it is requested for the first time.


```java
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // private constructor to prevent instantiation
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);
    }
}
```

**3. Thread-Safe Singleton (Synchronized Method)**

To make the lazy initialization thread-safe, you can synchronize the method that returns the instance.


```java
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        // private constructor to prevent instantiation
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        System.out.println(singleton);
    }
}
```

**4. Double-Checked Locking**

This approach reduces the overhead of acquiring a lock by first checking if the instance is null without synchronization.


```java
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
        // private constructor to prevent instantiation
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(singleton);
    }
}
```

**5. Bill Pugh Singleton (Using Inner Static Class)**

This method uses an inner static helper class to hold the instance, which gets loaded only when it is accessed.


```java
public class BillPughSingleton {
    private BillPughSingleton() {
        // private constructor to prevent instantiation
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class Main {
    public static void main(String[] args) {
        BillPughSingleton singleton = BillPughSingleton.getInstance();
        System.out.println(singleton);
    }
}
```


6. Enum Singleton

Using an enum is a simple and effective way to implement a Singleton. Java guarantees that enum values are instantiated only once.


```java
public enum EnumSingleton {
    INSTANCE;

    public void someMethod() {
        // Method logic
    }
}

public class Main {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.someMethod();
        System.out.println(singleton);
    }
}
```

Summary

* Eager Initialization: Instance created at class loading.

* Lazy Initialization: Instance created when needed.

* Synchronized Method: Thread-safe lazy initialization.

* Double-Checked Locking: Reduces synchronization overhead.

* Bill Pugh Singleton: Uses an inner static class for instance creation.

* Enum Singleton: Simple and thread-safe approach.


# Exception Handling

Exception handling is a programming construct used to manage errors and exceptional conditions that occur during the execution of a program. It allows developers to write robust code that can gracefully handle unexpected situations, such as invalid input, resource unavailability, or runtime errors, without crashing the program.

**Key Concepts of Exception Handling**

**Exceptions:** An exception is an event that disrupts the normal flow of the program. It can be caused by various issues, such as invalid user input, file not found, or network errors.

**Try-Catch Block:**

*  **Try:** A block of code that may throw an exception is wrapped in a try block.
 
*  **Catch:** The catch block is used to handle the exception. If an exception occurs in the try block, control is transferred to the corresponding catch block.
 
*  **Finally Block:** The finally block, if present, executes after the try and catch blocks, regardless of whether an exception occurred. It’s often used for cleanup activities, like closing files or releasing resources.

*  **Throwing Exceptions:** You can use the throw statement to create and throw an exception when a specific condition occurs.


**Checked vs. Unchecked Exceptions:**

* **Checked Exceptions:** Must be declared in the method signature or handled within the method.

* **Unchecked Exceptions:** Do not need to be declared or caught.

Example of Exception Handling


```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero. " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // Potentially throws ArithmeticException
    }
}
```

Explanation of the Example:

* **Try Block:** The divide method is called within a try block, which may throw an exception if division by zero occurs.

* **Catch Block:** If an ArithmeticException is thrown, the program jumps to the catch block, where an error message is printed.

* **Finally Block:** Regardless of whether an exception occurred, the finally block runs, ensuring that cleanup or final actions are performed.

**Benefits of Exception Handling:**

* Improved Code Quality: Makes your code more robust and easier to understand.

* Separation of Error Handling: Allows you to separate normal code from error-handling code, enhancing readability.

* Resource Management: Helps in managing resources like file streams, network connections, etc., ensuring they are properly closed or released.


## 1. Checked Exceptions

 Checked exceptions are exceptions that must be either caught or declared in the method signature using the throws keyword. These exceptions are checked at compile-time.

**Examples:**

* IOException
* SQLException


```java
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
        readFile("nonexistent.txt");
    }
}
```

## 2. Unchecked Exceptions

 Unchecked exceptions do not need to be declared or caught. They are derived from the RuntimeException class and occur at runtime.

Examples:

* NullPointerException

* ArrayIndexOutOfBoundsException

* ArithmeticException


```java
public class UncheckedExceptionExample {
    public static void divide(int a, int b) {
        try {
            int result = a / b; // This may throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        divide(10, 0); // This will cause an ArithmeticException
    }
}
```

Summary:

* Checked Exceptions: Must be caught or declared. Examples include IOException and SQLException.

* Unchecked Exceptions: Do not require explicit handling. Examples include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.


## throw and throws

1. Throw

Definition: The throw keyword is used to explicitly throw an exception from a method or any block of code. When you want to signal an error condition programmatically, you use throw.

Example:

```java
public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            // Throwing an exception
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}

```


2. throws

Definition: The throws keyword is used in a method declaration to specify that the method can throw one or more exceptions. This informs the caller of the method that it should handle those exceptions.

Example:

```java
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
```

Output:
Caught exception: nonexistent.txt (No such file or directory)

**Summary**

throw: Used to explicitly throw an exception. It can throw any exception type, and it can be used within any method or block of code.

throws: Used in method signatures to declare that the method may throw certain exceptions. It informs the caller to handle or propagate the exception.


## Exception Propagation

Exception propagation in Java refers to the way exceptions are passed up the call stack when they are not handled in the current method. 

When an exception occurs, Java looks for a suitable catch block in the current method. 

If it doesn't find one, the exception is propagated (or passed) to the calling method, and this process continues until a suitable catch block is found or the main method is reached.

Exception propagation allows methods to remain clean and focused on their tasks without needing to handle every possible exception.

Instead, the responsibility of handling exceptions can be managed at a higher level in the call stack, making error handling more organized and maintainable.


```java
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
```

## Custom Exceptions

Custom exceptions in Java are user-defined exception classes that extend the existing exception hierarchy. 

They allow developers to create more specific and meaningful error handling mechanisms tailored to the needs of their applications. 

Instead of relying solely on built-in exceptions (like NullPointerException, IllegalArgumentException, etc.), custom exceptions can convey specific error conditions that are relevant to your business logic or application flow.

**Key Features of Custom Exceptions**

* Specificity: Custom exceptions can represent specific error scenarios that are not adequately captured by standard exceptions.

* Clarity: By using custom exceptions, you can make your code more understandable. Others reading your code (or you, in the future) will have a clearer idea of what kinds of errors can occur.

* Granularity: You can create multiple custom exceptions to handle different error conditions in the same module or application, allowing for fine-grained control over error handling.

* Encapsulation: Custom exceptions can encapsulate additional information, such as error codes, context, or related data, which can be useful for debugging and logging.


**Step 1: Define a Custom Exception**


```java
// InvalidInputException.java
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

**Step 2: Use the Custom Exception in Your Code**


```java
// InputExceptionValidator.java
public class InputExceptionValidator {

    public static void main(String[] args) {
        try {
            validateInput("abc"); // This will throw InvalidInputException
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
```