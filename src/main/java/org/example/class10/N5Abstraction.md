## Abstraction in Java

## Objective
Learn how to use **abstraction** in Java to define high-level blueprints for classes, focusing on what needs to be done rather than how it is done. We will explore abstract classes, their rules, and see simple examples of their usage.

---

## What Is Abstraction?

Think of abstraction like driving a car—you use the steering wheel and pedals without worrying about how the engine works. In Java, abstraction using **abstract classes** hides complex implementation details and exposes only the essentials. We’ll define the rules for abstract classes and see simple examples of how to use them.
- **Abstraction** means focusing on **what** an object does, not **how** it does it.
- An **abstract class** provides a high-level blueprint with one or more methods declared `abstract` (no body).
- Subclasses **must** fill in those blanks by providing concrete implementations.

---

## Why Do We Need Abstraction?

- **Simplify Usage:** Work against a clear API without seeing the complex internals.
- **Enforce a Contract:** Guarantee that all subclasses implement certain behaviors.
- **Decouple Code:** Change or optimize internal details later without affecting users of the class.

---

## Rules for Abstract Classes

1. **Declaration:** Mark the class with the `abstract` keyword.
2. **Abstract Methods:** Any method without a body must be declared `abstract`.
3. **Concrete Methods:** You may also include fully implemented (non-abstract) methods.
4. **No Instantiation:** You cannot create an instance of an abstract class directly.
5. **Subclass Responsibility:** Every concrete subclass must override **all** abstract methods, or itself be declared `abstract`.
6. **Constructors & Fields:** Abstract classes can have constructors, fields, and even static methods to share common code.

---

## Simple Examples

### Example 1: Shape Blueprint

```java
abstract class Shape {
    abstract double area();           // each shape must compute area
    void describe() {                 // shared description method
        System.out.println("I am a shape.");
    }
}

class Circle extends Shape {
    private double radius;
    Circle(double r) { radius = r; }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape s = new Circle(2.5);    // upcast to Shape
        s.describe();                 // prints "I am a shape."
        System.out.println(s.area()); // prints 19.634954...
    }
}
```

---

### Example 2: Animal Behavior

```java
abstract class Animal {
    abstract void speak();            // each animal must speak
    void sleep() {                    // common behavior
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();                    // prints "Woof!"
        a.sleep();                    // prints "Zzz..."
    }
}
```

---

### Example 3: Payment Processor

```java
abstract class PaymentProcessor {
    abstract void process(double amount);  // each processor handles payment differently
    void receipt(double amount) {          // shared helper
        System.out.println("Receipt: $" + amount);
    }
}

class CreditCardProcessor extends PaymentProcessor {
    @Override
    void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

public class Checkout {
    public static void main(String[] args) {
        PaymentProcessor p = new CreditCardProcessor();
        p.process(99.99);                 // prints "Processing credit card payment..."
        p.receipt(99.99);                 // prints "Receipt: $99.99"
    }
}
```

---

## Summary

- Use **abstract classes** to define **what** must be done, leaving **how** to the subclasses.
- Follow the rules: declare `abstract`, include `abstract` methods, and let subclasses implement them.
- Abstract classes can also contain shared (concrete) code, constructors, and fields.

Happy coding!