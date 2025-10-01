## Interfaces in Java

## Objective
Learn how interfaces let you define a clear contract—a list of methods—without worrying about how they’re done.


## What Is an Interface?
Interfaces let you define a clear contract—a list of methods—without worrying about how they’re done. Think of it like a power outlet: you know what plugs fit and what voltage they need, but you don’t care how the socket is wired. We’ll cover what interfaces are, why they’re useful, and how to use them with simple, everyday examples.

- An **interface** in Java is a set of method signatures (no bodies) that any implementing class must provide.
- It defines **what** a class can do, not **how** it does it.

---

## Why Do We Need Interfaces?

- **Decoupling:** Code depends on behaviors (interfaces), not specific classes.
- **Multiple Roles:** A class can implement multiple interfaces, picking up several “jobs.”
- **Swappable Implementations:** You can swap out one implementation for another without changing the code that uses the interface.

---

## How to Use Interfaces

1. **Define an Interface:** Use the `interface` keyword and list method signatures.
2. **Implement the Interface:** A class uses `implements` and provides bodies for all interface methods.
3. **Program to the Interface:** Refer to objects by their interface type for maximum flexibility.

---

## Simple Examples

### Example 1: Basic Interface

```java
// Define the contract
interface Playable {
    void play();    // no body here
}

// Implement the contract
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strum strum");
    }
}

public class Band {
    public static void main(String[] args) {
        Playable instrument = new Guitar();  // treat Guitar as Playable
        instrument.play();                   // prints "Strum strum"
    }
}
```

> **Analogy:** `Playable` is like the outlet—you know you can “plug in” any instrument that implements `play()`.

---

### Example 2: Multiple Interfaces

```java
interface Flyable {
    void fly();
}

interface Floatable {
    void floatOnWater();
}

class Seaplane implements Flyable, Floatable {
    @Override
    public void fly() {
        System.out.println("Seaplane flies");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Seaplane floats");
    }
}

public class Demo {
    public static void main(String[] args) {
        Seaplane sp = new Seaplane();
        Flyable flyer = sp;         
        Floatable floater = sp;     

        flyer.fly();            // prints "Seaplane flies"
        floater.floatOnWater(); // prints "Seaplane floats"
    }
}
```

> **What’s happening:** `Seaplane` plays two roles—flying and floating—by implementing both interfaces.

---

## Summary

- **Interface = Contract:** Lists **what** a class must do.
- **Implementation = Class:** Provides **how** it does it.
- **Flexibility:** Multiple implementations and multiple roles with one type.

Happy coding!