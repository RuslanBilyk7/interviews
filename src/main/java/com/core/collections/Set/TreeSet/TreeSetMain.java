package main.java.com.core.collections.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("ttt");
        ts.add("Ttt");
        ts.add("ggg");
        ts.add("aaa");
        ts.add("bbb");
        ts.add("_bbb");
        /*Ttt  _bbb  aaa  bbb   ggg   ttt */
        for (String s : ts
                ) {
            System.out.println(s + " ");
        }
        System.out.println();

        System.out.println(ts.size());
        System.out.println(ts.contains("ttt"));
        System.out.println();

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println();

        System.out.println(ts.higher("aaa"));
        System.out.println(ts.lower("aaa"));

        ts.remove("aaa");
        for (String s : ts
                ) {
            System.out.println(s);
        }
    }
}
