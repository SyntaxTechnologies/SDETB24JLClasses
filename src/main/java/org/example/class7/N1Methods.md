# Methods in Java

## Objective
Learn what methods are in Java, why we need them, and how to create and use them. Methods allow you to encapsulate code into reusable blocks, making your programs easier to read, maintain, and debug.

---

## What Are Methods?
Methods in Java are blocks of code that perform specific tasks. They can:
- **Execute Actions:** Run a set of instructions.
- **Accept Parameters:** Take input values to work with.
- **Return Values:** Provide outputs based on processing.

### Why Do We Need Methods?
- **Modularity:** Break complex tasks into smaller, manageable pieces.
- **Reusability:** Write code once and reuse it multiple times.
- **Readability:** Organize code logically for easier understanding.
- **Maintainability:** Update code in one place rather than throughout your program.

---

## Components of a Method
A method in Java consists of several parts:
- **Return Type:** The type of value the method will return (for example, `int`, `String`, or `void` if it does not return any value).
- **Method Name:** The name you give to the method.
- **Parameters:** Optional input values the method can accept, written inside parentheses.
- **Method Header/Signature:** The complete declaration line of the method (which includes the return type, name, and parameters).
- **Method Body:** The block of code inside curly braces `{}` that defines what the method does.

For example, in the method declaration:
```java
void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
```
- **Return Type:** `void` (does not return a value)
- **Method Name:** `greet`
- **Parameters:** A single parameter of type `String` named `name`
- **Signature:** `void greet(String name)`
- **Body:**
  ```java
  {
      System.out.println("Hello, " + name + "!");
  }
  ```

---

## Simple Examples

### Example 1: Void Method with No Parameters
A basic method that prints a greeting message.
```java
class Example {
    // A simple instance method with no parameters and no return value
    void greet() {
        System.out.println("Hello, World!");
    }
    
    static void main(String[] args) {
        Example ex = new Example(); // Create an object of the Example class
        ex.greet();  // Calling the instance method
    }
}
```
*Explanation:*  
The `greet()` method does not take any parameters and simply prints "Hello, World!" when called.

---

### Example 2: Void Method with One Parameter
A method that prints a personalized greeting.
```java
class Example {
    // An instance method that takes one parameter (name) and prints a greeting
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    static void main(String[] args) {
        Example ex = new Example();
        ex.greet("Alice");  // Calling the method with a parameter
    }
}
```
*Explanation:*  
The `greet(String name)` method accepts a single parameter and uses it to print a customized greeting.

---

### Example 3: Void Method with Two Parameters
A method that prints a message multiple times.
```java
class BirthdayGreeting {
  // A simple method that takes a name and an age, then prints a birthday greeting.
  void celebrateBirthday(String name, int age) {
    System.out.println("Happy Birthday, " + name + "! You are " + age + " years old.");
  }

  static void main(String[] args) {
    BirthdayGreeting bg = new BirthdayGreeting();
    bg.celebrateBirthday("Alice", 30);
  }
}
```
*Explanation:*  
The `printMessage(String message, int times)` method takes two parameters—a string message and an integer specifying how many times to print the message. It uses a loop to print the message repeatedly.

---

### Example 4: Method with a Return Type (Integer Addition)
A method that adds two integers and returns the sum.
```java
class Example {
    // An instance method that takes two integers, adds them, and returns the result
    int add(int a, int b) {
        return a + b;
    }
    
    static void main(String[] args) {
        Example ex = new Example();
        int result = ex.add(5, 7);
        System.out.println("Sum: " + result);
    }
}
```
*Explanation:*  
The `add(int a, int b)` method returns an integer value that is the sum of the two parameters.

---

### Example 5: Method with a Return Type (String Concatenation)
A method that concatenates two strings and returns the result.
```java
class Example {
    // An instance method that takes two strings, concatenates them with a space, and returns the combined string
    String combine(String str1, String str2) {
        return str1 + " " + str2;
    }
    
    static void main(String[] args) {
        Example ex = new Example();
        String fullName = ex.combine("John", "Doe");
        System.out.println("Full Name: " + fullName);
    }
}
```
*Explanation:*  
The `combine(String str1, String str2)` method concatenates two strings and returns the new string.

---

## Summary
Methods in Java help you:
- **Encapsulate code** into reusable blocks.
- **Improve code clarity** by breaking tasks into smaller methods.
- **Promote reusability** by calling the same method with different parameters.
- **Enhance maintainability** by updating code in one place.

Happy coding!