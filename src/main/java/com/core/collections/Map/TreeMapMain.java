package main.java.com.core.collections.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
//        TreeMap<Integer,Integer> treeMap=new TreeMap<>(Comparator.reverseOrder());// to reverse order
        treeMap.put(1,100);
        treeMap.put(2,200);
        treeMap.put(4,400);
        treeMap.put(6,600);
        treeMap.put(3,300);
        treeMap.put(5,500);
//        treeMap.put(5,null);// it is ok
//        treeMap.put(null,500);  error key doesn't equal null
        System.out.println(treeMap);
        System.out.println(treeMap.size());
        if (treeMap.containsKey(5)){
            System.out.println("Good! 5 is here");
        }
        System.out.println(treeMap.get(5));
        System.out.println(treeMap.firstEntry()+" " +treeMap.lastEntry());
        System.out.println(treeMap.lowerEntry(3)+" "+ treeMap.higherEntry(4));//2=200   5=500
        Map.Entry<Integer, Integer> deleteFirst=treeMap.pollFirstEntry();
        System.out.println(deleteFirst);
//        System.out.println(treeMap.pollFirstEntry());
        Map.Entry<Integer, Integer> deleteLast=treeMap.pollLastEntry();
        System.out.println(deleteLast);
        System.out.println(treeMap);
        treeMap.clear();// delete all
        System.out.println(treeMap); //  {}
    }
}
