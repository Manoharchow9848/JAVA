package OOPS.Polymorphism.overriding;

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}