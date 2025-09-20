
# Introduction to Object-Oriented Programming (OOP)

Object-oriented programming is simply a way of writing code by following a set of rules that make your life easier. Think of it as choosing a fighting style—like Kung Fu or Karate—that suits your needs. By following these rules, your code becomes easier to manage, reduces repetition, increases security, and becomes more dynamic. The four main pillars of OOP are:


- **Inheritance:** Allowing one class to use properties and methods of another.
- **Polymorphism:** Enabling methods to perform different tasks based on the object calling them.
- **Abstraction:** Hiding complex details and showing only the essential features.
- **Encapsulation:** Keeping data and the code that manipulates it together.

Note: All of the above four pillars will be explained in a great detail later on in separate classes.
Understanding classes and objects is key to learning OOP in Java. so let's dive into the basics of classes and objects in Java first.

# CLASSES AND OBJECTS IN JAVA

## 1) WHAT ARE CLASSES AND OBJECTS?
A class in Java is like a blueprint that defines properties (fields) and behaviors (methods) for a set of objects. An object is an instance of a class that holds specific values for the properties defined by its class.

## 2) WHY DO WE NEED CLASSES AND OBJECTS?
Classes and objects are useful because they:
- **Group Related Data and Behavior:** They allow you to bundle data (fields) and the methods that operate on that data into a single unit.
- **Promote Code Reuse:** Once a class is defined, you can create multiple objects from it, each with its own state.
- **Simplify Program Organization:** They help in organizing code into modular, manageable pieces.

For example, instead of creating separate variables for a student's name, age, and grade, you can create a `Student` class that encapsulates these properties.

## 3) HOW DO WE USE CLASSES AND OBJECTS? (EXAMPLES)

### Example #1: Creating a Simple Class and Object
```java
// Define a simple class named HelloWorld
public class HelloWorld {
    // Create a method to print a greeting message
     void sayHello() {
        System.out.println("Hello, World!");
    }
}

// In your main method, create an object of HelloWorld and call its method
// Example (in the main method):
HelloWorld hw = new HelloWorld();
hw.sayHello();
// Expected Output:
// Hello, World!
```

### Example #2: Declaring a Class with Fields
```java
// Define a class named Student with two fields
public class Student {
    String name;
    int age;
}

// In your main method, create an object of Student and assign values
Student student1 = new Student();
student1.name = "Alice";
student1.age = 20;
System.out.println("Name: " + student1.name + ", Age: " + student1.age);
// Expected Output:
// Name: Alice, Age: 20
```

### Example #3: Creating Multiple Objects
```java
// Define a class named Car with fields and a method to display details
public class Car {
    String model;
    int year;
    
    // Method to print car details
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

// In your main method, create two Car objects and assign different values
Car car1 = new Car();
car1.model = "Toyota Camry";
car1.year = 2020;
Car car2 = new Car();
car2.model = "Honda Accord";
car2.year = 2021;

// Display the details of both cars
car1.displayInfo();
car2.displayInfo();
// Expected Output:
// Car Model: Toyota Camry, Year: 2020
// Car Model: Honda Accord, Year: 2021
```

### Example #4: Calling Methods on an Object
```java
// Define a class named Greeter with a method to greet a person
public class Greeter {
    // Method that prints a greeting message
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// In your main method, create a Greeter object and call its greet method
Greeter greeter = new Greeter();
greeter.greet("Bob");
// Expected Output:
// Hello, Bob!
```

## 4) COMMON MISTAKES

### Mistake #1: Not Creating an Object
```java
// Incorrect: Trying to call a non-static method without creating an object
Student s;
s.name = "Alice"; // This will cause an error because s is not instantiated.
```
*Tip:* Always use the `new` keyword to create an object, e.g., `Student s = new Student();`.

### Mistake #2: Mixing Up Data Types
```java
// Incorrect: Assigning a number to a String field
Student s = new Student();
s.name = 123; // This will cause an error because name should be a String.
```
*Tip:* Make sure to assign values that match the data type of the field.

## 5) LIMITATIONS AND CONSIDERATIONS

- **Fixed Blueprint:**  
  A class is a blueprint. Once defined, it only describes the structure and behavior. Each object (instance) created from the class has its own state.
- **Memory Usage:**  
  Creating many objects can consume more memory.
- **Design:**  
  Well-designed classes lead to better organized and maintainable code.

> **Note**: Classes and objects are fundamental in Java for building modular and reusable code. Practice these examples to become comfortable with defining classes, creating objects, and calling methods on those objects. Happy coding!