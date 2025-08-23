# WHILE LOOPS IN JAVA

## 1) WHAT ARE WHILE LOOPS?
A while loop is a control flow statement that repeatedly executes a block of code as long as a given condition remains true. The condition is evaluated before each iteration; if it is true, the loop body executes. Once the condition becomes false, the loop terminates.

## 2) WHY DO WE NEED WHILE LOOPS?
While loops are useful because they:
- **Handle Repetition:** They allow you to execute a block of code repeatedly as long as a condition is met.
- **Deal with Unknown Iteration Counts:** They are ideal when the number of iterations is not known beforehand.
- **Control Program Flow:** They help in scenarios where the continuation of the loop depends on dynamic conditions, such as user input or external events.

## 3) HOW DO WE USE WHILE LOOPS? (EXAMPLES)

### Example #1: Print "Hello World" 5 Times
```java
int count = 0;
while (count < 5) {
    System.out.println("Hello World");
    count++;
}
```
**Output:**
- Prints "Hello World" on 5 separate lines.

### Example #2: Print Numbers from 0 to 5
```java
int number = 0;
while (number <= 5) {
    System.out.println(number);
    number++;
}
```
**Output:**
- Prints: 0, 1, 2, 3, 4, 5 (each on a new line)

### Example #3: Print Numbers in Reverse from 5 to 0
```java
int number = 5;
while (number >= 0) {
    System.out.println(number);
    number--;
}
```
**Output:**
- Prints: 5, 4, 3, 2, 1, 0 (each on a new line)

## 4) COMMON MISTAKES

### Mistake #1: Forgetting to Update the Loop Variable
**Incorrect Example:**
```java
int count = 0;
while (count < 5) {
    System.out.println("Hello World");
    // Missing count++ leads to an infinite loop.
}
```
*Issue*: Without updating the loop variable, the condition remains true indefinitely, resulting in an infinite loop.

**Corrected Example:**
```java
int count = 0;
while (count < 5) {
    System.out.println("Hello World");
    count++;
}
```

### Mistake #2: Incorrect Loop Condition
**Incorrect Example:**
```java
int number = 0;
while (number > 5) {  // This condition is false initially.
    System.out.println(number);
    number++;
}
```
*Issue*: If the loop condition is set incorrectly, the loop body may never execute.

## 5) LIMITATIONS OF WHILE LOOPS

- **Manual Management of Loop Variables:**  
  While loops require explicit initialization and updating of the loop variable, which can be error-prone.

  **Example of a Potential Pitfall:**
  ```java
  int count = 0;
  while (count < 5) {
      System.out.println("Hello World");
      // Forgetting to increment count can lead to an infinite loop.
  }
  ```

- **Not Ideal for Fixed-Count Iterations:**  
  When you know the exact number of iterations in advance, a for loop may be more concise and clear.

- **Potential for Infinite Loops:**  
  If the loop condition is never met or the loop variable is not updated correctly, the while loop can run indefinitely.

&gt; **Note**: While loops in Java are a flexible tool for repeated execution based on dynamic conditions. However, they require careful handling of loop variables and conditions to avoid common pitfalls such as infinite loops.