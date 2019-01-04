package main.java.com.core.collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> cat=new LinkedList<>();
        cat.add("Bars");
        cat.add("Mars");
        cat.add("Bob");

        for (String i:cat
             ) {
            System.out.print(i+ " ");
        }
    }
}
