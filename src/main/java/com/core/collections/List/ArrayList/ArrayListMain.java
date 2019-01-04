package main.java.com.core.collections.List.ArrayList;

import java.util.ArrayList;

class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> deliveryCities = new ArrayList<>(10);
        deliveryCities.add("London");
        deliveryCities.add("Paris");
        deliveryCities.add("Toronto");
        deliveryCities.add("Toronto");

        deliveryCities.add(1, "Monaco");

        System.out.println("Number of cities " + deliveryCities.size() + "\n");
        for (String i : deliveryCities) {
            System.out.print(i + " ");//London Monaco Paris Toronto Toronto
        }
        System.out.println();

//         System.out.println(deliveryCities.get(3));//Toronto
//
//        System.out.println(deliveryCities.indexOf("Paris"));// 2
//        System.out.println(deliveryCities.indexOf("Lviv")); //  -1              not found
//
//        System.out.println(deliveryCities.contains("Paris"));// true
//        System.out.println(deliveryCities.contains("Lviv"));// false

//        deliveryCities.set(2,"Berlin");
//        for (String i:deliveryCities// London    Monaco     Berlin    Toronto  Toronto
//             ) {
//            System.out.print (i+ " ");
//        }
        deliveryCities.remove("Paris");// ore deliveryCities.remove(2);
        for (String i : deliveryCities
                ) {
            System.out.print(i + " ");  //London Monaco Toronto Toronto

        }
    }
}