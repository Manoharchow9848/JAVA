package OOPS.Inheritence.multilevel;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandParent();
        c.showParent();
        c.showChild();
    }
}
