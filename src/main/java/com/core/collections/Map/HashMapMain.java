package main.java.com.core.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Bob", 10);
        hashMap.put("Bob", 20);// it will be overwrite first map "Bob"
        hashMap.put("Jeck", 30);
        hashMap.put("Bobby", 40);

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

        hashMap.forEach((k, v) -> System.out.println(k+" "+v));

    }
}

