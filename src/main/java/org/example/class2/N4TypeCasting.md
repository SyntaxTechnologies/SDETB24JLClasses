#  `TYPE CASTING` IN JAVA

## 1) WHAT IS TYPE CASTING?
Type casting is the process of **converting** a data from one data type to another.
- **Widening (implicit) casting**: Converting a smaller type to a larger type (e.g., `int` → `long`).
- **Narrowing (explicit) casting**: Converting a larger type to a smaller type (e.g., `double` → `int`).

## 2) WHY DO WE NEED TYPE CASTING?
1. **Recipe Conversions (Compatibility)**
    - Imagine a recipe that lists ingredients in cups, but your measuring cups only show tablespoons. You know that 1 cup = 16 tablespoons, so you convert (“cast”) cups into tablespoons before you start cooking.
    - In code: you convert (`cast`) one data type into another so that the operations or “tools” you use expect the correct units.
2. **Compatibility**: Assign values between different types when required by APIs or operations.

## 3) HOW DO WE PERFORM TYPE CASTING? (EXAMPLES)

### Example #1: Widening Casting (Implicit)
    int a = 10;
    double b = a;
    System.out.println(b);

Output:
- 10.0

### Example #2: Narrowing Casting (Explicit)
    double x = 5.9;
    int y = (int) x;
    System.out.println(y);

Output:
- 5

> **Note**: Widening casting happens automatically; narrowing casting always requires an explicit cast.

## 4) COMMON MISTAKES

### Mistake #1: Forgetting the Cast for Narrowing
    double d = 3.14;
    int x = d;               // Wrong: incompatible types
    int y = (int) d;         // Correct

### Mistake #2: Unexpected Data Loss
    long big = 1234567890123L;
    int small = (int) big;   // Data truncated—only low 32 bits kept

### Mistake #3: Casting Non‑Numeric Types Directly
    String s = "abc";
    int n = (int) s;         // Wrong: cannot cast String
    int m = Integer.parseInt(s); // Correct but may throw exception

### Mistake #4: Confusing Character to Number Casting
    char c = 'A';
    int code = c;            // Implicitly converts to Unicode code point (65)
    System.out.println(code);