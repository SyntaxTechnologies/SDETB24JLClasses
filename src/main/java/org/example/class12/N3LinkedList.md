## LinkedList in Java Collections Framework

## Objective
Learn how to use `LinkedList` in Java to create flexible lists that allow fast insertions and removals, especially at both ends, making it ideal for queue and stack operations.

## What Is LinkedList?
Think of a `LinkedList` like a train of connected carriages—you can easily add or remove cars at either end. In Java, `LinkedList` implements the `List` and `Deque` interfaces, offering fast insertions/removals and double-ended operations.

---

## Why Use LinkedList?

- **Fast End Operations:** `addFirst`, `addLast`, `removeFirst`, `removeLast` are O(1).
- **Flexible Inserts/Removals:** Insert or remove anywhere by node pointer adjustments.

---

## How to Use LinkedList

1. **Import and Declare**
   ```java
   import java.util.LinkedList;
   LinkedList<String> list = new LinkedList<>();
   ```
2. **Add Elements**
   ```java
   list.add("A");            // end
   list.addFirst("Start");   // front
   list.addLast("End");      // back
   ```
3. **Access Elements**
   ```java
   String first = list.getFirst();  // "Start"
   String last  = list.getLast();   // "End"
   String mid   = list.get(1);      // "A"
   ```

---

## Common Methods with Examples

### add(E element)
```java
list.add("B");          // appends to end
```

### add(int index, E element)
```java
list.add(1, "C");       // inserts at position 1
```

### addFirst(E element)
```java
list.addFirst("X");     // adds at front
```

### addLast(E element)
```java
list.addLast("Y");      // adds at end
```

### get(int index)
```java
String item = list.get(2);
```

### getFirst(), getLast()
```java
String f = list.getFirst();
String l = list.getLast();
```

### set(int index, E element)
```java
list.set(0, "Z");       // replaces element at index 0
```

### remove(int index)
```java
list.remove(2);         // removes element at index 2
```

### remove(Object o)
```java
list.remove("B");       // removes first occurrence of "B"
```

### removeFirst(), removeLast()
```java
list.removeFirst();     // removes front element
list.removeLast();      // removes last element
```

### size()
```java
int count = list.size();
```

### isEmpty()
```java
boolean empty = list.isEmpty();
```

### contains(Object o)
```java
boolean hasZ = list.contains("Z");
```

### indexOf(Object o), lastIndexOf(Object o)
```java
int idx = list.indexOf("C");
int last = list.lastIndexOf("C");
```

### clear()
```java
list.clear();           // removes all elements
```

### toArray()
```java
Object[] arr = list.toArray();
```

### Queue/Deque Operations: peek, poll, push, pop

```java
String head = list.peek();   // views first, no remove
String polled = list.poll(); // removes and returns first
list.push("New");            // adds at front
String popped = list.pop();  // removes and returns front
```

### Iteration

```java
for (String s : list) {
    System.out.println(s);
}
```

---

## Simple Complete Example

```java
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.addFirst("Start");
        list.addLast("End");
        list.add(1, "Middle");
        System.out.println(list.getFirst());   // Start
        System.out.println(list.get(2));       // A
        list.set(2, "Alpha");
        list.remove("Middle");
        list.removeLast();
        System.out.println(list.contains("Alpha")); // true
        System.out.println(list.size());            // 2
        list.clear();
        System.out.println(list.isEmpty());         // true
    }
}
```

---

## Summary

- `LinkedList` is ideal for fast insertions/removals at both ends.
- Offers `List` and `Deque` methods for versatile usage.
- Choose it when you need frequent modifications rather than random access.

Happy coding!