# Nested Loops in Java

## 1) WHAT ARE NESTED LOOPS?
Nested loops are loops that exist inside another loop. The inner loop runs completely for every single iteration of the outer loop. They are very useful for working with multi-dimensional data (such as matrices) or when you need to generate complex patterns.

## 2) WHY DO WE NEED NESTED LOOPS?
Nested loops are used because they:
- **Allow Multi-Dimensional Traversal:** For example, iterating over each row and column of a 2D array.
- **Generate Complex Patterns:** They are ideal for creating patterns, such as triangles, grids, or other shapes.
- **Solve Problems with Multiple Levels of Iteration:** Problems that require one level of iteration for one task and another level for a sub-task.

## 3) HOW TO USE NESTED LOOPS (EXAMPLES)

### Example 1: Nested While Loops
This example uses nested while loops to print a simple pattern of numbers.
```java
// Print a pattern of numbers using nested while loops
int i = 1;
while (i <= 3) {  // Outer loop: controls the number of rows
    int j = 1;
    while (j <= 3) {  // Inner loop: controls the numbers in each row
        System.out.print(j + " ");
        j++;
    }
    System.out.println();  // Move to the next line after finishing a row
    i++;
}
// Expected Output:
// 1 2 3 
// 1 2 3 
// 1 2 3 
```

### Example 2: Nested For Loops
This example uses nested for loops to iterate over a 2D array (matrix) and print its elements.
```java
// Declare and initialize a 2D array (matrix)
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Use nested for loops to traverse and print the 2D array
for (int i = 0; i < matrix.length; i++) {           // Outer loop: iterates over rows
    for (int j = 0; j < matrix[i].length; j++) {      // Inner loop: iterates over columns in each row
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();  // Newline after each row is printed
}
// Expected Output:
// 1 2 3 
// 4 5 6 
// 7 8 9 
```

### Example 3: Nested Enhanced For Loops
This example uses nested enhanced for loops to iterate over a 2D array of strings and print each string.
```java
// Declare and initialize a 2D array of strings
String[][] words = {
    {"Hello", "World"},
    {"Java", "Programming"},
    {"Nested", "Loops"}
};

// Use nested enhanced for loops to print each word
for (String[] row : words) {              // Outer loop: iterates over each row (an array of strings)
    for (String word : row) {             // Inner loop: iterates over each word in the current row
        System.out.print(word + " ");
    }
    System.out.println();  // Newline after each row is printed
}
// Expected Output:
// Hello World 
// Java Programming 
// Nested Loops 
```

## 4) COMMON MISTAKES
- **Incorrect Loop Boundaries:**  
  Not setting the correct start and end conditions can lead to missing elements or infinite loops.

- **Forgetting to Reset Inner Loop Variables:**  
  In nested while loops, the inner loop variable must be re-initialized at the beginning of each outer loop iteration.

- **Index Errors:**  
  When working with arrays, ensure you do not access an index that is out of bounds.

## 5) LIMITATIONS AND TIPS
- **Performance Considerations:**  
  Nested loops can lead to increased time complexity. For large data sets, be mindful of performance.

- **Readability:**  
  Too many nested loops can make code hard to read. Consider breaking complex loops into helper methods.

- **Debugging:**  
  If your nested loops are not working as expected, try printing loop counters (like `i` and `j`) to understand how many times each loop is executing.

> **Note**: Nested loops are a powerful tool in Java. Start by understanding simple examples like these, and gradually work your way to more complex problems. Practice is key to mastering nested loop constructs!