# Inheritance in Java

## Objective
Learn what inheritance is in Java, why it is used, and how to create and use it in simple examples. Inheritance allows a class (child) to acquire the properties and methods of another class (parent), promoting code reuse and a clear structure.

---

## What is Inheritance?
Inheritance in Java is a mechanism that enables one class (the child or subclass) to inherit fields and methods from another class (the parent or superclass). This helps in:
- **Code Reusability:** Use existing code from the parent class without rewriting it.
- **Logical Organization:** Group related classes together in a hierarchy.

---

## Examples

### Example 1: Basic Inheritance
In this example, the `Dog` class inherits from the `Animal` class without adding or changing any functionality.

```java
// Parent class
class Animal {
    void display() {
        System.out.println("I am an animal.");
    }
}

// Child class
class Dog extends Animal {
    // Inherits display() method from Animal
}

// Tester class with main method
class Tester {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display(); // Uses the display() method from Animal
    }
}
```

*Explanation:*  
The `Dog` class inherits the `display()` method from the `Animal` class. When a `Dog` object is created and the `display()` method is called, it uses the method defined in the `Animal` class.

---

```java
// Parent class with a field
class Parent {
    String message = "Hello from the Parent!";
}

// Child class that inherits from Parent
class Child extends Parent {
    void printMessage() {
        // Directly using the inherited field 'message'
        System.out.println(message);
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.printMessage(); // Outputs: Hello from the Parent!
    }
}
```

*Explanation:*  
The `Child` class inherits the `message` field from the `Parent` class. In its `printMessage()` method, it accesses and prints the inherited field without redefining it. This example demonstrates that with inheritance, a subclass can reuse fields from its parent class directly.


### Example 3: Inheritance with Additional Methods
In this example, the child class adds its own unique method while still inheriting methods from the parent class.

```java
// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Child class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Tester class with main method
class Tester {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited from Vehicle
        myCar.drive();  // Defined in Car
    }
}
```

*Explanation:*  
The `Car` class inherits the `start()` method from the `Vehicle` class and also defines its own method `drive()`. This demonstrates that a subclass can both inherit existing behavior and introduce new behavior.

---

## Summary
Inheritance in Java enables one class to inherit the fields and methods from another class, fostering code reuse and clear organization. These examples illustrate how subclasses like `Dog`, `Cat`, and `Car` can utilize the functionality of their parent classes, with each example's main method placed in a separate tester class. Happy coding!