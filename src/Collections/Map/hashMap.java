package Collections.Map;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Adding entries
        map.put(1, "Raj");
        map.put(2, "Vamsi");
        map.put(3, "Manohar");
        map.put(2, "Chowdary"); // Overwrites old value for key 2

        System.out.println("HashMap: " + map);

        // Accessing elements
        System.out.println("Value for key 3: " + map.get(3));

        // Returns value for key 1 as default
        // Removing an element
        map.remove(1);
        System.out.println("After removal: " + map);

        // Iterating over entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
