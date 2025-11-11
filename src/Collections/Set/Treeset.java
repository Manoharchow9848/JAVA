package Collections.Set;

import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10); // duplicate ignored

        System.out.println("TreeSet: " + numbers);
    }
}
