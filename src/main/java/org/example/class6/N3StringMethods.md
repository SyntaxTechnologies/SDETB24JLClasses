# The String Class in Java - Detailed Methods

In this section, we'll explore several useful methods provided by the String class. Each method is explained with simple examples to illustrate its usage and behavior. Remember, the results of these methods can be stored in variables for further use in conditions or other parts of your code.

---

## 1) isEmpty() vs. isBlank()

**isEmpty()**

- **Description:**  
  Checks whether a string has zero characters (i.e., its length is 0).
- **Important:**  
  If the string contains only whitespace (e.g., spaces), it is not considered empty.

**Examples:**
```java
// Example 1: Truly empty string
String str1 = "";
System.out.println(str1.isEmpty()); // Expected Output: true

// Example 2: String with spaces (not empty)
String str2 = "   ";
System.out.println(str2.isEmpty()); // Expected Output: false
```

**isBlank()** *(introduced in Java 11)*

- **Description:**  
  Checks whether the string is empty or contains only whitespace.
- **Key Difference:**  
  A string with spaces is considered blank.

**Examples:**
```java
// Example 3: Using isBlank() on an empty string
String str3 = "";
System.out.println(str3.isBlank()); // Expected Output: true

// Example 4: Using isBlank() on a string with spaces
String str4 = "   ";
System.out.println(str4.isBlank()); // Expected Output: true
```

---

## 2) trim()

**Description:**
- The `trim()` method removes only the leading and trailing whitespace from a string.
- **Note:** It does not remove spaces between words.

**Examples:**
```java
// Example 1: Removing spaces from the beginning and end
String str1 = "   LearnJava   ";
String trimmed1 = str1.trim();
System.out.println(trimmed1); 
// Expected Output: "LearnJava"

// Example 2: Spaces between words remain unchanged
String str2 = "Learn   Java";
String trimmed2 = str2.trim();
System.out.println(trimmed2);
// Expected Output: "Learn   Java"
```

---

## 3) startsWith()

**Description:**
- The `startsWith()` method checks if a string begins with a specified prefix.
- It can be used to check for an entire word or a single character.

**Examples:**
```java
// Example 1: Check if a string starts with a word
String phrase = "Java programming is fun.";
System.out.println(phrase.startsWith("Java")); 
// Expected Output: true

// Example 2: Check if a string starts with a character
System.out.println(phrase.startsWith("J")); 
// Expected Output: true

// Example 3: Check for a prefix that doesn't match
System.out.println(phrase.startsWith("python")); 
// Expected Output: false
```

---

## 4) endsWith()

**Description:**
- The `endsWith()` method checks if a string ends with a specified suffix.
- It can check for an entire word or a single character.

**Examples:**
```java
// Example 1: Check if a filename ends with a specific extension
String filename = "report.pdf";
System.out.println(filename.endsWith(".pdf")); 
// Expected Output: true

// Example 2: Check if a string ends with a character
String greeting = "Hello";
System.out.println(greeting.endsWith("o")); 
// Expected Output: true

// Example 3: Check for a suffix that does not match
System.out.println(filename.endsWith(".doc")); 
// Expected Output: false
```

---

## 5) contains()

**Description:**
- The `contains()` method checks if a string contains a particular sequence of characters.
- The substring can appear anywhere in the string.

**Examples:**
```java
// Example 1: Check if a sentence contains a word
String sentence = "Java programming is fun.";
System.out.println(sentence.contains("programming")); 
// Expected Output: true

// Example 2: Check if a sentence contains a specific character
System.out.println(sentence.contains("J")); 
// Expected Output: true

// Example 3: Check for a substring that is not present
System.out.println(sentence.contains("Python")); 
// Expected Output: false
```

---

## 6) equals() and equalsIgnoreCase()

**Description:**
- **equals()**: Compares two strings for exact equality (case-sensitive).
- **equalsIgnoreCase()**: Compares two strings for equality, ignoring case differences.

