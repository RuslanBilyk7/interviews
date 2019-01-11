package main.java.com.core.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//asList
/*The asList() method of java.util.Arrays class is used to return a fixed-size list backed by the specified array.*/
public class AsListAsArray {
//    public static void main (String args[]) {
//
//        // create an array of strings
//        String a[] = new String[]{"abc","klm","xyz","pqr"};
//
//        //array to list
//        List list1 = Arrays.asList(a);
//
//        // printing the list
//        System.out.println("The list is:" + list1);
//    }
//}


//    public static void main(String[] argv)
//            throws Exception
//    {
//
//        try {
//
//            // creating Arrays of String type
//            String a[] = new String[] { "A", "B", "C", "D" };
//
//            // getting the list view of Array
//            List<String> list = Arrays.asList(a);
//
//            // printing the list
//            System.out.println("The list is: " + list);
//        }
//
//        catch (NullPointerException e) {
//            System.out.println("Exception thrown : " + e);
//        }
//    }
//}

    //asArray
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
//        al.remove(10); //remove by index
//        al.remove("10");// remove by value
        Object[] objects = al.toArray();

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}
/*Note: toArray() method returns an array of type Object(Object[]). We need to typecast it to Integer before using as Integer objects. If we do not typecast, we get compilation error. */