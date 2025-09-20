# INTRODUCTION TO ACCESS MODIFIERS

## 1) WHAT IS AN ACCESS MODIFIER?

### Definition
Access modifiers are **keywords in Java** used to modify the accessibility of classes, methods, constructors, and variables. They determine which other classes or packages can interact with these components. The main access modifiers discussed here are:
- **private:** Accessible only within the class where it is declared.
- **Default (package-private):** Accessible only within the same package when no access modifier is specified.
- **public:** Accessible from any other class in any package.

*Note: The protected modifier (which allows access within the same package and by subclasses) will be discussed later in the context of inheritance.*

---

## 2) WHY DO WE NEED ACCESS MODIFIERS?

###  Purpose
Access modifiers are vital because they:
- **Enforce Encapsulation:** Protect the internal state of an object by restricting direct access to its data.
- **Enhance Security:** Prevent unauthorized modifications or misuse of sensitive data.
- **Improve Maintainability:** Allow developers to change implementation details without affecting other parts of the program.
- **Promote Modular Code:** Clearly delineate which parts of the code are available for interaction and which are kept hidden.

# ACCESS MODIFIERS: INSTANCE VARIABLES AND METHODS

This guide will show you how access modifiers affect both instance (and static) variables and methods.


---

## Example 1: Private Members

Private members (variables and methods) are accessible only within the class in which they are declared.

```java
class PrivateExample {
    // Private instance variable
    private int privateNumber = 42;
    // Private method
    private void privateMethod() {
        System.out.println("Private method called with value: " + privateNumber);
    }
    
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        // Accessing private members within the same class is allowed.
        obj.privateMethod();
        System.out.println("Accessing private variable: " + obj.privateNumber);
    }
}
```

*Explanation:*  
Since both `privateNumber` and `privateMethod()` are private, they can only be accessed within the `PrivateExample` class, as shown in the `main` method.

---

## Example 2: Default (Package-Private) Members

Default members, declared without any modifier, are accessible only within the same package.

```java
class DefaultExample {
    // Default instance variable (no modifier)
    int defaultNumber = 10;
    // Default method (no modifier)
    void defaultMethod() {
        System.out.println("Default method called with value: " + defaultNumber);
    }
    
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        // Accessing default members within the same class is allowed.
        obj.defaultMethod();
        System.out.println("Accessing default variable: " + obj.defaultNumber);
    }
}
```

*Explanation:*  
Because no access modifier is specified, `defaultNumber` and `defaultMethod()` are accessible within the same package. In this example, they are accessed from within the same class.

---

## Example 3: Public Members

Public members are accessible from any class, regardless of the package.

```java
class PublicExample {
    // Public instance variable
    public int publicNumber = 5;
    // Public method
    public void publicMethod() {
        System.out.println("Public method called with value: " + publicNumber);
    }
    
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        // Accessing public members is allowed from anywhere.
        obj.publicMethod();
        System.out.println("Accessing public variable: " + obj.publicNumber);
    }
}
```

*Explanation:*  
Since both `publicNumber` and `publicMethod()` are declared public, they can be accessed from any class, as demonstrated in the `main` method.

---



## REMEMBER
1. **Access modifiers control who can see or modify** your classes, methods, variables, constructors, and interfaces.
2. **private:** Accessible only within its own class (like your personal bedroom).
3. **Default:** Accessible only within the same package (like a shared living room).
4. **public:** Accessible from anywhere (like the front porch).

*Note: The protected modifier will be discussed later, after we cover inheritance.*

Happy coding!