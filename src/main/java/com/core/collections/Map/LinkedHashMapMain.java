package main.java.com.core.collections.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMapMain =new LinkedHashMap<>();
        linkedHashMapMain.put("girl1","Nata");
        linkedHashMapMain.put("girl2","Nata1");
        linkedHashMapMain.put("girl4","Nata3");
        linkedHashMapMain.put("girl3","Nata2");
        linkedHashMapMain.put("girl3",null);
        linkedHashMapMain.put(null,"Nata2");
        System.out.println(linkedHashMapMain);

    }
}
