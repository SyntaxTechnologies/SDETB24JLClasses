# Using Regular Expressions in Java

## Objective
Learn what regular expressions (regex) are and how to use them in Java with the `replaceAll()` and `split()` methods. Regex are patterns used to match character combinations in strings, allowing you to search, replace, or split text based on specific patterns.

---

## What Are Regular Expressions?
Regular expressions are sequences of characters that define a search pattern. They are widely used for:
- **Searching:** Finding patterns within text.
- **Replacing:** Substituting parts of text with other text.
- **Splitting:** Dividing text into arrays based on patterns.

### Common Regex Patterns:
- `[a-z]` : Matches any lowercase letter (from a to z).
- `[^a-z]` : Matches any characters which are not lowercase letters (from a to z).
- `[A-Z]` : Matches any uppercase letter (from A to Z).
- `[^A-Z]` : Matches any characters which are not uppercase letters (from A to Z).
- `[0-9]` : Matches any digit (from 0 to 9).
- `[a-zA-Z0-9]` : Matches any alphanumeric character.
- `[^A-Za-z0-9]` : Matches any character that is NOT a letter or digit; sometimes also called special characters.
- `\\d` : Matches any digit (equivalent to `[0-9]`).
- `\\s` : Matches any whitespace character (space, tab, newline).

*Note:* When using these in Java strings, remember to escape backslashes (e.g., `\\d`).

---

## Using replaceAll() Method

### Example 1: Replace Lowercase Letters with a Symbol

**Scenario:**  
Replace all lowercase letters in a string with the symbol `*`.

**Code Example:**
```java
String text = "Hello World 123";
String replacedText = text.replaceAll("[a-z]", "*");
System.out.println("Replaced Text: " + replacedText);
// Expected Output: "H**** W**** 123"
```

*Explanation:*  
The regex `[a-z]` matches any lowercase letter. Each lowercase letter is replaced with `*`.  
*Tip:* To remove characters instead, replace them with an empty string `""`.

---

### Example 2: Replace Digits with a Hash Symbol

**Scenario:**  
Replace each digit in a string with the hash symbol `#`.

**Code Example:**
```java
String info = "Order123Number456";
String replacedDigits = info.replaceAll("[0-9]", "#");
System.out.println("Replaced Digits: " + replacedDigits);
// Expected Output: "Order###Number###"
```

*Explanation:*  
The regex `[0-9]` matches any digit. Each digit is replaced with `#`.

---

### Example 3: Replace Characters Not Uppercase or Digit with a Dash

**Scenario:**  
Replace all characters that are not uppercase letters or digits with a dash (`-`).  
*Original string:* `"Data@2025#Report"`

**Code Example:**
```java
String report = "Data@2025#Report";
String updatedReport = report.replaceAll("[^A-Z0-9]", "-");
System.out.println("Updated Report: " + updatedReport);
// Expected Output: "----2025-RE-----"
```

*Explanation:*  
The regex `[^A-Z0-9]` matches any character that is not an uppercase letter (A-Z) or a digit (0-9). These characters are replaced with `-`.

---

### Example 4: Replace Digits Using Shorthand \d

**Scenario:**  
Replace all digits in a string with `"X"` using the shorthand `\\d`.

**Code Example:**
```java
String mixed = "UserID1234";
String replacedWithX = mixed.replaceAll("\\d", "X");
System.out.println("Replaced Digits with X: " + replacedWithX);
// Expected Output: "UserIDXXXX"
```

*Explanation:*  
The regex `\\d` is a shorthand for `[0-9]` and matches any digit. Each digit is replaced with `"X"`.

---

## Using split() Method


---

### Example 1: Split a Sentence into Words

**Scenario:**  
Split a sentence into individual words.  
*Example sentence:* `"Learning regex is useful"`

**Code Example:**
```java
String sentence = "Learning regex is useful";
String[] words = sentence.split("\\s");
System.out.println(Arrays.toString(words));
// Expected Output: [Learning, regex, is, useful]
```

*Explanation:*  
The regex `\\s` matches a single whitespace character, splitting the sentence into words.

### Example 2: Split a Sentence Using Punctuation

**Scenario:**  
Split a sentence into parts using punctuation marks like question mark, period, or comma as delimiters.  
*Example sentence:* `"Hello? How are you. Fine, thanks!"`

**Code Example:**
```java
String sentence = "Hello? How are you. Fine, thanks!";
String[] parts = sentence.split("[?.,]");
System.out.println(Arrays.toString(parts));
// Expected Output: [Hello,  How are you,  Fine,  thanks!]
```

*Explanation:*  
The regex `[?.,]` matches any one of the characters "?", ".", or ",". This splits the sentence at each punctuation mark.

Happy coding!