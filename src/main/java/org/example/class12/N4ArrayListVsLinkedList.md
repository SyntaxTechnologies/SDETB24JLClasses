## ArrayList vs LinkedList Performance

## Objective

Help you choose the right list by showing which actions are quick on each.

---

## Fast with ArrayList

- **Get by index (random access):** Grabbing an item by its position is very quick (like opening a book to a specific page).
- **Iterating in order:** Walking through all items one by one is smooth.
- **Add at end:** Appending something to the back is usually fast.

## Fast with LinkedList

- **Add or remove at the ends:** Inserting or removing at the front or back is quick (like adding or removing cars at the ends of a train).
- **Insert or remove in the middle (if you’re already there):** Once you have a spot (using an iterator), you can slip items in or out without shifting everything.

## Slower Operations

- **ArrayList:** Inserting or removing at the start or middle can be slow because it has to shift all following items over.
- **LinkedList:** Getting an item by position is slower because it has to walk through each link until it finds the right one.

---

## Practical Example

```java
import java.util.*;

public class PerformanceDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 1. Add elements at the end
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long arrayEndTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        long linkedEndTime = System.nanoTime() - start;

        System.out.println("Add at end - ArrayList: " + arrayEndTime + " ns");
        System.out.println("Add at end - LinkedList: " + linkedEndTime + " ns");

        // 2. Get elements by index
        start = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long arrayGetTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long linkedGetTime = System.nanoTime() - start;

        System.out.println("Get by index - ArrayList: " + arrayGetTime + " ns");
        System.out.println("Get by index - LinkedList: " + linkedGetTime + " ns");
    }
}
```

> **What you’ll see:**
> - **Add at end:** Times are similar, but `ArrayList` may be slightly faster.
> - **Get by index:** `ArrayList` is much faster because it can jump directly to the element, while `LinkedList` walks through each link.

---

## Summary

- Use **ArrayList** when you do a lot of lookups by position and mostly add at the end.
- Use **LinkedList** when you frequently add/remove at the front or back (or middle) and don’t need random access.

Happy coding!