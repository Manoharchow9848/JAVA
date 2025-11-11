package OOPS.Polymorphism.overloading;

public class OverloadingExample {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(2, 3));
        System.out.println("Sum (int, int, int): " + calc.add(2, 3, 5));
        System.out.println("Sum (double): " + calc.add(2.5, 3.5));
    }
}
