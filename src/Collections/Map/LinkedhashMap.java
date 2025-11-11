package Collections.Map;

import java.util.*;

public class LinkedhashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Cherry", 30);

        System.out.println("LinkedHashMap: " + map);

        // Replace value
        map.replace("Banana", 15);
        System.out.println("After replacing Banana: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
