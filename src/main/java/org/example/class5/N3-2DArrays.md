# 2D ARRAYS IN JAVA

## 1) WHAT ARE 2D ARRAYS?
A two-dimensional (2D) array is a data structure that stores data in a tabular form, essentially as an array of arrays. Each element in a 2D array is accessed by two indices: one for the row and one for the column.

## 2) WHY DO WE NEED 2D ARRAYS?
2D arrays are useful because they:
- **Store Tabular Data:** They allow you to represent data in rows and columns, like a grid or a matrix.
- **Organize Related Information:** You can use them to store information such as a table of numbers, a spreadsheet, or a game board.
- **Simplify Data Processing:** They make it easier to process multi-dimensional data using nested loops.

For example, instead of using multiple 1D arrays to represent rows of a table, you can use a single 2D array.

## 3) HOW DO WE USE 2D ARRAYS? (EXAMPLES)

### Example #1: Creating and Accessing a 2D Array of Integers
```java
// Declare and initialize a 2D array with fixed integer values
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Access and print an element from the 2D array
// For example, print the element at row 2, column 3 (indices 1 and 2)
System.out.println(matrix[1][2]); // Output: 6
```

### Example #2: Iterating Over a 2D Array Using Nested For Loops
```java
// Declare and initialize a 2D array with fixed integer values
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Use nested for loops to iterate over the 2D array and print each element
for (int i = 0; i < matrix.length; i++) {
    // For each row, iterate over the columns
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    // Move to a new line after printing all columns in the current row
    System.out.println();
}
// Expected Output:
// 1 2 3
// 4 5 6
// 7 8 9
```

### Example #3: Summing All Elements in a 2D Array
```java
// Declare and initialize a 2D array with fixed integer values
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Initialize a variable to hold the total sum
int totalSum = 0;
// Use nested for loops to traverse the 2D array and add each element to totalSum
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        totalSum += matrix[i][j];
    }
}
// Print the total sum of all elements
System.out.println("Total Sum: " + totalSum);
// Expected Output: Total Sum: 45
```

### Example #4: Calculating the Sum of Each Row in a 2D Array
```java
// Declare and initialize a 2D array with fixed integer values
int[][] matrix = {
    {3, 5, 2},
    {1, 4, 7},
    {6, 0, 9}
};
// Use nested for loops to calculate and print the sum of each row
for (int i = 0; i < matrix.length; i++) {
    int rowSum = 0; // Initialize sum for the current row
    for (int j = 0; j < matrix[i].length; j++) {
        rowSum += matrix[i][j];
    }
    // Print the sum for the current row (rows are numbered starting at 1 for output)
    System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
}
// Expected Output:
// Sum of row 1: 10
// Sum of row 2: 12
// Sum of row 3: 15
```

## 4) COMMON MISTAKES

### Mistake #1: Accessing Elements Out of Bounds
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Incorrect: Trying to access an element with an invalid index will cause an error
System.out.println(matrix[3][0]); // There is no row with index 3
```
*Issue*: Valid row indices are from 0 to `matrix.length - 1` and column indices from 0 to `matrix[i].length - 1`.

**Tip**: Always check the dimensions of your 2D array before accessing an element.

### Mistake #2: Incorrect Loop Conditions
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Incorrect: Using <= in the loop condition will attempt to access an invalid index
for (int i = 0; i <= matrix.length; i++) {
    for (int j = 0; j <= matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```
*Issue*: The loop conditions should use `<` instead of `<=` because indices start at 0.

**Corrected Example:**
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## 5) LIMITATIONS OF 2D ARRAYS

- **Fixed Dimensions:**  
  Once a 2D array is created, its number of rows and columns cannot be changed. You need to know these dimensions in advance.

  **Example:**
  ```java
  int[][] matrix = new int[3][4]; // This 2D array has 3 rows and 4 columns.
  ```

- **Homogeneous Elements:**  
  A 2D array can store only values of a single type. To store mixed types, consider using other data structures.

- **Limited Built-in Operations:**  
  2D arrays have a fixed structure and do not support dynamic resizing or direct operations such as adding or removing rows/columns.

> **Note**: 2D arrays in Java are essential for representing and managing tabular data. Practice these examples to become comfortable with declaring, initializing, and iterating over 2D arrays using nested for loops.