# Using String Methods

## Objective
Learn how to use the `substring()` and `replace()` methods in Java to manipulate strings.

---

## Example 1: Extracting a Substring
Extract the first 5 characters from a given string.

**Code Example:**
```java
String greeting = "Hello, World!";
String firstFive = greeting.substring(0, 5);
System.out.println(firstFive);
// Expected Output: Hello
```

---

## Example 2: Extracting the Year from a Date String
Extract the year from a date string formatted as "YYYY-MM-DD".

**Code Example:**
```java
String date = "2025-04-07";
String year = date.substring(0, 4);
System.out.println("Year: " + year);
// Expected Output: Year: 2025
```

---

## Example 3: Replacing a Word in a Sentence
Replace "Good" with "Best" in the sentence "Syntax Students are Good".

**Code Example:**
```java
String sentence = "Syntax Students are Good";
String updatedSentence = sentence.replace("Good", "Best");
System.out.println(updatedSentence);
// Expected Output: Syntax Students are Best
```

---

## Example 4: Replacing Spaces with Underscores
Replace all spaces in a string with underscores.

**Code Example:**
```java
String fileName = "My File Name";
String updatedFileName = fileName.replace(" ", "_");
System.out.println(updatedFileName);
// Expected Output: My_File_Name
```

Happy coding!