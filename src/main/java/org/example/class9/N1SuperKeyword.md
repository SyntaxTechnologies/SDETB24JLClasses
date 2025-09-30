## Super Keyword in Java

## Objective

Learn how to use the `super` keyword in Java to access parent class members, enhancing code clarity and inheritance management.
---

## What Is the `super` Keyword?
The `super` keyword lets a subclass refer to members (variables, methods, constructors) of its parent class, enabling clear, organized inheritance.

In Java, `super` is a special reference used in a subclass to access:
- **Parent Class Variables:** Instance fields of the superclass.
- **Parent Class Methods:** Methods defined in the superclass.
- **Parent Class Constructors:** Constructors of the superclass.

---

## Why Do We Need `super`?

- **Disambiguation:** When a subclass has a field or method with the same name as the parent, `super` clarifies you mean the parent’s version.
- **Initialization:** To invoke a specific superclass constructor before running subclass constructor code.
- **Code Reuse:** To build on or extend behavior from the superclass without rewriting it.

---

## Use Cases of `super`

1. Access Parent Field
2. Call Parent Method
3. Invoke Parent Constructor

---

## Simple Examples

### Example 1: Accessing a Parent Field

```java
class Person {
    String name = "Parent";
}

class Child extends Person {
    String name = "Child";

    void showNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }

    public static void main(String[] args) {
        new Child().showNames();
    }
}
```

**Explanation:**
- `name` in `Child` refers to `"Child"`.
- `super.name` refers to the `Person` class’s `"Parent"`.

---

### Example 2: Calling a Parent Method

```java
class Person {
    void greet() {
        System.out.println("Hello from Person");
    }
}

class Child extends Person {
    @Override
    void greet() {
        System.out.println("Hello from Child");
        super.greet();  // call parent method
    }

    public static void main(String[] args) {
        new Child().greet();
    }
}
```

**Explanation:**
- `greet()` in `Child` prints its own message.
- `super.greet()` then runs the `Person` version.

---

### Example 3: Invoking a Parent Constructor

```java
class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Child extends Person {
    Child() {
        super();  // call parent constructor
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
```

**Explanation:**
- `super();` runs the `Person()` constructor first.
- Then the `Child()` constructor continues.

---

## Summary

The `super` keyword helps you:
- Clear up naming conflicts between parent and child classes.
- Reuse parent behavior by calling parent methods.
- Ensure proper initialization by invoking parent constructors.

Happy coding!