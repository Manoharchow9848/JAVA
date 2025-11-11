
# ☕ Java OOPs (Object-Oriented Programming) — Complete Guide

This guide covers **all four pillars of OOPs** in Java — **Encapsulation, Inheritance, Polymorphism, and Abstraction**, along with **classes, objects, constructors, interfaces, and real-life examples.**

---

## 🧩 1. What is OOP?

**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of **objects** — real-world entities that have **attributes (data)** and **behaviors (methods)**.

---

## ⚙️ OOPs Pillars in Java

| Concept | Description | Keyword |
|----------|--------------|----------|
| **Encapsulation** | Wrapping data and methods together | `private`, `getters/setters` |
| **Inheritance** | Reusing code from another class | `extends`, `super` |
| **Polymorphism** | One interface, many implementations | `overload`, `override` |
| **Abstraction** | Hiding implementation details | `abstract`, `interface` |

---

# 🧱 2. Class and Object

### 💡 Definition:
- A **class** is a **blueprint** or **template** for creating objects.
- An **object** is an **instance** of a class.

### 💻 Example:

```java
class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();  // object creation
        car1.brand = "Tesla";
        car1.year = 2025;
        car1.displayInfo();
    }
}
```

**Output:**
```
Brand: Tesla, Year: 2025
```

---

# 🔹 3. Encapsulation

### 💡 Definition:
Encapsulation means **binding data and methods** that operate on that data into a **single unit (class)**, and **restricting direct access** to internal data using access modifiers.

### 💻 Example:

```java
class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Raj");
        s.setAge(21);
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}
```

**Output:**
```
Name: Raj, Age: 21
```

✅ **Data is hidden and accessed only through getters and setters.**

---

# 🔹 4. Inheritance

### 💡 Definition:
Inheritance allows one class to **acquire properties and methods** of another class.

### 💻 Example:

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited
        d.bark(); // own method
    }
}
```

**Output:**
```
Eating...
Barking...
```

✅ `Dog` inherits from `Animal` using `extends` keyword.

---

# 🔹 5. Polymorphism

### 💡 Definition:
Polymorphism means **many forms** — the same method can perform **different actions** depending on the object.

---

## ⚙️ Compile-Time Polymorphism (Method Overloading)

```java
class MathOperation {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

public class Main {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2.5, 3.5));
    }
}
```
**Output:**
```
5
6.0
```

---

## ⚙️ Runtime Polymorphism (Method Overriding)

```java
class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

**Output:**
```
Dog barks
```

✅ The method is chosen **at runtime** based on the object type (`Dog`).

---

# 🔹 6. Abstraction

### 💡 Definition:
Abstraction hides **implementation details** and shows only **essential features**.

---

## ⚙️ Using Abstract Class

```java
abstract class Vehicle {
    abstract void start(); // abstract
    void stop() { System.out.println("Vehicle stopped"); } // concrete
}

class Car extends Vehicle {
    void start() { System.out.println("Car starts with key"); }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
```

**Output:**
```
Car starts with key
Vehicle stopped
```

---

## ⚙️ Using Interface

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

**Output:**
```
Dog barks
```

✅ The interface defines *what* should be done, not *how*.

---

# 🔹 7. Interface Advanced Features (Java 8+)

```java
interface Vehicle {
    void start();

    default void fuel() {
        System.out.println("Vehicle uses petrol or diesel");
    }

    static void info() {
        System.out.println("Vehicles are used for transport");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.fuel();
        Vehicle.info();
    }
}
```

**Output:**
```
Car starts with a key
Vehicle uses petrol or diesel
Vehicles are used for transport
```

✅ Interfaces can have **default**, **static**, and **private** methods (Java 9+).

---

# 🔹 8. Constructor and `super` Keyword

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        new Dog();
    }
}
```

**Output:**
```
Animal constructor
Dog constructor
```

✅ The parent constructor executes first using `super()`.

---

# 🔹 9. OOPs Summary Table

| Concept | Meaning | Example |
|----------|----------|----------|
| **Class** | Blueprint for objects | `class Car {}` |
| **Object** | Instance of a class | `Car c = new Car();` |
| **Encapsulation** | Data hiding using private variables | `getters/setters` |
| **Inheritance** | Reuse code using `extends` | `class Dog extends Animal` |
| **Polymorphism** | One method, many forms | `sound()` in Dog, Cat |
| **Abstraction** | Hide internal logic | `abstract class`, `interface` |

---

# 🧾 Summary

| Pillar | Keyword | Purpose |
|---------|----------|----------|
| **Encapsulation** | `private`, `get`, `set` | Protect data |
| **Inheritance** | `extends`, `super` | Reuse code |
| **Polymorphism** | `overload`, `override` | Dynamic behavior |
| **Abstraction** | `abstract`, `interface` | Hide complexity |

---
