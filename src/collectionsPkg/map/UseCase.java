package collectionsPkg.map;

import java.util.*;

public class UseCase {

    public static void main(String[] args) {

        Map<String, Integer> mapRef = new HashMap<>();
        mapRef.put("A", 1);
        mapRef.put("B", 2);
        mapRef.put("C", 3);
        mapRef.put("D", 4);
        mapRef.put("E", 5);
        mapRef.put("A", 7);

        UseCase useCase = new UseCase();
        // find the value corresponding key given in map
        useCase.getValue(mapRef, "A");
        useCase.getValue(mapRef, "Z");

        // find the first key corresponding value given in map
        getKey(mapRef, 7);
        getKey(mapRef, 70);

        // find all the elements of hashmap and find the values in same order as insert.
        Map<String, Integer> linkedHashMapRef = new LinkedHashMap<>();
        linkedHashMapRef.put("A", 1);
        linkedHashMapRef.put("B", 2);
        linkedHashMapRef.put("C", 3);
        linkedHashMapRef.put("D", 4);
        linkedHashMapRef.put("E", 5);
        linkedHashMapRef.put("A", 7);
        System.out.println(linkedHashMapRef);

        // find all the elements of hashmap and find the values in Ascending order as insert.
        Map<String, Integer> treeMapRef = new TreeMap<>();
        treeMapRef.put("A", 1);
        treeMapRef.put("B", 2);
        treeMapRef.put("E", 5);
        treeMapRef.put("A", 7);
        treeMapRef.put("D", 4);
        treeMapRef.put("C", 3);
        //treeMapRef.put(null, 3);
        System.out.println(treeMapRef);

        //I want to sort keys in given map
        Map<Integer, Integer> mapRef1 = new HashMap<>();
        mapRef1.put(5, 1);
        mapRef1.put(4, 2);
        mapRef1.put(46, 24);
        useCase.sortMapBasedOnKeys(mapRef1);
        useCase.sortMapBasedOnValue(mapRef1);

    }


    private void getValue(Map<String, Integer> mapRef, String keyInput) {
        System.out.println(mapRef.get(keyInput));
    }

    private static void getKey(Map<String, Integer> mapRef, Integer valueInput) {
        Set<Map.Entry<String, Integer>> entrySetRef = mapRef.entrySet();
        for (Map.Entry<String, Integer> entryRef : entrySetRef) {
            if (entryRef.getValue() == valueInput) {
                System.out.println(entryRef.getKey());
                break;
            }
        }
    }


    private void sortMapBasedOnKeys(Map<Integer, Integer> mapRef) {
        Map<Integer, Integer> treeMapRef = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entryRef : mapRef.entrySet()) {
            treeMapRef.put(entryRef.getKey(), entryRef.getValue());
        }
        System.out.println(treeMapRef);
    }

    private void sortMapBasedOnValue(Map<Integer, Integer> mapRef) {
      Set<Map.Entry<Integer, Integer>> entryMapRef= mapRef.entrySet();
      List<Map.Entry<Integer, Integer>> listMapRef= new ArrayList<>(entryMapRef);

      Comparator<Map.Entry<Integer, Integer>> comparatorRef=new Comparator<Map.Entry<Integer, Integer>>(){

          @Override
          public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
              return entry1.getValue().compareTo(entry2.getValue());
          }
      };

      Collections.sort(listMapRef,comparatorRef);

      //Collections.sort(listMapRef, Comparator.comparing(Map.Entry::getValue));

      Map<Integer, Integer> map=new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entryRef : listMapRef) {
            map.put(entryRef.getKey(), entryRef.getValue());
        }

        System.out.println(map);

    }


}
