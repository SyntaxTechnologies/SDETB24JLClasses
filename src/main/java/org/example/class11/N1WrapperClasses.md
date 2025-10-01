## Wrapper Classes in Java

## Objective

Learn how to use wrapper classes in Java to convert primitive types into objects, enabling you to use them in collections and take advantage of utility methods.
---

## What Is a Wrapper Class?
Think of primitive types like raw ingredients; wrapper classes are jars that let you store them as objects. In Java, wrapper classes wrap primitive values (int, char, etc.) so you can treat them like any other object.
- A **wrapper class** is an object representation of a primitive type.
- Each primitive has a corresponding wrapper:
    - `byte` → `Byte`
    - `short` → `Short`
    - `int` → `Integer`
    - `long` → `Long`
    - `float` → `Float`
    - `double` → `Double`
    - `char` → `Character`
    - `boolean` → `Boolean`

---

## Why Do We Need Wrapper Classes?

- **Collections Compatibility:** You can’t store primitives directly in collections like `ArrayList`—wrappers let you.
- **Utility Methods:** Parse strings to numbers or convert values to strings (e.g., `Integer.parseInt`).
- **Nullability:** Wrapper objects can be `null` to represent “no value.”
- **Generics Support:** Java generics work only with objects, not primitives.

---

## How to Use Wrapper Classes

1. **Boxing (Primitive → Wrapper):**
    - Manual: `Integer iObj = new Integer(5);`
    - Autoboxing (Java 5+): `Integer iObj = 5;`

2. **Unboxing (Wrapper → Primitive):**
    - Manual: `int i = iObj.intValue();`
    - Auto-unboxing: `int i = iObj;`

3. **Utility Methods:**
    - Parsing: `int x = Integer.parseInt("42");`
    - Converting: `String s = Double.toString(3.14);`

---

## Simple Examples

### Example 1: Autoboxing and Unboxing

```java
Integer wrapped = 10;        // autoboxing
int primitive = wrapped;     // auto-unboxing
System.out.println(wrapped + primitive); // prints 20
```


### Example 2: Parsing and Formatting

```java
String text = "123";
int value = Integer.parseInt(text);      // primitive 123
String result = Integer.toString(value); // "123"
```

---

## Summary

- Wrapper classes package primitives as objects.
- Autoboxing and unboxing make conversion automatic.
- Use wrappers when you need object features—collections, generics, nulls, or utility methods.

Happy coding!