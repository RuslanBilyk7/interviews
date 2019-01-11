package main.java.com.core.collections.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> cat = new LinkedList<>();
        cat.add("Bars");
        cat.add("Mars");
        cat.add("Bob");
        cat.add("Bobby");
        cat.add("Bob");
        cat.add(null);

        for (String i : cat
                ) {
            System.out.print(i + " ");
        }
        System.out.println();

        //LinkedList is a bidirectional list. So every item (node) has a reference to the next and
        //previous element.
        cat.add(3, "222");
        cat.add("1");


        //When we remove by value, the first found element with this value will be removed
        cat.remove("Bob");
        cat.remove(null);

        //To remove or add element by index or value it will take O(n) time.
        //But using ListIterator it will take O(1) time. Less time

//        Iterator iterator = cat.listIterator();
//        while (iterator.hasNext()) {
//            String in = (String) iterator.next();
//            if (in.equals("5")) {
//                iterator.remove();
//            }
//        }
        for (String i : cat
                ) {
            if (i.equals("5")) {//NullPointerException  because of the line   cat.add(null);
                cat.remove(i);
            }
            System.out.print(i + " ");
        }

    }

}

