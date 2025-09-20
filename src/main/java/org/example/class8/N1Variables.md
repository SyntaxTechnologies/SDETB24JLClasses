# Variables in Java: Local, Instance, and Static Variables

This guide explains three types of variables in Java based on where they are declared and how long they live.

---

## 1. Local Variables

**What Are They?**  
Local variables are declared inside a block of code (such as methods, loops, if-else statements, switch cases, or constructors). They exist only while that block of code is executing and disappear once it finishes.

**Benefits:**
- **Temporary Use:** They occupy memory only for the duration of the task.
- **Easy to Manage:** Their scope is limited to the block where they are defined.

**Downsides:**
- **Short-lived:** They vanish when the block is done.
- **Limited Scope:** They cannot be used outside the block in which they are created.

**When to Use Local Variables:**  
Always use local variables for temporary calculations or decisions needed only in one part of your program.

### Example 1: Calculating the Sum of Numbers in an Array
```java
class ArraySum {
   
    
    public static void main(String[] args) {
      int[] numbers = {5, 10, 15, 20}; // local array variable
      int sum = 0;                    // local variable to store the sum
      for (int number : numbers) {
        sum += number;
      }
      System.out.println("Total Sum: " + sum);
    }
}
```
*Explanation:*  
The array `numbers` and the variable `sum` are declared inside the `calculateSum()` method. They only exist while the method is running.

## 2. Instance Variables

**What Are They?**  
Instance variables are declared inside a class but outside any method or block. Every object (instance) of the class gets its own copy of these variables. They store information that describes the object.

**Benefits:**
- **Object Specific:** They hold data (like a name, age, or scores) unique to each object.
- **Accessible in All Instance Methods:** They can be used by any non-static method or constructor of the object.

**Downsides:**
- **Higher Memory Usage:** Each object has its own copy, so many objects may use more memory.
- **Not Directly Accessible in Static Methods:** Static methods belong to the class and cannot directly access instance variables.

**When to Use Instance Variables:**  
Use instance variables to store important details about an object that persist as long as the object exists.

### Example: Student Scores
```java
class Student {
  // Simple instance variables
  String name;
  int score;
}

class TestStudents {
  public static void main(String[] args) {
    // Create two Student objects with different values
    Student s1 = new Student();
    s1.name = "Alice";
    s1.score = 85;

    Student s2 = new Student();
    s2.name = "Bob";
    s2.score = 90;

    // Print the details of each student
    System.out.println(s1.name + "'s Score: " + s1.score);
    System.out.println(s2.name + "'s Score: " + s2.score);
  }
}
```
*Explanation:*  
Each `Student` object has its own `name` and `score` (instance variables).

---

## 3. Static Variables

**What Are They?**  
Static variables are declared with the `static` keyword inside a class. There is only one copy of a static variable, which is shared by all objects of that class.

**Benefits:**
- **Shared Data:** Only one copy exists, making it ideal for data common to all objects.
- **Widely Accessible:** With proper access modifiers, static variables can be accessed from anywhere in the project.

**Downsides:**
- **Single Value for All:** Changing the value affects every object that uses it.
- **Long Lifetime:** They remain in memory for the duration of the program.

**When to Use Static Variables:**  
Use static variables for values that should be common to all objects, such as counters or shared settings. Often, static variables are declared as constants (using `final`) to prevent unwanted changes.

### Example: Counting the Number of Students
```java
class MathConstants {
  // A meaningful static variable that stores a constant value.
  static final double PI = 3.14159;
}

class TestMathConstants {
  public static void main(String[] args) {
    // Accessing the static variable from MathConstants without creating any object.
    System.out.println("Value of PI: " + MathConstants.PI);
  }
}
```
*Explanation:*  
The static variable `PI` in the MathConstants class is shared across the whole program. It is defined once and can be accessed directly using the class name without creating any object.
---

## Summary

- **Local Variables:**  
  Temporary variables declared inside blocks (like methods or loops). They exist only while that block is executing.

- **Instance Variables:**  
  Variables declared in a class for each object. They store unique details about an object and last as long as the object exists.

- **Static Variables:**  
  Shared variables declared with the `static` keyword. There is only one copy used by all objects, ideal for common data.

Happy coding!