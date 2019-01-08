package main.java.com.core.collections.Set.HashSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//Set doesn't allow duplicates. HashSet contains hashMap inside and stores objects there
public class HashSetMain {
    public static void main(String[] args) {
        Set<String> hashSetMain = new HashSet<>();
        hashSetMain.add("One");
        hashSetMain.add("Two");
        hashSetMain.add("Three");
        hashSetMain.add("Three");// it will not be added
        System.out.println("Size " + hashSetMain.size());
        for (String s : hashSetMain
                ) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Creating a HashSet from another collection (ArrayList)
        LinkedList<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(1);

        Set<Integer> second = new HashSet<>(first);
        for (Integer s : second
                ) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(second.isEmpty()+ " "+ second.size()+" "+ second.contains(1));
        System.out.println();
        second.remove(1);

        System.out.println(second);
// Remove all elements matching a given predicate
        second.removeIf(num -> num % 2 == 0);
        System.out.println("After removeIf() => " + second);
    }
}
