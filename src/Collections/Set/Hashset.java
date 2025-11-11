package Collections.Set;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Raj");
        names.add("Vamsi");
        names.add("Manohar");
        names.add("Raj");  // duplicate - ignored

        System.out.println("HashSet: " + names);

        // Check if an element exists
        boolean hasRaj = names.contains("Raj");
        System.out.println("Contains Raj: " + hasRaj);

    }
}
