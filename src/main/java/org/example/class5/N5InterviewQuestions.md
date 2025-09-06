# Coding Interview Practice: Pseudocode for Common Array and Loop Tasks

## Introduction
When approaching programming problems, especially those involving arrays and loops, it’s helpful to think of the array as a "black box" or a sack of balls. You can inspect each ball one at a time. Start by understanding the problem, then write pseudocode in plain language before translating it into Java code.

---

## Problem 1: Finding the Smallest Number
**Task:** Pick out the ball with the smallest number from a bag of numbered balls.

**Pseudocode:**
```
Create a variable and Set its value to first number in the array.
For each number in the array starting from the second:
    If the current number is less than smallest:
         Set smallest to the current number.
Print smallest.
```

---

## Problem 2: Determining the Largest Number
**Task:** Find the highest score from an array of scores.

**Pseudocode:**
```
Set largest to the first score in the array.
For each score in the array starting from the second:
    If the current score is greater than largest:
         Set largest to the current score.
Print largest.
```

---

## Problem 3: Calculating the Total Sum of Elements
**Task:** Add up the value of all coins in a pile (each coin’s value is stored in an array).

**Pseudocode:**
```
Set totalSum to 0.
For each coin in the array:
    Add the coin's value to totalSum.
Print totalSum.
```

---

## Problem 4: Finding the Second Largest Number
**Task:** Find the card with the second highest number from a row of numbered cards.

**Pseudocode:**
```
Set highest to a very low number.
Set secondHighest to a very low number.
For each number in the array:
    If the number is greater than highest:
         Set secondHighest to highest.
         Set highest to the current number.
    Else if the number is greater than secondHighest and not equal to highest:
         Set secondHighest to the current number.
Print secondHighest.
```

---

## Additional Practice Tasks

### Task 5: Find the Highest and Lowest Temperatures for a Week
**Task:** Use an array of temperatures to identify the highest and lowest values.

**Pseudocode:**
```
Set highest to the first temperature in the array.
Set lowest to the first temperature in the array.
For each temperature in the array starting from the second:
    If the temperature is greater than highest:
         Update highest to this temperature.
    If the temperature is less than lowest:
         Update lowest to this temperature.
Print highest and lowest.
```

---

### Task 6: Calculate the Sum of All Elements in an Array
**Task:** After creating an array of integers, calculate the sum of all elements.

**Pseudocode:**
```
Set totalSum to 0.
For each element in the array:
    Add the element's value to totalSum.
Print totalSum.
```

---

### Task 7: Print Only Even Numbers from a 2D Array
**Task:** From a 2D array that stores both odd and even numbers, print only the even numbers.

**Pseudocode:**
```
For each row in the 2D array:
    For each element in the row:
         If the element is even:
              Print the element.
```

---

### Task 8: Calculate the Sum of Even and Odd Numbers in a 2D Array
**Task:** Calculate and print two sums – one for all even numbers and one for all odd numbers in a 2D array.

**Pseudocode:**
```
Set evenSum to 0.
Set oddSum to 0.
For each row in the 2D array:
    For each element in the row:
         If the element is even:
              Add it to evenSum.
         Else:
              Add it to oddSum.
Print evenSum and oddSum.
```

---

### Task 9: Swap Two Numbers Without a Temporary Variable
**Task:** Swap the values of two variables without using an extra variable.

**Pseudocode:**
```
Assume variables a and b have initial values.
Set a to a + b.
Set b to a - b.   // Now b becomes the original value of a.
Set a to a - b.   // Now a becomes the original value of b.
Print a and b.
```

---

### Task 10: Check Whether a Given Number is Prime
**Task:** Determine if a number is prime (only divisible by 1 and itself).

**Pseudocode:**
```
Assume the number to check is n.
If n is less than 2:
    Print "Not Prime".
Else:
    Set isPrime to true.
    For each number i from 2 to n-1:
         If n modulo i is 0:
              Set isPrime to false.
              Break the loop.
    If isPrime is true:
         Print "Prime".
    Else:
         Print "Not Prime".
```

---

### Task 11: Print the First 10 Numbers of the Fibonacci Series
**Task:** Generate and print the first 10 numbers of the Fibonacci sequence.

**Pseudocode:**
```
Set first to 0 and second to 1.
Print first and second.
For count from 3 to 10:
    Set next to first + second.
    Print next.
    Set first to second.
    Set second to next.
```

---

### Task 12: Find the Second Largest Number in an Array
**Task:** Identify and print the second largest number from an array of integers.

**Pseudocode:**
```
Set highest to a very low number.
Set secondHighest to a very low number.
For each number in the array:
    If the number is greater than highest:
         Set secondHighest to highest.
         Set highest to the number.
    Else if the number is greater than secondHighest and not equal to highest:
         Set secondHighest to the number.
Print secondHighest.
```

---

### Task 13: Print Duplicate Elements from an Array of Strings
**Task:** Identify and print duplicate strings from an array.

**Pseudocode:**
```
For each string in the array:
    For each subsequent string in the array:
         If the current string equals the subsequent string:
              Print the string as a duplicate.
```

---

> **Note**: These pseudocode examples are intended to guide your thought process. Write your own pseudocode first, then convert it into Java code. Use these examples as inspiration to develop your problem-solving skills for coding interviews. Happy coding!