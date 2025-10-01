## ArrayList in Java Collections Framework

## Objective

Learn how to use `ArrayList` in Java to create dynamic lists that can grow and shrink as needed, making it easy to manage collections of objects.


## What Is ArrayList?
Think of an `ArrayList` like a resizable grocery list—you can add items, peek at them by position, replace or remove them, and check what’s on your list. In Java, `ArrayList` is a dynamic array implementation in the Collections Framework.
- A **resizable array** implementation of the `List` interface.
- Stores elements in insertion order.
- Automatically grows as you add elements.

---

## Why Use ArrayList?

- **Dynamic Size:** No need to specify capacity up front.
- **Indexed Access:** Fast retrieval by index (`get(index)`).
- **Rich API:** Many built-in methods to manipulate your list.

---

## How to Use ArrayList

1. **Import and Declare**
   ```java
   import java.util.ArrayList;
   ArrayList<String> list = new ArrayList<>();
   ```
2. **Add Elements**
   ```java
   list.add("Apple");
   list.add("Banana");
   ```
3. **Access Elements**
   ```java
   String first = list.get(0); // "Apple"
   ```

---

## Common Methods with Examples

### add(E element)
```java
list.add("Cherry"); // appends to end
```

### add(int index, E element)
```java
list.add(1, "Blueberry"); // inserts at position 1
```

### get(int index)
```java
String item = list.get(2); // retrieves element at index 2
```

### set(int index, E element)
```java
list.set(0, "Apricot"); // replaces element at index 0
```

### remove(int index)
```java
list.remove(1); // removes element at index 1
```

### remove(Object o)
```java
list.remove("Cherry"); // removes first occurrence of "Cherry"
```

### size()
```java
int count = list.size(); // number of elements
```

### isEmpty()
```java
boolean empty = list.isEmpty(); // true if size() == 0
```

### contains(Object o)
```java
boolean hasBanana = list.contains("Banana");
```

### indexOf(Object o)
```java
int idx = list.indexOf("Apricot"); // returns index or -1
```

### lastIndexOf(Object o)
```java
list.add("Banana");
int last = list.lastIndexOf("Banana"); // last position of "Banana"
```

### clear()
```java
list.clear(); // removes all elements
```

### toArray()
```java
Object[] arr = list.toArray();
```

### iteration
```java
for (String fruit : list) {
    System.out.println(fruit);
}
```

---

## Simple Complete Example

```java
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Blueberry");
        System.out.println(list.get(0));         // Apple
        list.set(2, "Cherry");
        list.remove("Banana");
        System.out.println(list.contains("Cherry")); // true
        System.out.println(list.size());            // 2
        list.clear();
        System.out.println(list.isEmpty());         // true
    }
}
```

---

## Summary

- `ArrayList` is your go-to for a flexible, indexed list.
- Use `add`, `get`, `set`, `remove`, and others to manage elements.
- Iteration and utility methods make it powerful and easy to use.

Happy coding!