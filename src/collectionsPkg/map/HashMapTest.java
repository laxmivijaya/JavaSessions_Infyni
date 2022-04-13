package collectionsPkg.map;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Integer> mapRef = new HashMap<>();
        mapRef.put("A", 1);
        mapRef.put("B", 2);
        mapRef.put("C", 3);
        mapRef.put("D", 4);
        mapRef.put("E", 5);
        mapRef.put("A", 7);

        System.out.println(mapRef);

        Set<String> setRef = mapRef.keySet();

        for (String key : setRef) {
            System.out.println(key);
        }

        Collection<Integer> listRef = mapRef.values();
        for (Integer value : listRef) {
            System.out.println(value);
        }


        Set<Map.Entry<String, Integer>> setEntryRef = mapRef.entrySet();

        for (Map.Entry<String, Integer> entry : setEntryRef) {
            System.out.println("key::" + entry.getKey());
            System.out.println("Value::" + entry.getValue());
        }


    }
}
