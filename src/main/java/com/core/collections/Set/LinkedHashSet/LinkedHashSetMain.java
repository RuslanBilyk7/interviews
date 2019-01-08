package main.java.com.core.collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        linkedHashSet.add("Third2");
        linkedHashSet.add("Third4");
        linkedHashSet.add("Third3");
        linkedHashSet.add("Third3");  // it will not be added


        System.out.println(linkedHashSet);

        for (String s : linkedHashSet) {
            System.out.print(s+ " ");
        }

    }

}
