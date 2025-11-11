package Collections.Map;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(3, "Raj");
        map.put(1, "Vamsi");
        map.put(2, "Manohar");

        System.out.println("TreeMap: " + map);

        // First and last keys
        System.out.println("First Key: " + ((TreeMap<Integer, String>) map).firstKey());
        System.out.println("Last Key: " + ((TreeMap<Integer, String>) map).lastKey());

        Map<Integer, String> mp = new TreeMap<>(Collections.reverseOrder());
        mp.putAll(map);
        System.out.println("Reversed TreeMap: " + mp);


    }
}
