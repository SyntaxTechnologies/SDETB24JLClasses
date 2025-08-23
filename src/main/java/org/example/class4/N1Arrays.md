# 1D ARRAYS IN JAVA

## 1) WHAT ARE 1D ARRAYS?
A one-dimensional (1D) array is a data structure that stores a fixed number of values of a single type in a contiguous block of memory. It allows you to access each element using an index, where the first element is always at index 0.

## 2) WHY DO WE NEED 1D ARRAYS?
1D arrays are useful because they:
- **Store Multiple Values:** They let you group related data together in a single variable.
- **Provide Fast Access:** You can quickly retrieve or update any element using its index.
- **Simplify Data Management:** Arrays make it easier to process collections of data using loops.

For example, instead of declaring separate variables for multiple scores, you can store all scores in an array and process them with a loop.

## 3) HOW DO WE USE 1D ARRAYS? (EXAMPLES)

### Example #1: Creating and Accessing an Array of Integers
```java
// Declare and initialize a 1D array with fixed integer values
int[] numbers = {45, 78, 12, 67, 55};
// Access and print the first element of the array (index 0)
System.out.println(numbers[0]); // Output: 45
```

### Example #2: Iterating Over an Integer Array Using a For Loop
```java
// Declare and initialize a 1D array with fixed integer values
int[] numbers = {45, 78, 12, 67, 55};
// Use a normal for loop to iterate over the array and print each element on the same line
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
// Expected Output: 45 78 12 67 55
```

### Example #3: Iterating Over a String Array Using a Normal For Loop
```java
// Declare and initialize a 1D array with fixed String values
String[] names = {"Alice", "Bob", "Charlie"};
// Use a normal for loop to iterate over the array and print each name on a new line
for (int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
// Expected Output:
// Alice
// Bob
// Charlie
```

### Example #4: Iterating Over a Double Array Using a Normal For Loop
```java
// Declare and initialize a 1D array with fixed double values
double[] prices = {19.99, 29.99, 39.99, 49.99};
// Use a normal for loop to iterate over the array and print each price on a new line
for (int i = 0; i < prices.length; i++) {
    System.out.println(prices[i]);
}
// Expected Output:
// 19.99
// 29.99
// 39.99
// 49.99
```

### Example #5: Summing All Elements in an Array
```java
// Declare and initialize a 1D array with fixed integer values
int[] scores = {10, 20, 30, 40, 50};
// Initialize a variable to hold the total sum
int total = 0;
// Use a normal for loop to add each element to the total sum
for (int i = 0; i < scores.length; i++) {
    total += scores[i];
}
// Print the total sum
System.out.println("Total Sum: " + total);
// Expected Output: Total Sum: 150
```

### Example #6: Finding the Largest Number in an Array
```java
// Declare and initialize a 1D array with fixed integer values
int[] numbers = {45, 78, 12, 67, 55};
// Assume the first element is the largest
int largest = numbers[0];
// Use a normal for loop to check each element and update the largest number if necessary
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > largest) {
        largest = numbers[i];
    }
}
// Print the largest number
System.out.println("Largest Number: " + largest);
// Expected Output: Largest Number: 78
```

### Example #7: Printing Only Even Numbers from an Array
```java
// Declare and initialize a 1D array with fixed integer values
int[] data = {45, 78, 12, 67, 55, 82, 33};
// Use a normal for loop to print only the even numbers
for (int i = 0; i < data.length; i++) {
    if (data[i] % 2 == 0) {
        System.out.print(data[i] + " ");
    }
}
// Expected Output: 78 12 82
```

## 4) COMMON MISTAKES

### Mistake #1: Accessing Array Elements Out of Bounds
```java
int[] numbers = {45, 78, 12, 67, 55};
// Incorrect: Accessing index 5 causes an ArrayIndexOutOfBoundsException
System.out.println(numbers[5]);
```
*Issue*: Array indices start at 0, so valid indices for an array of length 5 are 0 to 4.

**Tip**: Always ensure that your index is between 0 and `array.length - 1`.

### Mistake #2: Forgetting to Initialize the Array
```java
int[] numbers;
// Incorrect: The array 'numbers' is declared but not initialized
numbers[0] = 45;
```
*Issue*: You must allocate memory for the array before you can store values in it.

**Tip**: Initialize the array when declaring it, e.g., `int[] numbers = {45, 78, 12, 67, 55};` or using `new`.

### Mistake #3: Using Incorrect Loop Conditions
```java
int[] numbers = {45, 78, 12, 67, 55};
// Incorrect: Using <= in the loop condition will try to access an invalid index
for (int i = 0; i <= numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
```
*Issue*: The condition should use `<` instead of `<=` because valid indices are from 0 to `numbers.length - 1`.

**Corrected Example:**
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
```

## 5) LIMITATIONS OF 1D ARRAYS

- **Fixed Size:**  
  Once a 1D array is created, its size cannot be changed. You need to know the number of elements in advance.

  **Example:**
  ```java
  int[] numbers = new int[5]; // This array can hold only 5 elements.
  ```

- **Homogeneous Elements:**  
  A 1D array can store only values of a single type. If you need to store mixed types, you must consider using other data structures.

- **Limited Built-in Operations:**  
  Arrays do not support dynamic operations such as adding or removing elements. For more flexibility, consider using classes like `ArrayList`.

> **Note**: 1D arrays in Java are a fundamental tool for storing and managing a fixed number of elements of the same type. Practice these examples to become comfortable with array declaration, initialization, and iteration.