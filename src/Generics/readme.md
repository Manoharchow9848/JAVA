
# ☕ Java Generics — Complete Guide

This guide covers **all key concepts of Generics in Java**, including **syntax, generic classes, interfaces, methods, wildcards, bounded types, and real-world examples**.

---

## 🧩 1️⃣ What Are Generics?

**Generics** allow classes, interfaces, and methods to operate on **types (data types)** specified as parameters.

> In simple terms, Generics let you write code that works with **any type**, while maintaining **type safety** and **avoiding explicit casts**.

---

### 💻 Example (Without Generics)
```java
List list = new ArrayList();
list.add("Hello");
String s = (String) list.get(0);  // Need to cast manually
```

### 💻 Example (With Generics)
```java
List<String> list = new ArrayList<>();
list.add("Hello");
String s = list.get(0);  // No cast required ✅
```

✅ **Advantages of Generics:**
- **Type Safety** — compile-time checking for type errors.
- **Code Reusability** — write one class/method for multiple data types.
- **Eliminates Casting** — no need for explicit type casting.
- **Improved Readability** — clearer intent.

---

## 🧩 2️⃣ Generic Class

A **generic class** is a class that can work with any type using a type parameter (`T`, `E`, `K`, `V`, etc.).

### 💻 Example:
```java
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println(strBox.get());
    }
}
```

### 🧠 Output:
```
10
Hello Generics
```

✅ The same `Box` class works for both `Integer` and `String`.

---

## 🧩 3️⃣ Generic Methods

A **generic method** defines its own type parameter.

### 💻 Example:
```java
class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] names = {"Raj", "Vamsi"};

        printArray(nums);
        printArray(names);
    }
}
```

### 🧠 Output:
```
1
2
3
Raj
Vamsi
```

✅ Works for any array type — no overloads needed.

---

## 🧩 4️⃣ Generic Interface

### 💻 Example:
```java
interface Container<T> {
    void add(T item);
    T get();
}

class Store<T> implements Container<T> {
    private T item;

    public void add(T item) { this.item = item; }
    public T get() { return item; }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Store<String> s = new Store<>();
        s.add("Generic Interface Example");
        System.out.println(s.get());
    }
}
```

### 🧠 Output:
```
Generic Interface Example
```

✅ You can define interfaces with type parameters and implement them for specific types.

---

## 🧩 5️⃣ Bounded Type Parameters

You can restrict types using **bounds**.

### 💡 Syntax:
```java
<T extends ClassName>
```

### 💻 Example:
```java
class MathUtil {
    public static <T extends Number> double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

public class BoundedTypeExample {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(4));     // Integer
        System.out.println(MathUtil.square(4.5));   // Double
    }
}
```

### 🧠 Output:
```
16.0
20.25
```

✅ Restricts generic types to only those extending `Number` (like `Integer`, `Double`, etc.).

---

## 🧩 6️⃣ Multiple Bounds

A generic type can extend multiple bounds (interfaces/classes).

### 💻 Example:
```java
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck is flying"); }
    public void swim() { System.out.println("Duck is swimming"); }
}

class Action {
    public static <T extends Flyable & Swimmable> void perform(T creature) {
        creature.fly();
        creature.swim();
    }
}

public class MultiBoundExample {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Action.perform(duck);
    }
}
```

### 🧠 Output:
```
Duck is flying
Duck is swimming
```

✅ Type parameter must implement **both** `Flyable` and `Swimmable`.

---

## 🧩 7️⃣ Wildcards in Generics (`?`)

Wildcards are used when you don’t know the exact type.

| Syntax | Meaning |
|---------|----------|
| `?` | Unknown type |
| `? extends T` | Any subtype of `T` |
| `? super T` | Any supertype of `T` |

---

### 💻 Example: Upper Bounded Wildcard (`? extends Number`)
```java
import java.util.*;

public class WildcardExample {
    public static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        printList(integers);
        printList(doubles);
    }
}
```

### 🧠 Output:
```
1
2
3
1.1
2.2
3.3
```

✅ Accepts any `List` whose elements are subclasses of `Number`.

---

### 💻 Example: Lower Bounded Wildcard (`? super Integer`)
```java
import java.util.*;

public class LowerBoundExample {
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addIntegers(numbers);
        System.out.println(numbers);
    }
}
```

### 🧠 Output:
```
[10, 20]
```

✅ Allows adding integers safely because the list can hold Integer or its supertypes.

---

## 🧩 8️⃣ Unbounded Wildcards (`?`)

### 💻 Example:
```java
public class UnboundedExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Raj", "Vamsi");
        List<Integer> numbers = List.of(1, 2, 3);

        printList(names);
        printList(numbers);
    }
}
```

### 🧠 Output:
```
Raj
Vamsi
1
2
3
```

✅ Used when type doesn’t matter.

---

## 🧩 9️⃣ Generic Constructor

### 💻 Example:
```java
class Data<T> {
    private T value;

    <U extends T> Data(U value) {
        this.value = value;
    }

    T getValue() { return value; }
}

public class GenericConstructorExample {
    public static void main(String[] args) {
        Data<Number> data = new Data<>(10.5); // Double passed to Number
        System.out.println(data.getValue());
    }
}
```

### 🧠 Output:
```
10.5
```

✅ Constructor itself has its own generic type.

---

## 🧩 🔟 Generic Collections Example

```java
import java.util.*;

public class GenericCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Vamsi");

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
    }
}
```

### 🧠 Output:
```
RAJ
VAMSI
```

✅ Generics make collections type-safe — no casts needed.

---

## 🧩 11️⃣ Type Inference with Diamond Operator `<>`

Introduced in Java 7 to avoid redundancy.

### 💻 Example:
```java
Map<String, Integer> map = new HashMap<>(); // Java 7+
```

✅ Compiler infers types automatically.

---

## 🧩 12️⃣ Generic Arrays (Caution ⚠️)

You **cannot directly create** generic arrays in Java.

❌ Invalid:
```java
List<String>[] arr = new List<String>[10]; // compile error
```

✅ Alternative:
```java
List<?>[] arr = new List<?>[10];
```

Or use collections (`List<List<T>>`) instead of arrays.

---

## 🧾 Summary

| Concept | Description | Example |
|----------|--------------|----------|
| **Generic Class** | Class with type parameter | `class Box<T>` |
| **Generic Method** | Method with `<T>` | `<T> void print(T val)` |
| **Generic Interface** | Interface with type | `interface Container<T>` |
| **Bounded Types** | Restrict types | `<T extends Number>` |
| **Wildcards** | Unknown type (`?`, `extends`, `super`) | `List<? extends Number>` |
| **Type Inference** | Auto-detect generic type | `new ArrayList<>()` |
| **EnumSet/EnumMap** | Specialized collections for Enums | `EnumSet.of()` |
| **Multiple Bounds** | Extend multiple types | `<T extends A & B>` |

---

## ✅ Key Takeaways
- Generics ensure **compile-time type safety**.
- Avoid **casting** and **runtime type errors**.
- Use **wildcards** for flexibility.
- Use **bounded types** to restrict generic usage.
- Always use `<>` (diamond operator) for cleaner syntax.

---

💡 **Best Practice:**  
Use Generics whenever working with **collections**, **utility classes**, or **reusable frameworks** to make your code robust and reusable.

---
