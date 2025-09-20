# The `this` Keyword in Java

## Objective
Learn what the `this` keyword is in Java, why it is used, and how to use it in simple examples. The `this` keyword provides a way to reference the current object's fields, methods, or constructors.

---

## What is the `this` Keyword?
The `this` keyword in Java refers to the current object—the instance of the class in which it is used. It helps in:
- **Resolving Conflicts:** Differentiates between instance variables and parameters or local variables when they have the same name.
- **Constructor Chaining:** Can be used to call another constructor within the same class to reuse initialization code.

---

## Examples

### Example 1: Resolving Naming Conflicts
Using `this` to access an instance variable when a method parameter has the same name.

```java
class Person {
    String name;
    
    // Constructor with a parameter that has the same name as the instance variable
    Person(String name) {
        this.name = name; // 'this.name' refers to the instance variable, while 'name' is the parameter
    }
    
    void display() {
        System.out.println("Name: " + this.name);
    }
    
    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.display();
    }
}
```

*Explanation:*  
In this example, `this.name` is used to distinguish the instance variable from the constructor parameter that shares the same name.

---

### Example 2: Constructor Chaining
Using `this` to invoke another constructor in the same class to reuse initialization code.

```java
class Person {
    String name;
    int age;
    
    // Constructor that accepts both name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Constructor that accepts only name and sets a default age, using constructor chaining
    Person(String name) {
        this(name, 0); // Calls the above constructor with a default age of 0
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Alice");      // Uses constructor chaining; age defaults to 0
        Person p2 = new Person("Bob", 25);      // Directly calls the constructor with two parameters
        
        p1.display();
        p2.display();
    }
}
```

*Explanation:*  
In this example, the one-parameter constructor uses `this(name, 0)` to call the two-parameter constructor, thereby reusing the initialization code and setting a default age for the `Person`.

---

## Summary
The `this` keyword in Java is a powerful tool for accessing the current object's fields and methods, resolving naming conflicts, and supporting constructor chaining. Using `this` makes your code clearer, more maintainable, and easier to understand. Happy coding!