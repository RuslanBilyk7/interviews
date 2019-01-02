package main.java.com.core.methodsOfObject.toString;

import java.util.Arrays;

public class WithToString {
    private String[] a = new String[5];

    public void setA() {
        a[0] = "Один";
        a[1] = "Два";
        a[2] = "Три";
        a[3] = "Четыре";
        a[4] = "Пять";
    }

    @Override
    public String toString() {
        return Arrays.toString(a);
    }


    public static void main(String[] args) {
        WithToString sim = new WithToString();
        sim.setA();
        System.out.println(sim);
    }
}
