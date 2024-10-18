package com.basics;

public class ReferenceDataTypesExample {

 /*  //Reference data type - Class
    public static void main(String[] args) {
        Person2 person = new Person2("Alice", 30);
        person.display(); // Output: Alice is 30 years old.
    }
}

    class Person2 {
        String name;
        int age;

        Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println(name + " is " + age + " years old.");
        }
    }
*/

/*   //Reference data type - Interface
    public static void main(String[] args) {
        Animal2 myDog = new Dog1();// Dog object referenced by Animal type
        myDog.sound(); // Output: Woof
    }
}

    interface Animal2 {
        void sound(); // Abstract method
    }

    class Dog1 implements Animal2 {
        public void sound() {
            System.out.println("Woof");
        }
    }

*/

/*    //Reference data type - Array
    public static void main(String[] args) {
        // Creating an array
        int[] originalArray = {1, 2, 3};

        // Assigning originalArray to another reference
        int[] referenceArray = originalArray;

        // Modifying the original array
        originalArray[0] = 10;

        // Both arrays will reflect the change
        System.out.println("Original Array: " + originalArray[0]); // Output: 10
        System.out.println("Reference Array: " + referenceArray[0]); // Output: 10
    }
}

*/
/*  //Reference data type - String
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = str1; // str2 refers to the same object as str1

            System.out.println(str1); // Output: Hello
            System.out.println(str2); // Output: Hello

            str1 = "World"; // str1 now refers to a new String object

            System.out.println(str1); // Output: World
            System.out.println(str2); // Output: Hello (still refers to the original object)
        }
    }

*/
}