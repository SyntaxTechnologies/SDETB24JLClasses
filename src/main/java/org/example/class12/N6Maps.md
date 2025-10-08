## Map in Java Collections Framework

## Objective
Learn how to use `Map` in Java to store key–value pairs, allowing fast access and manipulation of data based on unique keys.

## What Is Map?
Think of a `Map` like a dictionary—you look up a word (key) to find its definition (value). In Java, `Map` stores unique keys with associated values, making it easy to fetch, update, or remove entries by key.
- A **collection** of **key–value pairs**.
- Keys are unique; values can repeat.
- Common implementations:
    - `HashMap` (no order)
    - `LinkedHashMap` (insertion order)
    - `TreeMap` (sorted by key)

---

## Why Use Map?

- **Fast Lookup:** Retrieve values by key instantly.
- **Association:** Perfect for any data that pairs a unique identifier to a value.
- **Flexible Iteration:** Loop through keys, values, or key–value entries.

---

## How to Use Map

1. **Import and Declare**
   ```java
   import java.util.Map;
   import java.util.HashMap;
   Map<String, Integer> map = new HashMap<>();
   ```
2. **Add or Update Entries**
   ```java
   map.put("Alice", 30);
   map.put("Bob", 25);
   map.put("Alice", 31); // updates Alice’s value
   ```
3. **Retrieve or Remove**
   ```java
   int age = map.get("Alice");        // returns 31
   map.remove("Bob");                 // removes Bob entry
   ```
4. **Check and Iterate**
   ```java
   boolean hasAlice = map.containsKey("Alice");  
   for (String name : map.keySet()) { 
       System.out.println(name + ": " + map.get(name)); 
   }
   ```

---

## Common Methods with Examples

### put(K key, V value)
```java
map.put("Charlie", 28); // add or overwrite
```

### get(Object key)
```java
Integer val = map.get("Charlie"); // 28 or null if absent
```

### getOrDefault(K key, V defaultValue)
```java
int age = map.getOrDefault("Dave", 0); // returns 0 if "Dave" not in map
```

### putIfAbsent(K key, V value)
```java
map.putIfAbsent("Eve", 22); // only adds if key missing
```

### remove(Object key)
```java
map.remove("Charlie"); // removes entry, returns previous value
```

### containsKey(Object key)
```java
boolean hasEve = map.containsKey("Eve");
```

### containsValue(Object value)
```java
boolean hasValue31 = map.containsValue(31);
```

### size()
```java
int count = map.size(); // number of entries
```

### isEmpty()
```java
boolean empty = map.isEmpty();
```

### clear()
```java
map.clear(); // removes all entries
```

### keySet(), values(), entrySet()
```java
Set<String> keys = map.keySet();
Collection<Integer> ages = map.values();
Set<Map.Entry<String,Integer>> entries = map.entrySet();
```

### forEach(BiConsumer<? super K,? super V> action)
```java
map.forEach((name, age) -> System.out.println(name + " is " + age));
```

---

## Practical Example

```java
import java.util.Map;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.putIfAbsent("Charlie", 28);

        System.out.println(map.getOrDefault("Dave", -1)); // -1
        map.forEach((name, age) -> System.out.println(name + ": " + age));

        map.remove("Bob");
        System.out.println("Contains Charlie? " + map.containsKey("Charlie")); // true
        System.out.println("Map size: " + map.size()); // 2
    }
}
```

---

## Comparing Map Implementations

- **HashMap**
    - No guaranteed order.
    - Fastest for general-purpose use (`O(1)` average for get/put).

- **LinkedHashMap**
    - Maintains insertion order.
    - Slightly slower than `HashMap` but predictable iteration.

- **TreeMap**
    - Stores keys in sorted order (natural or via `Comparator`).
    - Operations cost `O(log n)`, useful when you need sorted keys.

---

## Summary

- **Map** links unique keys to values for fast lookup.
- Use **HashMap** for speed, **LinkedHashMap** for order, **TreeMap** for sorting.
- Common methods: `put`, `get`, `remove`, `containsKey`, `keySet`, and `forEach`.

Happy coding!