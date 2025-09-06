# Break and Continue in Java

## 1) WHAT ARE BREAK AND CONTINUE KEYWORDS?
In Java, the **break** and **continue** keywords change the normal flow of control in loops:
- **Break:** Immediately exits the loop or switch statement.
- **Continue:** Skips the rest of the current loop iteration and proceeds with the next iteration.

## 2) WHY USE BREAK AND CONTINUE KEYWORDS?
These keywords help to:
- **Improve Readability:** Clearly indicate when a loop should terminate or skip an iteration.
- **Simplify Code:** Remove the need for extra conditional logic within loops.
- **Improves performance:** Skips extra iterations to minimize needless processing.

## 3) HOW TO USE BREAK AND CONTINUE (SIMPLE EXAMPLES)

### Example #1: Using Break in a Loop
```java
// Loop from 0 to 4, but exit the loop when i equals 3
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break; // Exit the loop when i is 3
    }
    System.out.println(i);
}
// Expected Output:
// 0
// 1
// 2
```

### Example #2: Using Continue in a Loop
```java
// Loop from 0 to 4, but skip printing when i equals 2
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // Skip this iteration when i is 2
    }
    System.out.println(i);
}
// Expected Output:
// 0
// 1
// 3
// 4
```

## 4) ADDITIONAL SIMPLE EXAMPLES

### Example #3: Using Break in a While Loop
```java
// Use a while loop to print numbers until count equals 3, then break out of the loop
int count = 0;
while (count < 5) {
    if (count == 3) {
        break; // Exit the loop when count is 3
    }
    System.out.println(count);
    count++;
}
// Expected Output:
// 0
// 1
// 2
```

## 5) COMMON MISTAKES

# Mistake #2: Excessive Use of  and Continue
- **Issue:**  
  Overusing continue can make loop logic harder to understand.
- **Tip:**  
  Consider restructuring your code with if-else statements for better clarity.

## 6) LIMITATIONS

- **Break:**
    - Only exits the current loop or switch statement.

- **Continue:**
    - Only skips the current iteration; the loop continues with the next cycle.
    - Overusing it might reduce the clarity of your loop logic.

