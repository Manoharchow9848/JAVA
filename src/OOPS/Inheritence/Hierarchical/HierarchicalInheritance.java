package OOPS.Inheritence.Hierarchical;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.showParent();
        c1.showChild1();

        c2.showParent();
        c2.showChild2();
    }
}
