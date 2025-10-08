## Set in Java Collections Framework

## Objective
Learn how to use `Set` in Java to manage collections of unique elements, ensuring no duplicates and enabling efficient operations like checking presence and removing items based on conditions.

## What Is Set?
Think of a `Set` like a bag where you throw in items but duplicates just bounce out. In Java, `Set` is a collection that holds unique elements—perfect when you need to ensure no repeats.
- A **collection** that does **not allow duplicates**—each element appears only once.
- Common implementations:
    - `HashSet` (no order)
    - `LinkedHashSet` (insertion order)
    - `TreeSet` (sorted order)

---

## Why Use Set?

- **Uniqueness:** Automatically enforce no duplicate entries.
- **Fast Lookup:** Check presence of an item quickly.
- **Simple Removal:** Use lambdas to drop items based on conditions.

---

## How to Use Set

1. **Import and Declare**
   ```java
   import java.util.Set;
   import java.util.HashSet;
   Set<String> fruits = new HashSet<>();
   ```
2. **Add Elements**
   ```java
   fruits.add("Apple");
   fruits.add("Banana");
   fruits.add("Apple"); // duplicate ignored
   ```
3. **Check and Remove**
   ```java
   fruits.contains("Banana");    // true or false
   fruits.remove("Apple");       // removes that element
   ```

---

## Common Methods

### add(E element)
```java
fruits.add("Cherry"); // true if added, false if duplicate
```

### remove(Object o)
```java
fruits.remove("Banana"); // true if present
```

### contains(Object o)
```java
boolean hasApple = fruits.contains("Apple");
```

### size()
```java
int count = fruits.size(); // number of unique elements
```

### isEmpty()
```java
boolean empty = fruits.isEmpty();
```

### clear()
```java
fruits.clear(); // removes all elements
```

### removeIf(Predicate<? super E> filter)
Use a lambda to remove items matching a condition.
```java
// Remove all fruits that start with "B"
fruits.removeIf(fruit -> fruit.startsWith("B"));

// Remove any fruit name longer than 5 characters
fruits.removeIf(fruit -> fruit.length() > 5);
```

---

## Practical Example

```java
import java.util.Set;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);            // [Apple, Banana, Cherry]

        // Remove elements with removeIf
        fruits.removeIf(f -> f.startsWith("B"));
        System.out.println(fruits);            // [Apple, Cherry]

        // Clear all
        fruits.clear();
        System.out.println(fruits.isEmpty());  // true
    }
}
```

---

## Comparing Set Implementations

- **HashSet**
    - No guaranteed order.
    - Best for pure speed on `add`, `remove`, `contains`.

- **LinkedHashSet**
    - Maintains insertion order.
    - Slightly slower than `HashSet`, but predictable iteration.

- **TreeSet**
    - Keeps elements sorted (natural order or via `Comparator`).
    - Operations are logarithmic time; useful when you need sorted data.

---

## Summary

- **Set** ensures **unique** elements—no duplicates slip through.
- Use **lambdas** (`removeIf`) for concise conditional removal.
- Choose your implementation based on order and performance needs:
    - `HashSet` for speed,
    - `LinkedHashSet` for insertion order,
    - `TreeSet` for sorted order.

Happy coding!