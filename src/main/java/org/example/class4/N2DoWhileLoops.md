# DO WHILE LOOPS IN JAVA

## 1) WHAT ARE DO WHILE LOOPS?
A do while loop is a control flow statement that executes a block of code at least once before checking its condition. After the initial execution, the condition is evaluated; if it is true, the loop continues, otherwise it terminates.

## 2) WHY DO WE NEED DO WHILE LOOPS?
Do while loops are useful because they:
- **Guarantee Execution:** They ensure that the loop body is executed at least once, which is ideal for scenarios like user input validation.
- **Handle Post-Test Conditions:** They are useful when the condition to continue looping should be checked after the loop body has executed.
- **Simplify Certain Algorithms:** They help in situations where the initial execution is required regardless of the condition.

## 3) HOW DO WE USE DO WHILE LOOPS? (EXAMPLES)

### Example #1: Print "Hello World" 5 Times
```java
int count = 0;
do {
    System.out.println("Hello World");
    count++;
} while (count < 5);
```
**Output:**
- Prints "Hello World" on 5 separate lines.

### Example #2: Print Numbers from 0 to 5
```java
int number = 0;
do {
    System.out.println(number);
    number++;
} while (number <= 5);
```
**Output:**
- Prints: 0, 1, 2, 3, 4, 5 (each on a new line)

### Example #3: Print Numbers in Reverse from 5 to 0
```java
int number = 5;
do {
    System.out.println(number);
    number--;
} while (number >= 0);
```
**Output:**
- Prints: 5, 4, 3, 2, 1, 0 (each on a new line)

## 4) COMMON MISTAKES

### Mistake #1: Forgetting to Update the Loop Variable
**Incorrect Example:**
```java
int count = 0;
do {
    System.out.println("Hello World");
    // Missing count++ leads to an infinite loop.
} while (count < 5);
```
*Issue*: Without updating the loop variable, the condition never becomes false, resulting in an infinite loop.

**Corrected Example:**
```java
int count = 0;
do {
    System.out.println("Hello World");
    count++;
} while (count < 5);
```

### Mistake #2: Incorrect Loop Condition
**Example:**
```java
int number = 0;
do {
    System.out.println(number);
    number++;
} while (number > 5);
```
*Issue*: Even though the condition is false at the start, the loop body executes once because a do while loop always runs at least once.

## 5) LIMITATIONS OF DO WHILE LOOPS

- **Guaranteed Single Execution:**  
  Since the loop body executes at least once regardless of the condition, it may not be ideal when you want to avoid any execution if the condition is initially false.

- **Manual Management of Loop Variables:**  
  Like while loops, you must manually initialize and update loop variables, which can lead to errors such as infinite loops if not handled correctly.

- **Less Suitable for Iterating Over Collections:**  
  When iterating over collections or arrays, for loops or enhanced for loops are typically more concise and less error-prone.

&gt; **Note**: Do while loops in Java ensure that the loop body is executed at least once, which is useful for input validation and menu-driven programs. However, this behavior can be a limitation when you require that the loop should not run if the condition is false from the outset.