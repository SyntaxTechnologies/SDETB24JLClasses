## Encapsulation in Java

## Objective
Learn how to use encapsulation in Java to protect your object's data and provide controlled access through methods.

---

## What Is Encapsulation?
Think of encapsulation like putting ingredients in a sealed container—you control exactly how others get to them. In Java, encapsulation means hiding an object’s internal data and only exposing safe, controlled ways to interact with it.

- **Encapsulation** bundles data (fields) and behavior (methods) together in a class.
- It **hides** the internal state by making fields `private`.
- It **exposes** operations through `public` methods (getters/setters or other actions).

---

## Why Do We Need Encapsulation?

- **Data Safety:** Prevent external code from putting your object in an invalid state.
- **Implementation Flexibility:** Change how data is stored or validated without breaking external code.
- **Clear API:** Users of your class see only the methods you want them to use, not the internal details.

---

## How to Implement Encapsulation

1. **Private Fields:** Mark data members as `private`.
2. **Public Getters/Setters:** Provide `public` methods to read or modify the fields, with optional validation.
3. **Behavior Methods:** Create high-level methods that operate on the data instead of exposing fields directly.

---

## Simple Examples

### Example 1: Basic Getter/Setter

```java
class Person {
    private String name;     // hidden
    private int age;         // hidden

    public String getName() {
        return name;        // safe read
    }

    public void setName(String name) {
        this.name = name;   // safe write
    }

    public int getAge() {
        return age;         // safe read
    }

    public void setAge(int age) {
        this.age = age;     // safe write
    }
}
```

---

### Example 2: Read-Only Field

```java
class BankAccount {
    private double balance;  

    public double getBalance() {
        return balance;     // allow checking only
    }

    public void deposit(double amount) {
        balance += amount;  // controlled update
    }
}
```

---

### Example 3: Validation in Setter

```java
class Rectangle {
    private double width;
    private double height;

    public void setWidth(double w) {
        if (w > 0) {
            width = w;
        } else {
            System.out.println("Width must be positive");
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            height = h;
        } else {
            System.out.println("Height must be positive");
        }
    }

    public double getArea() {
        return width * height;
    }
}
```

---

## Summary

- **Encapsulation** = hide fields + expose safe methods.
- **Private fields** keep internals hidden.
- **Public methods** let outside code interact in a controlled way.
- This keeps your objects reliable, flexible, and easy to maintain.

Happy coding!