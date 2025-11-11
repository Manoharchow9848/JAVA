package Collections.Set;

import java.util.*;

public class LinkedhashSet {
    public static void main(String[] args) {
       LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Raj");
        names.add("Vamsi");
        names.add("Manohar");
        names.add("Raj");  // duplicate - ignored

        System.out.println("LinkedHashSet: " + names);

        // Check if an element exists
        boolean hasRaj = names.contains("Raj");
        System.out.println("Contains Raj: " + hasRaj);

    }
}
