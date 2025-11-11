package OOPS.Polymorphism.overriding;

public class OverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Upcasting
        Animal a2 = new Cat();

        a1.sound();  // Dog's version called
        a2.sound();  // Cat's version called
    }
}
