package OOPS.Inheritence.MultipleInheritance;

public class ClassC implements ClassA,ClassB {
    @Override
    public void displayA() {
        System.out.println("Display from A");
    }

    @Override
    public void displayB() {
        System.out.println("Display from B");
    }
}
