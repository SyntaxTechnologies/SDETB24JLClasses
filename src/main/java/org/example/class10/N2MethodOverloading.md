## Method Overloading in Java

## Objective

Learn how to use method overloading in Java to create multiple methods with the same name but different parameters, enhancing code clarity and flexibility.
---

## What Is Method Overloading?
Method overloading lets you define multiple methods with the same name but different parameters, improving code clarity and flexibility.
In Java, method overloading means creating multiple methods in the same class with:
- The **same name**, and
- **Different parameter lists** (different number, types, or order of parameters).

The return type may vary, but overloading is determined by parameters.

---

## Why Do We Need Method Overloading?

- **Readability:** Use the same method name for similar actions with different inputs.
- **Convenience:** Allow callers to use methods with different argument types without remembering different names.
- **Flexibility:** Provide multiple ways to perform a task based on available data.
- **Maintainability:** Group related operations under one method name, reducing clutter.

---

## Simple Examples

### Example 1: Overloading a `sum` Method

```java
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));        // 5
        System.out.println(calc.sum(2.5, 3.5));    // 6.0
        System.out.println(calc.sum(1, 2, 3));     // 6
    }
}
```

**Explanation:**
- `sum(int, int)` handles two integers.
- `sum(double, double)` handles two doubles.
- `sum(int, int, int)` handles three integers.

---

### Example 2: Overloading Constructors

```java
class Box {
    double length, width, height;

    // No-argument constructor
    Box() {
        this.length = this.width = this.height = 1.0;
    }

    // One-argument constructor (cube)
    Box(double side) {
        this.length = this.width = this.height = side;
    }

    // Three-argument constructor
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3);
        Box b3 = new Box(2, 3, 4);
        System.out.println(b1.volume());  // 1.0
        System.out.println(b2.volume());  // 27.0
        System.out.println(b3.volume());  // 24.0
    }
}
```

**Explanation:**
- `Box()` sets a default box of size 1.
- `Box(double)` creates a cube.
- `Box(double, double, double)` creates a rectangular box.

---

## Summary

Method overloading allows you to:
- Define methods with the **same name** but **different parameters**.
- Improve readability and convenience when performing similar tasks.
- Create cleaner APIs by grouping related operations.

Happy coding!