**Examples:**
```java
// Example 1: Using equals() for an exact match
String str1 = "Hello";
String str2 = "Hello";
System.out.println(str1.equals(str2)); 
// Expected Output: true

// Example 2: equals() with case differences
String str3 = "Hello";
String str4 = "hello";
System.out.println(str3.equals(str4)); 
// Expected Output: false

// Example 3: Using equalsIgnoreCase() to ignore case differences
System.out.println(str3.equalsIgnoreCase(str4)); 
// Expected Output: true
```

---

## 7) charAt()

**Description:**
- The `charAt()` method returns the character at a specific index in the string.
- Remember that indices start at 0.

### Examples Using a Loop:

**Example 1: Loop Through Each Character**
```java
String word = "Java";
for (int i = 0; i < word.length(); i++) {
    System.out.println(word.charAt(i));
}
// Expected Output:
// J
// a
// v
// a
```

**Example 2: Count Occurrences of a Specific Character**
```java
String text = "banana";
int count = 0;
for (int i = 0; i < text.length(); i++) {
    if (text.charAt(i) == 'a') {
        count++;
    }
}
System.out.println("The letter 'a' appears " + count + " times.");
// Expected Output:
// The letter 'a' appears 3 times.
```

---

## 8) indexOf()

**Description:**
- The `indexOf()` method returns the index of the first occurrence of a specified character or substring.
- It returns -1 if the character or substring is not found.
- **Note:** You do not need a loop to use `indexOf()` since it already returns the position.

### Examples:

**Example 1: Simple Usage**
```java
String sentence = "Hello, World!";
int index = sentence.indexOf('W');
System.out.println("Index of 'W': " + index);
// Expected Output: Index of 'W': 7
```

**Example 2: Using indexOf() with a Substring**
```java
String sentence = "Find the position of the word 'World'.";
int index = sentence.indexOf("World");
System.out.println("Index of 'World': " + index);
// Expected Output: Index of 'World': 21
```

**Using the Result in a Condition:**
```java
String text = "Welcome to Java";
int index = text.indexOf("Java");
if (index != -1) {
    System.out.println("'Java' found at index: " + index);
} else {
    System.out.println("'Java' not found.");
}
// Expected Output: 'Java' found at index: 11
```

---

## COMMON MISTAKES AND PROPER USAGE

### Mistake #1: Not Storing the Result of a String Method
```java
String greeting = "hello";
greeting.toUpperCase();  // This does not change greeting.
System.out.println(greeting); // Incorrect: prints "hello"
```
**Proper Way:**
```java
String greeting = "hello";
greeting = greeting.toUpperCase();
System.out.println(greeting); // Correct: prints "HELLO"
```

### Mistake #2: Using Incorrect Indices with charAt()
```java
String text = "Java";
// Incorrect: Trying to access an index out of range (0 to text.length()-1)
char ch = text.charAt(4); // Error: StringIndexOutOfBoundsException
```
**Proper Way:**
```java
String text = "Java";
char ch = text.charAt(3);  // Correct: accesses 'a'
System.out.println(ch);    // Expected Output: a
```

### Mistake #3: Case-Sensitivity Issues with equals() or startsWith()/endsWith()
```java
String str1 = "Hello";
System.out.println(str1.equals("hello")); // Incorrect: returns false due to case differences
```
**Proper Way:**
```java
String str1 = "Hello";
System.out.println(str1.equalsIgnoreCase("hello")); // Correct: returns true
```

---

## LIMITATIONS AND CONSIDERATIONS

- **Immutability:**  
  Strings in Java are immutable. Methods like `toUpperCase()`, `toLowerCase()`, `trim()`, and `concat()` return new strings rather than modifying the original.

- **Memory Usage:**  
  String literals are stored in a special area called the "string pool" for efficient memory usage.

> **Note**: The results of these methods can be stored in variables and used later in conditions or other parts of your code. Practice these examples to become comfortable with string manipulation. Understanding these methods will help you process text data more effectively in your programs.

Happy coding!