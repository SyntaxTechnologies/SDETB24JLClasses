## Type Casting in Java

## Objective

Quickly introduce object type casting so you’re ready to see it in action with polymorphism.

---

## What Is Object Type Casting?

1. **Create a Child Object**
   ```java
   Dog myDog = new Dog();
   ```  
    - A `Dog` instance is created with all its specific behaviors.

2. **Upcasting (Child → Parent)**
   ```java
   Animal a = myDog;
   ```  
    - You can store any subclass object in a variable of its superclass type without extra syntax.
    - Now `a` refers to the same `Dog` object, but you can only call methods defined in `Animal`.

3. **Why Upcasting?**
    - **Polymorphism:** Treat different subclasses uniformly as their common parent.
    - **API Flexibility:** Pass any `Animal` (dog, cat, etc.) to methods expecting `Animal`.

4. **Downcasting (Parent → Child)**
   ```java
   if (a instanceof Dog) {           // Step 1: Type check
       Dog d = (Dog) a;              // Step 2: Cast back to Dog
       d.bark();                     // Now you can call Dog-specific methods
   }
   ```  
    - **`instanceof` Check:** Ensures `a` really points to a `Dog`, preventing runtime errors.
    - **Explicit Cast:** Converts the reference back so you regain access to subclass methods.

5. **Why Use `instanceof`?**
    - Think of it like checking a guest’s name tag before letting them into the VIP room.
    - Avoids a `ClassCastException` by confirming the actual object type at runtime.

---

## Polymorphism in Java

## Objective
Learn how polymorphism allows you to write flexible code that works with different object types, just like using the same power switch for various appliances.

---

## What Is Polymorphism?
Polymorphism lets you write one piece of code that works with many related object types—just like using the same power switch for different appliances.

- **Polymorphism** means “many shapes.”
- A **superclass reference** (e.g., `Animal`) can point to **any subclass object** (e.g., `Dog`, `Cat`) and call the right method version automatically.

---

## Steps for a Simple Polymorphism Example

1. **Create a Subclass Instance**
   ```java
   Dog dog = new Dog();
   ```  
2. **Upcast to Superclass**
   ```java
   Animal a = dog;
   ```  
    - You now treat the `Dog` as an `Animal`.
3. **Call the Overridden Method**
   ```java
   a.makeSound();
   ```  
    - Even though `a` is declared as `Animal`, Java calls `Dog`’s `makeSound()` at runtime.
4. **Dynamic Binding**
    - The JVM looks at the actual object (`Dog`) and picks the correct overridden method.

### Simple Example

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

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcast
        a.makeSound();         // at runtime: Woof
    }
}
```

---

## Steps for an Array of Polymorphic Objects

1. **Declare an Array of Superclass References**
   ```java
   Animal[] animals = new Animal[3];
   ```  
2. **Populate with Subclass Instances**
   ```java
   animals[0] = new Dog();
   animals[1] = new Cat();
   animals[2] = new Animal();
   ```  
3. **Loop and Call the Method**
   ```java
   for (Animal x : animals) {
       x.makeSound();
   }
   ```  
4. **Runtime Selection**
    - Each call to `makeSound()` invokes the correct subclass version (or the superclass version if not overridden).

### Array Example

```java
public class Farm {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Animal()
        };
        for (Animal a : animals) {
            a.makeSound();  // Woof, Meow, Some animal noise
        }
    }
}
```

---

## Summary

- **Type Casting** lets you move between child and parent references safely.
- **Polymorphism** uses those parent references to call the right subclass methods at runtime.

Happy coding!
