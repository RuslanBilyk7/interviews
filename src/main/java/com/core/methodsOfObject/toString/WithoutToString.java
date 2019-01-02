package main.java.com.core.methodsOfObject.toString;

import java.util.Arrays;

public class WithoutToString {

    private String[] a = new String[5];

    public void setA() {
        a[0] = "Один";
        a[1] = "Два";
        a[2] = "Три";
        a[3] = "Четыре";
        a[4] = "Пять";
    }

    public static void main(String[] args) {
        WithoutToString sim = new WithoutToString();
        sim.setA();
        // Следующая строка выводит main.java.com.core.methodsOfObject.toString.WithoutToString@13b6d03  То есть это
//        toString без переопределения
//        System.out.println(sim.toString());

        //Следующая строка выводит [Ljava.lang.String;@13b6d03 То есть это тоже  toString без переопределения
        System.out.println(sim.a);
        System.out.println(Arrays.toString(sim.a));
    }
}
/*Как переопределить в классе Simple метод toString(), чтобы при создании объекта этого класса и при попытке распечатать массив, содержащийся в нем, выводилось содержание массива, а не хеш-код и чтобы не нужно было каждый раз писать System.out.println(Arrays.toString(sim.a));?*/