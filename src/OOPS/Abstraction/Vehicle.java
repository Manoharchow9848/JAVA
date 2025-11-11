package OOPS.Abstraction;

abstract  class Vehicle {
    abstract void start(); // abstract method — no body

    void fuel() { // concrete method
        System.out.println("Vehicle uses fuel");
    }
}
