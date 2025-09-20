# Using String Methods

## Objective
Learn how to combine basic String methods with if-else statements to validate user input. In these examples, you'll see how to use methods such as `length()`, `isEmpty()`, `trim()`, `startsWith()`, `endsWith()`, and `contains()` in everyday scenarios like validating usernames, passwords, and email addresses.

---

## Example 1: Validating Username Length

**Scenario:**  
A website requires that a username must be no longer than 12 characters. Use the `length()` method to check the username length and print an error message if it is too long.

**Code Example:**
```java
String username = "SuperLongUsername123";  // Example username
if (username.length() > 12) {
    System.out.println("Error: Username cannot be longer than 12 characters.");
} else {
    System.out.println("Username accepted.");
}
// Expected Output: Error: Username cannot be longer than 12 characters.
```

---

## Example 2: Checking for Empty Password

**Scenario:**  
When a user submits a form, the password field must not be empty. Use the `isEmpty()` method to validate that the password is not empty.

**Code Example:**
```java
String password = "";  // Example password (empty)
if (password.isEmpty()) {
    System.out.println("Error: Password cannot be empty.");
} else {
    System.out.println("Password accepted.");
}
// Expected Output: Error: Password cannot be empty.
```

---

## Example 3: Trimming and Validating an Email Address

**Scenario:**  
A user enters their email address with extra spaces at the beginning and end. Use the `trim()` method to remove these spaces and then check if the email starts with a specific prefix (e.g., "admin").

**Code Example:**
```java
String email = "   admin@example.com   ";  // Email with extra spaces
String cleanEmail = email.trim();
if (cleanEmail.startsWith("admin")) {
    System.out.println("Admin email detected.");
} else {
    System.out.println("Regular email detected.");
}
// Expected Output: Admin email detected.
```

*Note:* The `trim()` method only removes spaces from the beginning and end, not from in between.

---

## Example 4: Validating Email Domain Using endsWith()

**Scenario:**  
Check if a provided email address ends with ".com". This can be used to enforce a specific domain for user registrations.

**Code Example:**
```java
String emailAddress = "user@example.org";  // Example email address
if (emailAddress.endsWith(".com")) {
    System.out.println("Valid email domain.");
} else {
    System.out.println("Invalid email domain. Only .com emails are accepted.");
}
// Expected Output: Invalid email domain. Only .com emails are accepted.
```

---

## Example 5: Checking URL Security Using contains()

**Scenario:**  
Ensure that a URL contains "https" to verify that it is secure.

**Code Example:**
```java
String url = "http://www.example.com";  // Example URL
if (url.contains("https")) {
    System.out.println("URL is secure.");
} else {
    System.out.println("URL is not secure.");
}
// Expected Output: URL is not secure.
```

---

## Using Method Results in Conditions

Remember, the results of these String methods can be stored in variables and used in further conditions. For instance:
```java
String input = "   yes   ";
String cleanInput = input.trim();
if (cleanInput.equalsIgnoreCase("yes")) {
    System.out.println("User agreed!");
} else {
    System.out.println("User did not agree.");
}
// Expected Output: User agreed!
```

---

## Tips
- **Chaining Methods:** You can combine methods like `trim()` and `toLowerCase()` to normalize user input before performing checks.
- **Storing Results:** Store the output of a method in a variable if you'll use it more than once.
- **Real-World Application:** These examples mimic common validation scenarios in web applications.

Happy coding!