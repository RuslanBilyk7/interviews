package main.java.com.core.collections.Map;

import java.util.*;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bob", 10);
        hashMap.put("Bob", 20);// it will be overwrite first map "Bob"
        hashMap.put("Jeck", 30);
        hashMap.put("Bobby", 40);
        hashMap.put(null, 40);
        hashMap.put("Bobby", null);

        System.out.println(hashMap.size());
        System.out.println();

//        for (String key : hashMap.keySet()) {
//            System.out.println("Key: " + key);
//        }
//        for (int value : hashMap.values()) {
//            System.out.println("Value: " + value);
//        }
//        for (Map.Entry entry : hashMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }

        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("Bob"));
        System.out.println(hashMap.containsValue(20));
        System.out.println();

        hashMap.put("Dolly", 1000);
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();
        System.out.println(hashMap.get("Bob"));

        // The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println(hashMap.get("BBB"));

        // Modify the value assigned to an existing key
        System.out.println(hashMap.put("Bob",4000));
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();
//        System.out.println(hashMap.remove("Bob"));
//        System.out.println(hashMap);

// Remove a key from the HashMap only if it is mapped to the given value
        boolean tt=hashMap.remove("Bob",4000);
        System.out.println(tt);// true
        System.out.println(hashMap);

        // HashMap's entry set
        Set<Map.Entry <String,Integer>> hashMapSet=hashMap.entrySet();
        System.out.println(hashMapSet);
        // HashMap's key set
        Set<String> names=hashMap.keySet();
        System.out.println(names);
        // HashMap's values
        Collection<Integer> ages= hashMap.values();
        System.out.println(ages);

        //Iterating over a HashMap using Java 8 forEach and lambda
        hashMap.forEach((name, age) -> {
            System.out.println(name + " => " + age);
        });

        //Iterating over the HashMap's entrySet using iterator()
        Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
    }
}

