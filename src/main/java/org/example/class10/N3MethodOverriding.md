## Method Overriding in Java

## Objective
Learn how to use method overriding in Java to allow subclasses to provide their own implementation of methods defined in a parent class, enabling runtime polymorphism.

## What Is Method Overriding?
Let subclasses give their own behavior for methods defined in a parent class. Overriding is the backbone of runtime polymorphism.
- A **subclass** provides its own implementation for a method already defined in its **superclass**.
- The method signature (name, return type, parameters) must match exactly.

---

## Why Use Overriding?

- **Customize Behavior:** Let each subclass do its own thing.
- **Polymorphism:** Call the same method on a superclass reference but run the subclass version at runtime.
- **Code Reuse:** Keep a common API in the superclass; fill in details in subclasses.

---

## How to Override

1. **Same Signature:** Method name, return type, and parameters match the superclass.
2. **@Override Annotation:** Optional but recommended—it tells the compiler you intend to override.
3. **Access Level:** Can be the same or more public, but not more restrictive.
4. **Exception Rules:** Can throw fewer or narrower checked exceptions than the superclass method.

---

## Simple Examples

### Example 1: Basic Override

```java
class Animal {
    void makeSound() {
        System.out.println("Some animal noise");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
```

---

### Example 2: Using `super` in Overridden Method

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        
        System.out.println("Car ready to go");
    }
}
```

---

## Practical Example

```java
public class Demo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();          // upcast to superclass
        v1.start();                      // prints "Vehicle starting"
        v2.start();                      // prints:
                                         // "Car ready to go"
    }
}
```

---

## Summary

- **Method Overriding** lets subclasses replace or extend parent behavior.
- Use **@Override** to catch mistakes at compile time.
- Combined with upcasting, it enables dynamic method selection at runtime.

Happy coding!